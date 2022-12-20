Feature: ComputerPage Test
  As a User I want to go on computer page

  @smoke
  @regression
  Scenario: Verify Product Arrange in Alpha Batical Order
    Given click On Computer
    And User should click on Desktop
    Then verify the product name on alphabetical order

  @sanity
  @regression
  Scenario: verify product Added To ShoppingCart Successfully
    Given User should click on Computer
    And User should click on Desktop
    And User get select By Value
    And User dhould click on Add To Cart
    And User should verify Build your own computer and Error message not displayed
    And User selectProcessorByValue
    And User select Ram By value
    And User click on HDD400GB
    And User click On Os Vista Premium
    Then User should click On SoftwareTotalCommander
    And User clickOnAddToCartButton
    And User should closeMessageBar
    And User mouseHoverOnElementShoppingCart
    And User click On Go To Cart
    And User should clearText In QuantityField
    And User should send Text To QuantityField
    And User click On Update Shopping Cart Button
    And User should click on check box with Terms and condition
    And User clickOnCheckOutButton
    Then User verify the text "Welcome, Please Sign In!"
    And User click On checkout As Guest
    And User enter First Name "Pari"
    And User enter Last Name "Patel"
    And User enter Email "paripatel123@gmail.com"
    And User enter company "123456"
    And User select CountryFromDropDown List
    And User enter city "Cambridge"
    And User enter Address line 1 "Hilton Road"
    And User enter Address line 2 "Cambridge"
    And User enter Postcode "CB4 3NB"
    And User enter PhoneNumber "01234567890"
    Then User clickOnContinueButton
    And User click On NextDayAirButton
    And User click On continue Button Again
    And User click On CreditCardButton
    And User should select MasterCardFromCreditCardDropdown "MasterCard"
    And User enter TextToCardHolderName "PPPatel"
    And User enter TextToCardNumber "1111222233334444"
    And User should select MonthAndYearFor CreditCardExpireData
    And User enter TextTocardcode "675"
    Then User should verify Text1, "Credit Card", "Error Message not displayed"
    And User should verify Text2, "Next Day Air", "Error Message not displayed"
    And User click On Conform Button
    And User should verify Text4, "Checkout", "Error Message not displayed"
    And User should verify Text5, "Your order has been successfully processed!", "Error Message not displayed"
    Then User click On Continue Button3


