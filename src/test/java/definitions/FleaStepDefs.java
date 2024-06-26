package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.Assertions.*;
import static support.TestContext.getDriver;

public class FleaStepDefs {
    @Given("I visit FLEA Market in the {string} Environment")
    public void iVisitFLEAMarketInTheEnvironment(String env) {
        if(env.equalsIgnoreCase("Stage")) {
            getDriver().get("http://store-stage.portnov.com/");
        } else if(env.equalsIgnoreCase("qa")) {
            getDriver().get("http://store-qa.portnov.com/");
        } else {
            System.out.println("BAD URL");
        }
    }
    @Then("I verify title is {string} for the page")
    public void iVerifyTitleIsForThePage(String title) {
        assertThat(getDriver().getTitle()).isEqualTo(title);
    }

    @Then("I verify title of the page contains {string}")
    public void iVerifyTitleOfThePageContains(String title) {
        assertThat(getDriver().getTitle()).containsIgnoringCase(title);
    }

    @When("I wait and click on a product {string} on the Landing Page")
    public void iClickOnAProductOnTheLandingPage(String product) {
        String xpath = "//img[@title='"+product +"']";
        WebDriverWait waits = new WebDriverWait(getDriver(), 10);
        waits.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        getDriver().findElement(By.xpath(xpath)).click();
        iVerifyTitleOfThePageContains(product);
        assertThat(getDriver().findElement(By.xpath("//*[text()='"+product+"']")).getText()).containsIgnoringCase(product);
    }

    @Then("I verify Cart Icon is present")
    public void iWaitForCartToAppear() {
        WebElement element = getDriver().findElement(By.xpath("//*[@id='site-header-cart']"));
        element.isDisplayed();
    }

    @Then("I verify Image Slider is present")
    public void iVerifyImageSliderIsPresent() {
        WebElement element = getDriver().findElement(By.xpath("//*[@class='swiper swiper-cube swiper-3d swiper-initialized swiper-horizontal swiper-pointer-events']"));
        element.isDisplayed();
    }

    public void WaitForElement(WebElement element) {
        new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOf(element));
    }

    @Then("I wait {int} sec")
    public void iWaitForSec(int sec) throws Exception {
        Thread.sleep(sec * 1000);
    }

    @Then("I verify Contact button functionality")
    public void iVerifyContactButtonFunctionality() throws Exception {
        getDriver().findElement(By.xpath("//div[@data-title='Contact Us']")).click();
        WebElement name = getDriver().findElement(By.xpath("//input[@name='name']"));
        WaitForElement(name);
        name.sendKeys("Tester");
        getDriver().findElement(By.xpath("//input[@name='email']")).sendKeys("test@test.com");
        getDriver().findElement(By.xpath("//textarea[@id='chaty-name']")).sendKeys("Blah Blah Blah");
        iWaitForSec(2);
        getDriver().findElement(By.xpath("//button[contains(text(), 'Send')]")).click();
        iWaitForSec(2);
        assertThat(getDriver().findElement(By.xpath("//div[@class='chaty-ajax-success-message']")).getText()).isEqualTo("Your message was sent successfully");
    }

    @When("I verify and Click on {string} Category on the Top Bar")
    public void iVerifyAndClickOnCategoryOnTheTopBar(String name) {
        WebElement category = getDriver().findElement(By.xpath("//ul[@id='menu-main']//a[text()='"+name+"']"));
        WaitForElement(category);
        category.click();
        iVerifyTitleOfThePageContains(name);
        assertThat(getDriver().findElement(By.xpath("//header//h1")).getText()).isEqualToIgnoringCase(name);
    }

    @When("I verify Description contains text {string}")
    public void iVerifyDescriptionContainsText(String text) {
        WebElement tabDescription = getDriver().findElement(By.xpath("//div[@id='tab-description']"));
        WaitForElement(tabDescription);
        assertThat(tabDescription.getText()).containsIgnoringCase(text);
    }

    @When("I add {string} items to Cart and verify Cart")
    public void iAddItemsToCartAndVerifyCart(String nums) {
        getDriver().findElement(By.xpath("//input[@name='quantity']")).clear();
        getDriver().findElement(By.xpath("//input[@name='quantity']")).sendKeys(nums);
        getDriver().findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
        getDriver().findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed();
    }

    @Then("I click on the Add to Cart button on the {string}")
    public void iClickOnTheAddToCartButtonOnThe(String product) throws Exception {
        WebElement btnAddToCart = getDriver().findElement(By.xpath("//a[@data-product_id='46']"));
        WaitForElement(btnAddToCart);
        btnAddToCart.click();
        iWaitForSec(3);

//        getDriver().findElement(By.xpath("//a[contains(text(),'iMac')]//../..//input[@class='input-text qty text']")).clear();
//        getDriver().findElement(By.xpath("//a[contains(text(),'iMac')]//../..//input[@class='input-text qty text']")).sendKeys("3");
//        getDriver().findElement(By.xpath("//button[@name='update_cart']")).click();
//        assertThat(getDriver().findElement(By.xpath("//a[contains(text(),'iMac')]//../..//input[@class='input-text qty text']")).equals("3"));
    }

 //   @Then("I click on the View Cart button")
