Feature: ElectronicsPage Test

  Scenario: verify User Should Navigate To cellphones Page Successfully
    Given User should mouseHoverOnElectronics
    And User should mouseHoverOnCellPhonesAnd click
    And User verifyTextCellPhones

    Scenario: verifyThatTheproductAddedSuccessfullyAndPlaceOrderSuccessfully
      Given User should mouseHoverOnElectronics
      And User should mouseHoverOnCellPhonesAnd click
      And User should clickOnListViewTab
      And User clickOnProductNameNokia
      And User verify TextNokiaLumia
      And User Verify Nokia Price
      And User clearQuantity
      And User should changeQuantityTo2 "2"
      And User clickOnAddToCartButton
      And User mouseHoverOnElementShoppingCart
      And User mousehoverAndclickOnGoToCart
      Then User verifyMessageShoppingCart, "Shopping cart", "Error message not displayed"
      Then User verifyQuantity, "(2)" "Error message not displayed"
      Then User verifyTotal, "$698.00", "Error message not displayed"
      And User clickOnCheckbox
      And User clickOnCheckout
      And User verifyTextWelcomePlease, "Welcome,Please Sign In!", "Error message not displayed"
      And User clickOnRegister
      And User verifyTextRegister, "Register","Error message not displayed"
      And User enterFirstNameField "<Pari>"
      And User enterLastNameField "<Patel>"
      And User enter EmailField "<paripatel1234@gmail.com>"
      And User enter passwordField "<123456>"
      And User enter confirmpasswordField "<123456>"
      And User should click on Register1
      And User click On continue
      And User should clickOnCheckbox1
      And User choild clickOnCheckOut1
      And User should click on countryByvisibleText "United Kingdom"
      And User sendTextToCity "Cambridge"
      And User sendTextToCity "Cambridge"
      And User sendTextToPostelcode "CB4 3NB"
      And User send TextToPhoneNumber "01234567890"


