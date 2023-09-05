Feature: TC02
@hadiBakalim
  Scenario: Login User with correct email and password

   Given Navigates to url'https://www.jumia.co.ke/'
   Then Click alert windows
    Then Verify that home page is visible successfullyss
    And Click on "Account" buttons
   # Then Click on "Sing In" buttons
    And  Enter "email" or "Mobil Number" mm
    Then Click on "Continue" buttonnm
    And  Enter click "password"
    Then Enter 'Login' buttonn
   Then Verify  that "Logged in as username" is visible