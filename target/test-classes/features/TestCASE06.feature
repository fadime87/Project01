Feature: TestCase06
  @haha
  Scenario: Add Product in Cart
    Given Go to url'https://www.jumia.co.ke/'
    Then CLICK alert WIndows
    And VERIFY that home PAGE is visible successfully
    Then Click "Official Stores" button
    And CLick " Phones " button
    Then Verify " Products found " is visiblee
    And Click "product"
    Then Click "ADD TO CART" buttonn
    Then Veryf "Product added succesfuly" that text