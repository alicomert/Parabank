package StepDefinitions;

import Pages.LeftNav;
import Pages._604_DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyStepdefs604 {

    _604_DialogContent dc4=new _604_DialogContent();
   LeftNav ln=new LeftNav();
    @Given("Navigate to ParaBank")
    public void navigateToParaBank() {

        System.out.println("System open");
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dc4.mySendKeys(dc4.username,"bob");
        dc4.mySendKeys(dc4.password,"123456");
        dc4.myClick(dc4.LoginButton);
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {

        dc4.verifyContainsText(dc4.LoginSuccessText,"bob");
    }

    @And("Click on the Element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable linkler) {
        List<String> strLinkList= linkler.asList(String.class);

        for(int i=0;i< strLinkList.size();i++) {
            //System.out.println(strLinkList.get(i));
            WebElement linkWebElemnt= ln.getWebElement(strLinkList.get(i));
            ln.myClick(linkWebElemnt);
        }
    }

    @And("Click on the Element in Dialog")
    public void clickOnTheElementInDialog(DataTable butonlar) {
        List<String> strButtonList= butonlar.asList(String.class);

        for(int i=0;i< strButtonList.size();i++) {
            //System.out.println(strLinkList.get(i));
            WebElement linkWebElemnt= dc4.getWebElement(strButtonList.get(i));
            dc4.myClick(linkWebElemnt);
        }
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc4.verifyContainsText(dc4.AccountOpenTest,"Account Opened!");
    }
}
