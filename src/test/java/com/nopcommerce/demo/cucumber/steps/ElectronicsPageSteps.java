package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.ElectronicsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ElectronicsPageSteps {
    @Given("^User should mouseHoverOnElectronics$")
    public void userShouldMouseHoverOnElectronics() {
        new ElectronicsPage().mouseHoverOnElectronics();
    }

    @And("^User should mouseHoverOnCellPhonesAnd click$")
    public void userShouldMouseHoverOnCellPhonesAndClick() {
        new ElectronicsPage().mouseHoverOnCellPhonesAndClick();
    }

    @And("^User verifyTextCellPhones$")
    public void userVerifyTextCellPhones() {
        new ElectronicsPage().verifyTextCellPhones();
    }

    @And("^User should clickOnListViewTab$")
    public void userShouldClickOnListViewTab() {
        new ElectronicsPage().clickOnListViewTab();
    }

    @And("^User clickOnProductNameNokia$")
    public void userClickOnProductNameNokia() {
        new ElectronicsPage().clickOnProductNameNokia();
    }

    @And("^User verify TextNokiaLumia$")
    public void userVerifyTextNokiaLumia() {
        new ElectronicsPage().verifyTextNokiaLumia();
    }

    @And("^User Verify Nokia Price$")
    public void userVerifyNokiaPrice() {
        new ElectronicsPage().verifyNokiaPrice();
    }

    @And("^User clearQuantity$")
    public void userClearQuantity() {
        new ElectronicsPage().clearQuantity();
    }

    @And("^User should changeQuantityTo(\\d+) \"([^\"]*)\"$")
    public void userShouldChangeQuantityTo(int arg0, String arg1) {
        new ElectronicsPage().changeQuantityTo2("2");

    }

    @And("^User mousehoverAndclickOnGoToCart$")
    public void userMousehoverAndclickOnGoToCart() {
    }

    @Then("^User verifyMessageShoppingCart, \"([^\"]*)\", \"([^\"]*)\"$")
    public void userVerifyMessageShoppingCart(String arg0, String arg1) {
        new ElectronicsPage().verifyMessageShoppingCart();
    }

    @Then("^User verifyQuantity, \"([^\"]*)\" \"([^\"]*)\"$")
    public void userVerifyQuantity(String arg0, String arg1)  {
        new ElectronicsPage().verifyQuantity();
    }

    @Then("^User verifyTotal, \"([^\"]*)\", \"([^\"]*)\"$")
    public void userVerifyTotal(String arg0, String arg1) {
        new ElectronicsPage().verifyTotal();
    }

    @And("^User clickOnCheckbox$")
    public void userClickOnCheckbox() {
        new ElectronicsPage().clickOnCheckbox();
    }

    @And("^User clickOnCheckout$")
    public void userClickOnCheckout() {
        new ElectronicsPage().clickOnCheckout();
    }

    @And("^User verifyTextWelcomePlease, \"([^\"]*)\", \"([^\"]*)\"$")
    public void userVerifyTextWelcomePlease(String arg0, String arg1) {
        new ElectronicsPage().verifyTextWelcomePlease();
    }

    @And("^User clickOnRegister$")
    public void userClickOnRegister() {
        new ElectronicsPage().clickOnRegister();
    }

    @And("^User verifyTextRegister, \"([^\"]*)\",\"([^\"]*)\"$")
    public void userVerifyTextRegister(String arg0, String arg1)  {
        new ElectronicsPage().verifyTextRegister();
    }

    @And("^User enterFirstNameField \"([^\"]*)\"$")
    public void userEnterFirstNameField(String name) {
        new ElectronicsPage().sendTextToFirstNameField("Pari");
    }

    @And("^User enterLastNameField \"([^\"]*)\"$")
    public void userEnterLastNameField(String name) {
        new ElectronicsPage().sendTextToLastNameField("Patel");
    }

    @And("^User enter EmailField \"([^\"]*)\"$")
    public void userEnterEmailField(String email) {
        new ElectronicsPage().sendTextToEmailField("paripatel234@gmail.com");
    }

    @And("^User enter passwordField \"([^\"]*)\"$")
    public void userEnterPasswordField(String password) {
        new ElectronicsPage().sendTextToPasswordField("123456");
    }

    @And("^User enter confirmpasswordField \"([^\"]*)\"$")
    public void userEnterConfirmpasswordField(String confirmpassword) {
        new ElectronicsPage().sendTextToConfirmPasswordField("123456");
    }

    @And("^User should click on Register(\\d+)$")
    public void userShouldClickOnRegister(int arg0) {
        new ElectronicsPage().clickOnRegister();
    }

    @And("^User click On continue$")
    public void userClickOnContinue() {
        new ElectronicsPage().clickOnContinue();
    }

    @And("^User should clickOnCheckbox(\\d+)$")
    public void userShouldClickOnCheckbox(int arg0) {
        new ElectronicsPage().clickOnCheckbox();
    }

    @And("^User choild clickOnCheckOut(\\d+)$")
    public void userChoildClickOnCheckOut(int arg0) {
        new ElectronicsPage().clickOnCheckout();
    }

    @And("^User should click on countryByvisibleText \"([^\"]*)\"$")
    public void userShouldClickOnCountryByvisibleText(String arg0)  {
        new ElectronicsPage().countryByVisibleText("United Kingdom");
    }

    @And("^User sendTextToCity \"([^\"]*)\"$")
    public void userSendTextToCity(String city) {
        new ElectronicsPage().sendTextToCity("Cambridge");
    }

    @And("^User sendTextToPostelcode \"([^\"]*)\"$")
    public void userSendTextToPostelcode(String postelcode) {
        new ElectronicsPage().sendTextToPostelCode("CB4 3NB");
    }

    @And("^User send TextToPhoneNumber \"([^\"]*)\"$")
    public void userSendTextToPhoneNumber(String phonenumber) {
        new ElectronicsPage().sendTextToPhoneNumber("01234567890");
    }
}
