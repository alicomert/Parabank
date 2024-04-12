package StepDefinitions;

import Pages._604_DialogContent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs602 {

    _604_DialogContent dc4 = new _604_DialogContent();

    @Then("User should not login successfully")
    public void userShouldNotLoginSuccessfully() {

        dc4.verifyContainsText(dc4.failLogin,"could not be verified");
    }

    @When("Enter invalid username and password and click login button")
    public void enterInvalidUsernameAndPasswordAndClickLoginButton() {
        dc4.mySendKeys(dc4.username,"asd");
        dc4.mySendKeys(dc4.password,"asd");
        dc4.myClick(dc4.LoginButton);
    }
}
