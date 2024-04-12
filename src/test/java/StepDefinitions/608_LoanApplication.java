package StepDefinitions;

import Pages.LeftNav;
import Pages._608_DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _608_LoanApplication {
        _608_DialogContent dc8=new _608_DialogContent();

    @Given("Navigate to ParaBanka")
    public void navigateToParaBank() {

        System.out.println("System open");
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("Enter username and password and click login buttonss")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dc8.mySendKeys(dc8.username,"bob");
        dc8.mySendKeys(dc8.password,"123456");
        dc8.myClick(dc8.LoginButton);
    }

    @Then("User should login successfullys")
    public void userShouldLoginSuccessfully() {

        dc8.verifyContainsText(dc8.LoginSuccessTexts,"Welcome");
    }
    @Then("User should see Loan Approved")
    public void userShouldSeeLoanApproved() {
        dc8.verifyContainsText(dc8.loanApprovedText, "approved");
    }

    @And("User sending the keys in Dialoga")
    public void userSendingTheKeysInDialogAndClearStirng(DataTable textBoxVeYazilar) {
        List<List<String>> listTxtYazi = textBoxVeYazilar.asLists(String.class);

        for (int i = 0; i < listTxtYazi.size(); i++) {
            WebElement txtBoxWebElemnt = dc8.getWebElement(listTxtYazi.get(i).get(0));
            txtBoxWebElemnt.clear();
            dc8.mySendKeys(txtBoxWebElemnt, listTxtYazi.get(i).get(1));
        }
    }

    @And("Click on the Element in Dialogss")
    public void clickOnTheElementInDialog(DataTable butonlar) {
        List<String> strButtonList= butonlar.asList(String.class);

        for(int i=0;i< strButtonList.size();i++) {
            //System.out.println(strLinkList.get(i));
            WebElement linkWebElemnt= dc8.getWebElement(strButtonList.get(i));
            dc8.myClick(linkWebElemnt);
        }
    }

    @Then("User Should see No Transaction Text")
    public void userShouldSeeNoTransactionText() {
        dc8.verifyContainsText(dc8.noTransactionFound, "No transactions found.");
    }

    @Then("User should see Loan Decline Text")
    public void userShouldSeeLoanDeclineText() {
        dc8.verifyContainsText(dc8.loanDecline,"You do not have sufficient");
    }
}
