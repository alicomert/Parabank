package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends ParentPage {

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    //Örnek
    @FindBy(xpath = "//a[text()='Open New Account']")
    public WebElement openNewAcc;

    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[2]/a")
    public WebElement AccOverview;

    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[3]/a")
    public WebElement TransferFunds;

    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[4]/a")
    public WebElement BillPay;

    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[5]/a")
    public WebElement FindTransaction;

    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[6]/a")
    public WebElement UpdateContact;

    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[7]/a")
    public WebElement RequestLoan;

    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[8]/a")
    public WebElement Logout;

//Örnek

    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "openNewAcc": return this.openNewAcc;
            case "AccOverview": return this.AccOverview;
            case "TransferFunds": return this.TransferFunds;
            case "BillPay": return this.BillPay;
            case "FindTransaction": return this.FindTransaction;
            case "UpdateContact": return this.UpdateContact;
            case "RequestLoan": return this.RequestLoan;
            case "Logout": return this.Logout;
        }

        return null;
    }


}
