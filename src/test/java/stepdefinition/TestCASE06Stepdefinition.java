package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TC01_page;
import utilities.ConfigReader;
import utilities.Driver;

public class TestCASE06Stepdefinition {
    TC01_page tc01_page = new TC01_page();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Go to url'https:\\/\\/www.jumia.co.ke\\/'")
    public void go_to_url_https_www_jumia_co_ke() {
        Driver.getDriver().get(ConfigReader.getProperty("JumiaUrl"));
    }

    @Then("CLICK alert WIndows")
    public void click_alert_w_indows() {
      tc01_page.ClickXButon.click();
    }
    @Then("VERIFY that home PAGE is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(tc01_page.VerifyHomePageButton.isDisplayed());

    }

    @Then("Click {string} button")
    public void click_button(String string) {
       tc01_page.OfficialStoresButton.click();
    }

    @Then("CLick {string} button")
    public void c_lick_button(String string) {
       tc01_page.PhonesButton.click();
    }

    @Then("Verify {string} is visiblee")
    public void verify_is_visiblee(String string) {
        Assert.assertTrue(tc01_page.VerifyPhoneFoundText.isDisplayed());
    }
    @Then("Click {string}")
    public void click(String string) throws InterruptedException {
       Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
       tc01_page.SelectPhoneProduct.click();
    }

    @Then("Click {string} buttonn")
    public void click_buttonn(String string) {
       tc01_page.AddToCartButton.click();
    }

    @Then("Veryf {string} that text")
    public void veryf_that_text(String string) {
     Assert.assertTrue(tc01_page.VerifyAddSuccesfulyText.isDisplayed());
    }







}
