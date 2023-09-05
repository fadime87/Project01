Feature: TC03
  @hadiOluyorIns
  Scenario: Login User with incorrect email and password
    Given Navigate to Url'https://www.jumia.co.ke/'
    Then Click Alert windows
    And Verify That Home page is visible successfully
    Then Click On "Account" button
    And Enter incorrect "email" and "mobile number"
    And Click On "Continue" buttons
    Then Emter incorrect "password"
    And Enter"Login" button
    Then Verify error "Wrong password. Try again or click 'Forgot Password?' to reset it." is visible