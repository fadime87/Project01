package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.TC01_page;
import utilities.ConfigReader;
import utilities.Driver;

public class Testcase04Stepdefinition {
    TC01_page tc01_page = new TC01_page();

    @Given("Navigate too url {string}")
    public void navigate_too_url(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("JumiaUrl"));
    }

    @Then("Click Alert windowssss")
    public void click_alert_windowssss() {
       tc01_page.ClickXButon.click();
    }
    @Then("Verify THat Home page is visible successfully")
    public void verify_t_hat_home_page_is_visible_successfully() {
        Assert.assertTrue(tc01_page.VerifyHomePageButton.isDisplayed());
    }
    @Then("Click On {string} buttonsn")
    public void click_on_buttonsn(String string) {
       tc01_page.AccountButton.click();
       tc01_page.SingInButton.click();
    }
    @Then("Enter correct {string} and {string}")
    public void enter_correct_and(String string, String string2) {
        tc01_page.Email2Button.sendKeys("fadimevurmazilhan@gmail.com");
    }
    @Then("Click On {string} buttonsns")
    public void click_on_buttonsns(String string) {
       tc01_page.ContinueButton1.click();
    }
    @Then("Enter CLick {string}")
    public void enter_c_lick(String string) {
       tc01_page.PasswordButton.sendKeys("tahsinsevda");
    }
    @Then("Enter {string} buttonnm")
    public void enter_buttonnm(String string) {
       tc01_page.LoginButton.click();
    }
    @Then("Verify  That {string} is visible")
    public void verify_that_is_visible(String string) {
        Assert.assertTrue(tc01_page.Logged.isDisplayed());
    }
    @Then("Enter {string} Button")
    public void enter_button(String string) {
       tc01_page.LogoutButton.click();
    }

}
