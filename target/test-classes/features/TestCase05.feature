Feature:TestCase05
  @haydiins
  Scenario: Search Product
    Given Navigate to URL'https://www.jumia.co.ke/'
    Then CLICK alert windows
    And VERIFY that home page is visible successfully
    Then Click ON "product,brands and categories" button
    And Enter "product name" in search input and click search button
    Then Verify 'products found' is visible