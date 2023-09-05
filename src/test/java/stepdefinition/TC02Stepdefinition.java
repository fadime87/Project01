package stepdefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.TC01_page;
import utilities.ConfigReader;
import utilities.Driver;

public class TC02Stepdefinition {

    TC01_page tc01_page = new TC01_page();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Navigates to url'https:\\/\\/www.jumia.co.ke\\/'")
    public void navigates_to_url_https_www_jumia_co_ke() {
        Driver.getDriver().get(ConfigReader.getProperty("JumiaUrl"));
    }

    @Then("Click alert windows")
    public void click_alert_windows() {
       tc01_page.ClickXButon.click();
    }


    @Then("Verify that home page is visible successfullyss")
    public void verify_that_home_page_is_visible_successfullyss() {
        Assert.assertTrue(tc01_page.VerifyHomePageButton.isDisplayed());

    }

    @Then("Click on {string} buttons")
    public void click_on_buttons(String string) {
       tc01_page.AccountButton.click();
       tc01_page.SingInButton.click();
    }
    @Then("Enter {string} or {string} mm")
    public void enter_or_mm(String string, String string2) {
    tc01_page.Email2Button.sendKeys("fadimevurmazilhan@gmail.com");
    }
    @Then("Click on {string} buttonnm")
    public void click_on_buttonnm(String string) {
        tc01_page.ContinueButton1.click();
    }

    @Then("Enter click {string}")
    public void enter_click(String string) {
      tc01_page.PasswordButton.sendKeys("tahsinsevda");
    }
    @Then("Enter {string} buttonn")
    public void enter_buttonn(String string) {
       tc01_page.LoginButton.click();
    }
    @Then("Verify  that {string} is visible")
    public void verify_that_is_visible(String string) {
    Assert.assertTrue(tc01_page.Logged.isDisplayed());
    }







}
