package StepDefinitions;

import Pages._601_DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _601_Register {
    _601_DialogContent dc1=new _601_DialogContent();


    @When("Enter to the  Register")
    public void enterToTheRegister() {
        dc1.myClick(dc1.registerPage);

    }

    @Then("User should See Sign Up Text")
    public void userShouldSeeSignUpText() {
        dc1.verifyContainsText(dc1.signUptext,"Signing up is easy!");
    }

    @And("User sending the keys in Dialog")
    public void userSendingTheKeysInDialog(DataTable textBoxVeYazilar) {
        List<List<String>> listTxtYazi= textBoxVeYazilar.asLists(String.class);

        for (int i = 0; i < listTxtYazi.size(); i++) {
            WebElement txtBoxWebElemnt= dc1.getWebElement(listTxtYazi.get(i).get(0));
            dc1.mySendKeys(txtBoxWebElemnt, listTxtYazi.get(i).get(1));
        }
    }

    @And("Click on the Element in Dialogs")
    public void clickOnTheElementInDialog(DataTable butonlar) {
        List<String> strButtonList= butonlar.asList(String.class);

        for(int i=0;i< strButtonList.size();i++) {
            //System.out.println(strLinkList.get(i));
            WebElement linkWebElemnt= dc1.getWebElement(strButtonList.get(i));
            dc1.myClick(linkWebElemnt);
        }
    }

    @Then("Register Success message should be displayed")
    public void registerSuccessMessageShouldBeDisplayed() {
        dc1.verifyContainsText(dc1.registerSuccessFully,"successfully");
    }
}
