package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps {
    @Given("^User is selectMenu$")
    public void userIsSelectMenu() {
        new HomePage().selectMenu("");
    }

    @And("^User verify Computer$")
    public void userVerifyComputer() {
        new HomePage().getVerifyComputer();
    }

    @And("^User verify Electronics$")
    public void userVerifyElectronics() {
        new HomePage().getVerifyElectronics();
    }

    @Then("^User verify Apparel$")
    public void userVerifyApparel() {
        new HomePage().getVerifyApparel();
    }
}
