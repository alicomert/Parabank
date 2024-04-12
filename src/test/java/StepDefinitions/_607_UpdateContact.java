package StepDefinitions;

import Pages._601_DialogContent;
import Pages._607_DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _607_UpdateContact {
    _601_DialogContent dc1 = new _601_DialogContent();
    _607_DialogContent dc2 = new _607_DialogContent();

    @And("User delete the Element from Dialog and Clear")
    public void userSendingTheKeysInDialogAndClearStirng(DataTable textBoxVeYazilar) {
        List<List<String>> listTxtYazi = textBoxVeYazilar.asLists(String.class);

        for (int i = 0; i < listTxtYazi.size(); i++) {
            WebElement txtBoxWebElemnt = dc2.getWebElement(listTxtYazi.get(i).get(0));
            txtBoxWebElemnt.clear();
            dc2.mySendKeys(txtBoxWebElemnt, listTxtYazi.get(i).get(1));
        }
    }

    @Then("User should See Profile Update Text")
    public void userShouldSeeProfileUpdateText() {
        dc2.verifyContainsText(dc2.profileUpdatetext,"Profile Updated");
    }
}