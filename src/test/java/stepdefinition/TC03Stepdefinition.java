package stepdefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.TC01_page;
import utilities.ConfigReader;
import utilities.Driver;

public class TC03Stepdefinition {
    TC01_page tc01_page = new TC01_page();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Navigate to Url'https:\\/\\/www.jumia.co.ke\\/'")
    public void navigate_to_url_https_www_jumia_co_ke() {
        Driver.getDriver().get(ConfigReader.getProperty("JumiaUrl"));
    }

    @Then("Click Alert windows")
    public void click_alert_windows() {
        tc01_page.ClickXButon.click();
    }
    @Then("Verify That Home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(tc01_page.VerifyHomePageButton.isDisplayed());
    }
    @Then("Click On {string} button")
    public void click_on_button(String string) {
       tc01_page.AccountButton.click();
       tc01_page.SingInButton.click();
    }
    @Then("Enter incorrect {string} and {string}")
    public void enter_incorrect_and(String string, String string2) {
        tc01_page.Email2Button.sendKeys("hhhhh@gmail.com");
    }

    @Then("Click On {string} buttons")
    public void click_on_buttons(String string) {
       tc01_page.ContinueButton1.click();
    }


    @Then("Emter incorrect {string}")
    public void emter_incorrect(String string) {
        tc01_page.PasswordButton.sendKeys("12345");
    }
    @Then("Enter\"Login\" button")
    public void enter_login_button() {
       tc01_page.LoginButton.click();
    }
    @Then("Verify error {string} is visible")
    public void verify_error_is_visible(String string) {
        Assert.assertTrue(tc01_page.VerfyErrorText.isDisplayed());
    }
}
