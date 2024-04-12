package Pages;


import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _606_DialogContent extends ParentPage {

    public _606_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//*[@name=\"username\"]")
    public WebElement username;

    @FindBy(xpath = "//*[@name=\"password\"]")
    public WebElement password;
    @FindBy(xpath = "//input[@value=\"Log In\"]")
    public WebElement LoginButton;
    @FindBy(xpath = "//*[@id=\"leftPanel\"]/p")
    public WebElement LoginSuccessText;


    @FindBy(xpath = "//a[text()='Transfer Funds']")
    public WebElement TransferFunds;

    @FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/h1")
    public WebElement SuccesTransferFunds;

    @FindBy(xpath = "//*[@id=\"amount\"]")
    public WebElement amount;

    @FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/form/div[2]/input]")
    public WebElement submitTransfer;
    @FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/h1")
    public WebElement SuccesMessage;

    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "username":
                return this.username;
            case "password":
                return this.password;
            case "TransferFunds":
                return this.TransferFunds;
            case "amount":
                return this.amount;
            case "SuccesMessage":
                return this.SuccesMessage;
            case "LoginButton":
                return this.LoginButton;
            case "LoginSuccessText":
                return this.LoginSuccessText;
            case "SuccesTransferFunds":
                return this.SuccesTransferFunds;
        }

        return null;
    }


}
