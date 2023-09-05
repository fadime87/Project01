package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.TC01_page;
import utilities.ConfigReader;
import utilities.Driver;

public class TestCase05Stepdefinition {

    TC01_page tc01_page = new TC01_page();

    @Given("Navigate to URL'https:\\/\\/www.jumia.co.ke\\/'")
    public void navigate_to_url_https_www_jumia_co_ke() {
        Driver.getDriver().get(ConfigReader.getProperty("JumiaUrl"));
    }
    @Then("CLICK alert windows")
    public void click_alert_windows() {
        tc01_page.ClickXButon.click();
    }
    @Then("VERIFY that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(tc01_page.VerifyHomePageButton.isDisplayed());
    }
    @Then("Click ON {string} button")
    public void click_on_button(String string) {
       tc01_page.ProductButton.click();
    }
    @Then("Enter {string} in search input and click search button")
    public void enter_in_search_input_and_click_search_button(String string) {
      tc01_page.ProductButton.sendKeys("samsung galaxy s23");
      tc01_page.SearchButton.click();
    }
    @Then("Verify {string} is visible")
    public void verify_is_visible(String string) {
       Assert.assertTrue(tc01_page.ProductFoundTextVisible.isDisplayed());
    }

}
