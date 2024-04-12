package StepDefinitions;

import Pages._601_DialogContent;
import Pages._604_DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _601_StepDefinitions {

    _601_DialogContent dc1 = new _601_DialogContent();

    @When("Register button is clicked")
    public void registerButtonIsClicked() {
        dc1.myClick(dc1.registerButton);
    }

    @And("Enter {string}")
    public void enter(String arg0) {
        dc1.mySendKeys(dc1.firstName, arg0);
    }

    @And("Enter {string} \\(social security number)")
    public void enterSocialSecurityNumber(String arg0) {
    }

    @And("Enter the confirmation of password")
    public void enterTheConfirmationOfPassword() {
        dc1.mySendKeys(dc1.repeatedPassword, "<PASSWORD>");
    }

    @And("Click the register button")
    public void clickTheRegisterButton() {
        dc1.myClick(dc1.finalRegisterButton);
    }

    @Then("Should see {string} message")
    public void shouldSeeMessage(String arg0) {
        arg0 = "Your account was created successfully. You are now logged in.";
        dc1.verifyContainsText(dc1.successMessage, arg0);
    }

    @And("Enter first name {string}")
    public void enterFirstName(String arg0) {
        dc1.mySendKeys(dc1.firstName, arg0);
    }

    @And("Enter sur name{string}")
    public void enterSurName(String arg0) {
        dc1.mySendKeys(dc1.lastName, arg0);
    }

    @And("Enter address {string}")
    public void enterAddress(String arg0) {
        dc1.mySendKeys(dc1.address, arg0);
    }

    @And("Enter city {string}")
    public void enterCity(String arg0) {
        dc1.mySendKeys(dc1.city, arg0);
    }

    @And("Enter state {string}")
    public void enterState(String arg0) {
        dc1.mySendKeys(dc1.state, arg0);
    }

    @And("Enter zipcode {string}")
    public void enterZipcode(String arg0) {
        dc1.mySendKeys(dc1.zipcode, arg0);
    }

    @And("Enter ssn {string} \\(social security number)")
    public void enterSsnSocialSecurityNumber(String arg0) {
        dc1.mySendKeys(dc1.SSN, arg0);
    }

    @And("Enter username {string}")
    public void enterUsername(String arg0) {
        dc1.mySendKeys(dc1.username, arg0);
    }

    @And("Enter password {string}")
    public void enterPassword(String arg0) {
        dc1.mySendKeys(dc1.password, arg0);
    }

    @And("Enter the confirmation of {string}")
    public void enterTheConfirmationOf(String arg0) {
        dc1.mySendKeys(dc1.repeatedPassword, arg0);
    }
}
