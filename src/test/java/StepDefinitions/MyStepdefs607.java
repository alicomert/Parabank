package StepDefinitions;

import Pages.LeftNav;
import Pages._601_DialogContent;
import Pages._604_DialogContent;
import Pages._607_DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class MyStepdefs607 {

    _607_DialogContent dc = new _607_DialogContent();
    LeftNav ln = new LeftNav();


    @And("Navigate to the update contact info")
    public void navigateToTheUptadeContactInfo() {
        dc.myClick(ln.UpdateContact);
    }
    @When("The user enters new information in the relevant fields")
    public void theUserEntersNewInformationInTheRelevantFields() {
        dc.mySendKeys(dc.firstName,"SeikoX");
        dc.mySendKeys(dc.lastName,"SeikoXxX");
        dc.mySendKeys(dc.address,"Usa");
        dc.mySendKeys(dc.city,"BadOeynhausen");
        dc.mySendKeys(dc.state,"NRW");
        dc.mySendKeys(dc.zipCode,"32323");
        dc.mySendKeys(dc.phone,"01234567");
    }
    @Then("Click the update profile button to save user updates")
    public void clickTheUpdateProfileButtonToSaveUserUpdates() {
        dc.myClick(dc.savaButton);

    }



}
