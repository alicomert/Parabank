package Pages;


import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _608_DialogContent extends ParentPage {

    public _608_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//*[@name=\"username\"]")
    public WebElement username;

    @FindBy(xpath = "//*[@name=\"password\"]")
    public WebElement password;

    @FindBy(xpath = "//input[@value=\"Log In\"]")
    public WebElement LoginButton;
    @FindBy(xpath = "//*[@id=\"leftPanel\"]/p/b")
    public WebElement LoginSuccessTexts;

    @FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/div/p[1]")
    public WebElement loanApprovedText;

    @FindBy(xpath = "//*[@id=\"amount\"]")
    public WebElement loanAmount;
    @FindBy(xpath = "//*[@id=\"downPayment\"]")
    public WebElement downPayment;
    @FindBy(xpath = "//*[@id=\"fromAccountId\"]")
    public WebElement fromAccount;
    @FindBy(xpath = "//*[@value=\"Apply Now\"]")
    public WebElement applyNowButton;
    @FindBy(xpath = "//a[@id=\"newAccountId\"]")
    public WebElement newAccountID;
    @FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div[2]/p/b")
    public WebElement noTransactionFound;
    @FindBy(xpath = "//a[text()='Request Loan']")
    public WebElement RequestLoan;

    @FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/div/p")
    public WebElement loanDecline;


    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "username":
                return this.username;
            case "password":
                return this.password;
            case "LoginButton":
                return this.LoginButton;
            case "LoginSuccessText":
                return this.LoginSuccessTexts;
            case "loanApprovedText":
                return this.loanApprovedText;
            case "loanAmount":
                return this.loanAmount;
            case "downPayment":
                return this.downPayment;
            case "fromAccount":
                return this.fromAccount;
            case "applyNowButton":
                return this.applyNowButton;
            case "newAccountID":
                return this.newAccountID;
            case "noTransactionFound":
                return this.noTransactionFound;
            case "RequestLoan":
                return this.RequestLoan;
            case "loanDecline": return this.loanDecline;
        }

        return null;
    }


}
