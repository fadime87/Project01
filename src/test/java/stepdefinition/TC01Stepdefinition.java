package stepdefinition;



import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.TC01_page;
import utilities.ConfigReader;
import utilities.Driver;


public class TC01Stepdefinition {

    TC01_page tc01_page = new TC01_page();
    Faker faker = new Faker();
    Actions actions=new Actions(Driver.getDriver());
    Select select;



    @Given("Navigate to url {string}")
    public void navigate_to_url(String JumiaUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("JumiaUrl"));

    }

    @Then("Click alert window")
    public void click_alert_window() throws InterruptedException {

         tc01_page.ClickXButon.click();
    }

    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
      Assert.assertTrue(tc01_page.VerifyHomePageButton.isDisplayed());

    }

    @Then("Click on {string} button")
    public void click_on_button(String string) {
        tc01_page.AccountButton.click();
        tc01_page.SingInButton.click();
    }

   @Then("Enter {string} or {string}")
   public void enter_or(String string, String string2) {
       tc01_page.Email2Button.sendKeys(faker.internet().emailAddress());
   }

    @Then("Click on {string} buttonn")
    public void click_on_buttonn(String string) {
        tc01_page.ContinueButton1.click();
    }
    @Then("Enter {string} and {string}")
    public void enter_and(String string, String string2) {
      actions.click(tc01_page.PasswordButton)
                      .sendKeys("s100")
              .perform();
          actions.click(tc01_page.ConfirmPasswordButton)
                  .sendKeys("s100")
                  .perform();

    }
    @Then("Click on {string} buttonnn")
    public void click_on_buttonnn(String string) throws InterruptedException {
      Thread.sleep(3000);
       tc01_page.ContinueButton2.click();
    }

    @Then("Enter {string}")
    public void enter(String string) {
        tc01_page.FirstNameButton.sendKeys(faker.name().firstName());
    }

    @Then("Enterr {string}")
    public void enterr(String string) {
       tc01_page.LastNameButton.sendKeys(faker.name().lastName());
    }

    @Then("Enterrr {string}")
    public void enterrr(String string) {
        actions.click(tc01_page.PrefixButton)
                .sendKeys("+254")
                .perform();
        actions.click(tc01_page.PhoneNumberButton)
                .sendKeys("750275701")
                .perform();

    }


    @Then("Click on {string} buttonnnn")
    public void click_on_buttonnnn(String string) throws InterruptedException {
       Thread.sleep(3000);
        tc01_page.ContinueButton3.click();
    }

    @Then("Enterrrr {string}")
    public void enterrrr(String string) throws InterruptedException {
      // tc01_page.GenderButton.click();
     //  Thread.sleep(3000);
        tc01_page.GenderButton.click();
        select=new Select(tc01_page.GenderButton);

        select.selectByIndex(1);
        Thread.sleep(3000);
        tc01_page.FemaleButton.click();
        Thread.sleep(3000);
       // select.selectByVisibleText("Option 2");
       // tc01_page.FemaleButton.click();
       // tc01_page.GenderButton.sendKeys("Female");

    }


}