//    public void iClickOnTheViewCartButton() {
//
//    }

    @Then("I verify the {string} is present in the cart")
    public void iVerifyTheIsPresentInTheCart(String product) {
        String xpath = "//a[contains(text(),'"+product +"')]";
        assertThat(getDriver().findElement(By.xpath(xpath)).isDisplayed());
        //getDriver().findElement(By.xpath("//a[contains(text(),'iMac')]")).isDisplayed();
    }

//    @Then("I increment the Qty counter to {string} and verify cart")
//    public void iIncrementTheQtyCounterToAndVerifyCart(String Qty) {
//        String xpath = "//a[contains(text(),'"+product +"']";
//        getDriver().findElement(By.xpath("//a[contains(text(),'iMac')]//../..//input[@class='input-text qty text']")).clear();
//        getDriver().findElement(By.xpath("//a[contains(text(),'iMac')]//../..//input[@class='input-text qty text']")).sendKeys(Qty);
//        getDriver().findElement(By.xpath("//button[@name='update_cart']")).click();
//        assertThat(getDriver().findElement(By.xpath("//a[contains(text(),'iMac')]//../..//input[@class='input-text qty text']")).equals(Qty));
//    }

    @Then("I increment the Qty counter to {string} for the {string} and verify cart")
    public void iIncrementTheQtyCounterToForTheAndVerifyCart(String Qty, String product) {
//        String xpath = "//a[contains(text(),'"+product +"')]//../..//input[@class='input-text qty text']";
//        getDriver().findElement(By.xpath(xpath)).clear();
//        getDriver().findElement(By.xpath(xpath)).sendKeys(Qty);

//        getDriver().findElement(By.xpath("//a[contains(text(),'iMac')]//../..//input[@class='input-text qty text']")).clear();
//        getDriver().findElement(By.xpath("//a[contains(text(),'iMac')]//../..//input[@class='input-text qty text']")).sendKeys(Qty);
//        getDriver().findElement(By.xpath("//button[@name='update_cart']")).click();
//        assertThat(getDriver().findElement(By.xpath("//a[contains(text(),'iMac')]//../..//input[@class='input-text qty text']")).equals(Qty));
    }

    @Then("I increment the Qty counter to {string} for the {string}")
    public void iIncrementTheQtyCounterToForThe(String Qty, String product) {
        String xpath = "//a[contains(text(),'"+product +"')]//../..//input[@class='input-text qty text']";
        getDriver().findElement(By.xpath(xpath)).clear();
        getDriver().findElement(By.xpath(xpath)).sendKeys(Qty);
    }

    @Then("I click on the UpdateCart button")
    public void iClickOnTheUpdateCartButton() throws Exception {
        getDriver().findElement(By.xpath("//button[@name='update_cart']")).click();
        iWaitForSec(3);
        assertThat(getDriver().findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
    }

    @Then("I wait and click on the View Cart button")
    public void iWaitAndClickOnTheViewCartButton() {
        WebElement btnViewCart = getDriver().findElement(By.xpath("//a[@class='added_to_cart wc-forward']"));
        WaitForElement(btnViewCart);
        btnViewCart.click();
    }

    @Then("I remove the {string} from the cart")
    public void iRemoveTheFromTheCart(String product) {
        String xpath = "//a[contains(text(),'"+product +"')]//../..//a[@class='remove']";
        getDriver().findElement(By.xpath(xpath)).click();
    }

    @Then("I verify the {string} is removed from the cart")
    public void iVerifyTheIsRemovedFromTheCart(String product) {

        String msg = "\""+product+"\" removed.Undo?";
        String wooMsg = getDriver().findElement(By.xpath("//div[@class='woocommerce-message']")).getText();
        assertThat(msg.equalsIgnoreCase(wooMsg));
    }
}
