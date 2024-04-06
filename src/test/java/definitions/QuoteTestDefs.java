package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static support.TestContext.getDriver;

public class QuoteTestDefs {
    @Given("I visit Quote Page in the {string} Environment")
    public void iVisitQuotePageInTheEnvironment(String sEnvironment) {
        System.out.println(sEnvironment);
        if (sEnvironment.equals("Stage"))
            getDriver().get("https://quote-stage.portnov.com/");
        else if (sEnvironment.equals("QA"))
            getDriver().get("https://quote-qa.portnov.com/");
    }

    @Then("I enter {string} in the UserName field")
    public void iEnterInTheUserNameField(String sUserName) {
        WebElement userName = getDriver().findElement(By.xpath("//input[@id='name']"));
        if(userName != null)
            userName.sendKeys(sUserName);
    }

    @And("I enter {string} for the first name and {string} for the last name in the Name field")
    public void iEnterForTheFirstNameAndForTheLastNameInTheNameField(String sFirstName, String sLastName) {
        WebElement firstName = getDriver().findElement(By.xpath("//input[@id='firstName']"));
        firstName.sendKeys(sFirstName);
        WebElement middleName = getDriver().findElement(By.xpath("//input[@id='middleName']"));
        middleName.sendKeys("");
        WebElement lastName = getDriver().findElement(By.xpath("//input[@id='lastName']"));
        firstName.sendKeys(sLastName);
        WebElement saveBtn = getDriver().findElement(By.xpath("//span[contains(text(),'Save')]"));
        saveBtn.click();

        getDriver().switchTo().parentFrame();
        String Name = getDriver().findElement(By.xpath("//input[@id='name']")).getText();
        System.out.println(Name);
        assert Name.equals(sFirstName+sLastName);
    }
}
