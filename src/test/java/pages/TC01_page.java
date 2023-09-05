package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC01_page {

    public TC01_page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

      @FindBy(xpath = "(//button[@class='cls'])[3]")
      public WebElement ClickXButon;

    @FindBy(xpath = "//div[@class='col3 -df -i-ctr']")
    public WebElement VerifyHomePageButton;



//********
     @FindBy(xpath = "(//label[@class='trig -df -i-ctr -fs16'])[1]")
      public WebElement AccountButton;

    @FindBy(xpath = "//a[@class='btn _prim -fw _md']")
    public WebElement SingInButton;

    @FindBy(xpath = "//input[@id='input_identifierValue']")
    public WebElement Email2Button;

    @FindBy(xpath = "//button[@class='mdc-button mdc-button--touch mdc-button--raised access-btn']")
    public WebElement ContinueButton1;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement PasswordButton;

    @FindBy(xpath = "//input[@aria-labelledby='confirm-password']")
    public WebElement ConfirmPasswordButton;

    @FindBy(xpath = "//button[@class='mdc-button mdc-button--touch mdc-button--raised mdc-ripple-upgraded']")
    public WebElement LoginButton;

    @FindBy(xpath = "//button[@class='mdc-button mdc-button--touch mdc-button--raised to-personal-details mdc-ripple-upgraded']")
    public WebElement ContinueButton2;

    @FindBy(xpath = "//input[@id='input_first_name']")
    public WebElement FirstNameButton;

    @FindBy(xpath = "//input[@id='input_last_name']")
    public WebElement LastNameButton;

    @FindBy(xpath = "(//div[@class='mdc-select__anchor'])[1]")
    public WebElement PrefixButton;

    @FindBy(xpath = "//input[@name='phone[number]']")
    public WebElement PhoneNumberButton;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement ContinueButton3;

    @FindBy(xpath = "//input[@id='input_gender']")
    public WebElement GenderButton;

    @FindBy(xpath = "(//li[@class='mdc-deprecated-list-item mdc-deprecated-list-item--selected'])[2]")
    public WebElement FemaleButton;

    @FindBy(xpath = "(//span[@class='mdc-notched-outline__notch'])[8]")
    public WebElement BirthDateButton;

    @FindBy(xpath = "//input[@id='acceptTC']")
    public WebElement AcceptButton;

    @FindBy(xpath = "//button[@id='confirmBtn']")
    public WebElement ContinueButton4;

    @FindBy(xpath = "(//label[@class='trig -df -i-ctr -fs16'])[1]")
    public WebElement Logged;

    @FindBy(xpath = "//div[@class='mdc-text-field-helper-text mdc-text-field-helper-text--validation-msg password']")
    public WebElement VerfyErrorText;
    

    @FindBy(xpath = "//button[@class='btn _def -mvs']")
    public WebElement LogoutButton;

  // ************
    @FindBy(xpath = "//input[@id='fi-q']")
    public WebElement ProductButton;

    @FindBy(xpath = "//button[@class='btn _prim _md -mls -fsh0']")
    public WebElement SearchButton;

    @FindBy(xpath = "//p[@class='-gy5 -phs']")
    public WebElement ProductFoundTextVisible;

}
