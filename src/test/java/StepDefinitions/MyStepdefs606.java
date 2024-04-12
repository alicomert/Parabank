package StepDefinitions;

import Pages.LeftNav;
import Pages._606_DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs606 {
    _606_DialogContent dc6=new _606_DialogContent();
    LeftNav ln=new LeftNav();

    @Given("the user is on the Parabank website")
    public void theUserIsOnTheParabankWebsite() {
        System.out.println("Sayfa açılıyor...");
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
        System.out.println("Sayfa açıldı");

    }
    @And("the user has logged in")
    public void theUserHasLoggedIn() {
        dc6.mySendKeys(dc6.username,"bugbusters");
        dc6.mySendKeys(dc6.password,"demo123");
        dc6.myClick(dc6.LoginButton);
        System.out.println("Kullanıcı girişi tamamlandı");
    }
    @When("the user clicks on the Transfer Funds link from the menu")
    public void theUserClicksOnTheTransferFundsLinkFromTheMenu() {
        ln.TransferFunds.click();
        System.out.println("Transfer funds linki tıklandı");

    }
    @And("the user selects a sender account and a receiver account")
    public void theUserSelectsASenderAccountAndAReceiverAccount() {

    }

    @And("the user enters an amount to transfer")
    public void theUserEntersAnAmountToTransfer() {
        dc6.mySendKeys(dc6.amount,"100");

    }
    @And("the user clicks on the Transfer button")
    public void theUserClicksOnTheTransferButton() {
        dc6.myClick(dc6.submitTransfer);
        System.out.println("Transfer Butonuna Tıklandı");
    }
    @Then("the system confirms that the money transfer process has been successfully completed")
    public void theSystemConfirmsThatTheMoneyTransferProcessHasBeenSuccessfullyCompleted() {
        dc6.verifyContainsText(dc6.SuccesMessage.getText(),"Transfer Complete!");

    }

    @Then("the system confirms that the user transfer is verified and the amount is correct")
    public void theSystemConfirmsThatTheUserTransferIsVerifiedAndTheAmountIsCorrect() {
        dc6.verifyContainsText(dc6.SuccesMessage.getText(),"Transfer Complete!");

    }
}
