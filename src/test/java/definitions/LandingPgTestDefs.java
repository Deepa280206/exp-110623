package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class LandingPgTestDefs {

//    @Then("I verify the Product categories")
//    public void iVerifyTheProductCategories() {
//        WebElement elementMac = getDriver().findElement(By.xpath("//ul[@id='menu-main']//a[contains(text(), 'Mac')]"));
//        if(elementMac.isDisplayed())
//            System.out.println("Verified Mac menu item");
//        elementMac.click();
//
//        WebElement elementiPhone = getDriver().findElement(By.xpath("//ul[@id='menu-main']//a[contains(text(), 'iPhone')]"));
//        if(elementiPhone.isDisplayed())
//            System.out.println("Verified iPhone menu item");
//        elementiPhone.click();
//
//        WebElement elementWatch = getDriver().findElement(By.xpath("//ul[@id='menu-main']//a[contains(text(), 'Watch')]"));
//        if(elementWatch.isDisplayed())
//            System.out.println("Verified Watch menu item");
//        elementWatch.click();
//
//        WebElement elementAccessories = getDriver().findElement(By.xpath("//ul[@id='menu-main']//a[contains(text(), 'Accessories')]"));
//        if(elementAccessories.isDisplayed())
//            System.out.println("Verified Accessories menu item");
//        elementAccessories.click();
//    }
//
//    @Then("I verify the Cart Icon")
//    public void iVerifyTheCartIcon() {
//        WebElement cartIcon = getDriver().findElement(By.xpath("//li/a[@class='cart-contents']"));
//        if(cartIcon.isDisplayed())
//            System.out.println("Cart Icon is displayed");
//    }
//
//    @Then("I verify the Image Slider")
//    public void iVerifyTheImageSlider() {
//        WebElement imageSlider = getDriver().findElement(By.xpath("//div[@class='swiper-wrapper']"));
//        if(imageSlider.isDisplayed())
//            System.out.println("imageSlider Icon is displayed");
//    }
//
//    @Then("I verify the Contact button")
//    public void iVerifyTheContactButton() {
//        WebElement ContactBtn = getDriver().findElement(By.xpath("//div[@data-title='Contact Us']"));
//        if(ContactBtn.isDisplayed())
//            System.out.println("ContactBtn Icon is displayed");
//    }
//
//    @Given("I visit Flea Market in the {string} environment")
//    public void iVisitFleaMarketInTheEnvironment(String env) {
//        if(env.equalsIgnoreCase("Stage")) {
//            getDriver().get("http://store-stage.portnov.com/");
//        } else if(env.equalsIgnoreCase("qa")) {
//            getDriver().get("http://store-qa.portnov.com/");
//        } else {
//            System.out.println("BAD URL");
//        }
//    }
//
//    @Then("I verify the Page title is {string}")
//    public void iVerifyThePageTitleIs(String title) {
//        assertThat(getDriver().getTitle()).isEqualTo(title);
//    }
//
//    @Then("I verify the {string} category")
//    public void iVerifyTheCategory(String name) {
//        WebElement category = getDriver().findElement(By.xpath("//ul[@id='menu-main']//a[text()='"+name+"']"));
//        WaitForElement(category);
//        category.click();
//        iVerifyTitleOfThePageContains(name);
//        assertThat(getDriver().findElement(By.xpath("//header//h1")).getText()).isEqualToIgnoringCase(name);
//    }
//
//    public void WaitForElement(WebElement element) {
//        new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOf(element));
//    }
//
//    @Then("I verify title of the page contains {string}")
//    public void iVerifyTitleOfThePageContains(String title) {
//        assertThat(getDriver().getTitle()).containsIgnoringCase(title);
//    }
}
