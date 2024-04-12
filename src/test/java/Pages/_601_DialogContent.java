package Pages;


import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _601_DialogContent extends ParentPage {
    public _601_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//a[normalize-space()='Register']")
    public WebElement registerButton;

    @FindBy(xpath = "//input[@id='customer.firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='customer.lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='customer.address.street']")
    public WebElement address;

    @FindBy(xpath = "//input[@id='customer.address.city']")
    public WebElement city;

    @FindBy(xpath = "//input[@id='customer.address.state']")
    public WebElement state;

    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    public WebElement zipcode;

    @FindBy(xpath = "//input[@id='customer.ssn']")
    public WebElement SSN;

    @FindBy(xpath = "//input[@id='customer.username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='customer.password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='repeatedPassword']")
    public WebElement repeatedPassword;

    @FindBy(xpath = "//input[@value='Register']")
    public WebElement finalRegisterButton;

    @FindBy(xpath = "//p[contains(text(),'Your account was created successfully. You are now')]")
    public WebElement successMessage;


    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "registerButton":
                return this.registerButton;
            case "firstName":
                return this.firstName;
            case "lastName":
                return this.lastName;
            case "address":
                return this.address;
            case "city":
                return this.city;
            case "state":
                return this.state;
            case "zipcode":
                return this.zipcode;
            case "SSN":
                return this.SSN;
            case "username":
                return this.username;
            case "password":
                return this.password;
            case "repeatedPassword":
                return this.repeatedPassword;
            case "finalRegisterButton":
                return this.finalRegisterButton;
            case "successMessage":
                return this.successMessage;
        }
        return null;
    }


}
