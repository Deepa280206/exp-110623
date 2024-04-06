package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;
import java.lang.Thread;

public class QuoteTestsHWDefs {
    @Given("I visit Quote page in the {string} Environment")
    public void iVisitQuotePageInTheEnvironment(String sEnvironment) {

        System.out.println(sEnvironment);
        if (sEnvironment.equals("Stage"))
            getDriver().get("https://quote-stage.portnov.com/");
        else if (sEnvironment.equals("QA"))
            getDriver().get("https://quote-qa.portnov.com/");
    }

    @And("I enter {string} for first name and {string} for the last name in the Name field")
    public void iEnterForFirstNameAndForTheLastNameInTheNameField(String firstName, String lastName) {
        getDriver().findElement(By.xpath("//input[@name='name']")).click();
        WebElement elFirstName = getDriver().findElement(By.xpath("//input[@id='firstName']"));
        elFirstName.sendKeys(firstName);
        WebElement elMiddleName = getDriver().findElement(By.xpath("//input[@id='middleName']"));
        elMiddleName.sendKeys("");
        WebElement elLastName = getDriver().findElement(By.xpath("//input[@id='lastName']"));
        elLastName.sendKeys(lastName);
        WebElement saveBtn = getDriver().findElement(By.xpath("//span[contains(text(),'Save')]"));
        saveBtn.click();

        getDriver().switchTo().defaultContent();
    }

    @When("I enter {string} for the Username field")
    public void iEnterForTheUsernameField(String username) {
        WebElement elUserName = getDriver().findElement(By.xpath("//input[@name='username']"));
        if(elUserName != null)
            elUserName.sendKeys(username);
    }

    @And("I enter {string} for the Email field")
    public void iEnterForTheEmailField(String email) {
        WebElement elEmail = getDriver().findElement(By.xpath("//input[@name='email']"));
        if(elEmail != null)
            elEmail.sendKeys(email);
    }

    @When("I enter {string} for the Password field")
    public void iEnterForThePasswordField(String password) {
        WebElement elPassword = getDriver().findElement(By.xpath("//input[@name='password']"));
        if(elPassword != null)
            elPassword.sendKeys(password);
    }

    @And("I enter {string} for the Confirm Password field")
    public void iEnterForTheConfirmPasswordField(String password) {
        WebElement elPassword = getDriver().findElement(By.xpath("//input[@name='confirmPassword']"));
        if(elPassword != null)
            elPassword.sendKeys(password);
    }

    @Then("I {string} the Privacy Policy Policy checkbox")
    public void iCheckPrivacyPolicyCheckbox(String check) {
        if (check != null && check.equals("check")) {
            WebElement elPrivacyChkBox = getDriver().findElement(By.xpath("//input[@name='agreedToPrivacyPolicy']"));
            if (elPrivacyChkBox != null)
                elPrivacyChkBox.click();
        }

    }

    @When("I click on the {string} button at the bottom of the page")
    public void iClickOnTheButtonAtTheBottomOfThePage(String submit) throws InterruptedException {
        if (submit != null && submit.equals("Submit")) {
            WebElement elSubmitBtn = getDriver().findElement(By.xpath("//button[@id='formSubmit']"));
            if (elSubmitBtn != null) {
                elSubmitBtn.click();
                getDriver().findElement(By.xpath("//legend[@class='applicationResult']")).isDisplayed();
            }
        }
    }

//    @Then("I verify {string} is Username field")
//    public void iVerifyIsUsernameField(String username) {
//        WebElement elUsername = getDriver().findElement(By.xpath("//b[@name='username']"));
//        if(elUsername != null)
//        {
//           String sUserName = elUsername.getText();
//           System.out.println(sUserName);
//       }
//    }

    @Then("I verify {string},{string},{string},{string},{string} fields")
    public void iVerifyFields(String username, String firstName, String lastName, String email, String password) throws InterruptedException {

        boolean bValid = true;
        WebElement elAppResult = getDriver().findElement(By.xpath("//legend[@class='applicationResult']"));
        assertThat(!elAppResult.equals(null));

        if(elAppResult != null)
        {
            //Verifying username
           WebElement elUserName = getDriver().findElement(By.xpath("//b[@name='username']"));
           assertThat(!elUserName.equals(null));
           if(elUserName != null)
           {
              String sUserName = elUserName.getText();
              System.out.println(sUserName);
              if(!sUserName.equals(username))
                  System.out.println("Displayed UserName does not match with the UserName entered by the user.");
           }

           //Verifying firstname
            WebElement elFirstName = getDriver().findElement(By.xpath("//b[@name='firstName']"));
           assertThat(!elFirstName.equals(null));
            if(elFirstName != null)
            {
                String sFirstName = elFirstName.getText();
                System.out.println(sFirstName);
                if(!sFirstName.equals(firstName))
                    System.out.println("Displayed FirstName does not match with the First Name entered by the user.");
            }

            //Verifying lastname
            WebElement elLastName = getDriver().findElement(By.xpath("//b[@name='lastName']"));
            assertThat(!elLastName.equals(null));
            if(elLastName != null)
            {
                String sLastName = elLastName.getText();
                System.out.println(sLastName);
                if(!sLastName.equals(lastName))
                    System.out.println("Displayed LastName does not match with the LastName entered by the user.");
            }

            //Verifying Email
            WebElement elEmail = getDriver().findElement(By.xpath("//b[@name='email']"));
            assertThat(!elEmail.equals(null));
            if(elEmail != null)
            {
                String sEmail = elEmail.getText();
                System.out.println(sEmail);
                if(!sEmail.equals(email))
                    System.out.println("Displayed Email does not match with the Email entered by the user.");
            }

            //Verifying password
            WebElement elPassword = getDriver().findElement(By.xpath("//b[@name='password']"));
            assertThat(!elPassword.equals(null));
            assertThat(!elPassword.equals(null));

            if(elPassword != null)
            {
                String sPassword = elPassword.getText();
                System.out.println(sPassword);
                if(sPassword.isEmpty())
                    System.out.println("Displayed password does not match with the Password entered by the user.");
            }

            if(bValid)
                System.out.println("Verified UserName,FirstName,LastName,Email and Password fields");
        }
    }
}
