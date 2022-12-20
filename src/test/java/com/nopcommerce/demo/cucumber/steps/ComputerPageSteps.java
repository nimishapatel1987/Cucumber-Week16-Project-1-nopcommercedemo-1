package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.ComputerPage1;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class ComputerPageSteps {
    @Given("^click On Computer$")
    public void clickOnComputer() {
    }

    @And("^User should click on Desktop$")
    public void userShouldClickOnDesktop() {
    }

    @Then("^verify the product name on alphabetical order$")
    public void verifyTheProductNameOnAlphabeticalOrder() {
    }

    @Given("^User should click on Computer$")
    public void userShouldClickOnComputer() {
    }

    @And("^User get select By Value$")
    public void userGetSelectByValue() {
    }

    @And("^User dhould click on Add To Cart$")
    public void userDhouldClickOnAddToCart() {
    }

    @And("^User should verify Build your own computer and Error message not displayed$")
    public void userShouldVerifyBuildYourOwnComputerAndErrorMessageNotDisplayed() {
    }

    @And("^User selectProcessorByValue$")
    public void userSelectProcessorByValue() {
        new ComputerPage1().selectProcessorByValue("5");
    }

    @And("^User select Ram By value$")
    public void userSelectRamByValue() {
        new ComputerPage1().selectRamByValue("5");
    }

    @And("^User click on HDD(\\d+)GB$")
    public void userClickOnHDDGB(int arg0) {
        new ComputerPage1().clickOnHDD400GB();
    }

    @And("^User click On Os Vista Premium$")
    public void userClickOnOsVistaPremium() {
        new ComputerPage1().clickOnOsVistaPremium();
    }

    @Then("^User should click On SoftwareTotalCommander$")
    public void userShouldClickOnSoftwareTotalCommander() {
        new ComputerPage1().clickOnSoftwareTotalCommander();
    }

    @And("^User clickOnAddToCartButton$")
    public void userClickOnAddToCartButton() {
    }

    @And("^User should closeMessageBar$")
    public void userShouldCloseMessageBar() {
    }

    @And("^User mouseHoverOnElementShoppingCart$")
    public void userMouseHoverOnElementShoppingCart() {
    }

    @And("^User click On Go To Cart$")
    public void userClickOnGoToCart() {
    }


    @And("^User should clearText In QuantityField$")
    public void userShouldClearTextInQuantityField() {
    }

    @And("^User should send Text To QuantityField$")
    public void userShouldSendTextToQuantityField() {
    }

    @And("^User click On Update Shopping Cart Button$")
    public void userClickOnUpdateShoppingCartButton() {
    }

    @And("^User should click on check box with Terms and condition$")
    public void userShouldClickOnCheckBoxWithTermsAndCondition() {
    }

    @And("^User clickOnCheckOutButton$")
    public void userClickOnCheckOutButton() {
    }

    @Then("^User verify the text \"([^\"]*)\"$")
    public void userVerifyTheText(String arg0) {
        new ComputerPage1().verifyWelcomeText();
    }

    @And("^User click On checkout As Guest$")
    public void userClickOnCheckoutAsGuest() {
    }

    @And("^User enter First Name \"([^\"]*)\"$")
    public void userEnterFirstName(String Firstname) {
        new ComputerPage1().sendTextToFirstNameField("Pari");
    }

    @And("^User enter Last Name \"([^\"]*)\"$")
    public void userEnterLastName(String Lastname) {
        new ComputerPage1().sendTextToLastNameField("Patel");
    }

    @And("^User enter Email \"([^\"]*)\"$")
    public void userEnterEmail(String arg0) {
        new ComputerPage1().sendTextToEmailField("paripatel123@gmail.com");
    }

    @And("^User enter company \"([^\"]*)\"$")
    public void userEnterCompany(String arg0) {
        new ComputerPage1().sendTextToCompanyField("123456");
    }

    @And("^User select CountryFromDropDown List$")
    public void userSelectCountryFromDropDownList() {
    }

    @And("^User enter city \"([^\"]*)\"$")
    public void userEnterCity(String arg0) {
        new ComputerPage1().sendTextToCityField("Cambridge");
    }

    @And("^User enter Address line (\\d+) \"([^\"]*)\"$")
    public void userEnterAddressLine(int arg0, String arg1) {
        new ComputerPage1().sendTextToAddressLine1("Hilton Road");
    }

    @And("^User enter Postcode \"([^\"]*)\"$")
    public void userEnterPostcode(String arg0) {
        new ComputerPage1().sendTextToPostcode("CB4 3NB");
    }

    @And("^User enter PhoneNumber \"([^\"]*)\"$")
    public void userEnterPhoneNumber(String arg0) {
        new ComputerPage1().sendTextToPhoneNumberField("01234567890");
    }

    @Then("^User clickOnContinueButton$")
    public void userClickOnContinueButton() {
    }

    @Then("^User click On NextDayAirButton$")
    public void userClickOnNextDayAirButton() {
    }

    @Then("^User click On continue Button Again$")
    public void userClickOnContinueButtonAgain() {
    }

    @Then("^User click On CreditCardButton$")
    public void userClickOnCreditCardButton() {
    }

    @And("^User should select MasterCardFromCreditCardDropdown \"([^\"]*)\"$")
    public void userShouldSelectMasterCardFromCreditCardDropdown(String arg0) {
    }

    @And("^User enter TextToCardHolderName \"([^\"]*)\"$")
    public void userEnterTextToCardHolderName(String arg0) {
        new ComputerPage1().sendTextTOCardHolderName("PPPatel");
    }

    @And("^User enter TextToCardNumber \"([^\"]*)\"$")
    public void userEnterTextToCardNumber(String arg0) {
        new ComputerPage1().sendTextTOCardNumber("1111222233334444");
    }

    @And("^User should select MonthAndYearFor CreditCardExpireData$")
    public void userShouldSelectMonthAndYearForCreditCardExpireData() {
    }

    @And("^User enter TextTocardcode \"([^\"]*)\"$")
    public void userEnterTextTocardcode(String arg0) {
        new ComputerPage1().sendTextToCardCode("675");
    }

    @Then("^User should verify Text(\\d+), \"([^\"]*)\", \"([^\"]*)\"$")
    public void userShouldVerifyText(int arg0, String arg1, String arg2) {
        new ComputerPage1().getVerifyText1();
        System.out.println("Error Message not displayed");
    }

    @And("^User click On Conform Button$")
    public void userClickOnConformButton() {
    }

    @Then("^User click On Continue Button(\\d+)$")
    public void userClickOnContinueButton(int arg0) {
    }
}
