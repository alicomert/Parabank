package Pages;


import Utilities.GWD;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _601_DialogContent extends ParentPage{

    public _601_DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath="//input[@id=\"customer.firstName\"]")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id=\"customer.lastName\"]")
    public WebElement lastName;
    @FindBy(xpath = "//input[@id='customer.address.street']")
    public WebElement address;
    @FindBy(xpath = "//input[@id=\"customer.address.city\"]")
    public WebElement cityCustomer;
    @FindBy(xpath = "//input[@id=\"customer.address.state\"]")
    public WebElement stateCustomer;
    @FindBy(xpath = "//input[@id=\"customer.address.zipCode\"]")
    public WebElement zipCode;
    @FindBy(xpath = "//input[@id=\"customer.phoneNumber\"]")
    public WebElement phoneCustomer;
    @FindBy(xpath = "//input[@id=\"customer.ssn\"]")
    public WebElement ssnCustomer;
    @FindBy(xpath = "//input[@id=\"customer.username\"]")
    public WebElement usernameCustomer;
    @FindBy(xpath = "//input[@id=\"customer.password\"]")
    public WebElement passwordCustomer;
    @FindBy(xpath = "//input[@id=\"repeatedPassword\"]")
    public WebElement passwordConfirm;
    @FindBy(xpath = "//input[@value=\"Register\"]")
    public WebElement registerButton;

    @FindBy(xpath = "//a[text()='Register']")
    public WebElement registerPage;

    @FindBy(xpath = "//*[text()='Signing up is easy!']")
    public WebElement signUptext;

    @FindBy(xpath = "//*[@id=\"rightPanel\"]/p")
    public WebElement registerSuccessFully;
    @FindBy(xpath = "//input[@value=\"Update Profile\"]")
    public WebElement updateButton;



    public WebElement getWebElement(String strElement){

        switch (strElement){
            case "firstName" : return this.firstName;
            case "lastName" : return this.lastName;
            case "address" : return this.address;
            case "cityCustomer" : return this.cityCustomer;
            case "zipCode" : return this.zipCode;
            case "phoneCustomer" : return this.phoneCustomer;
            case "ssnCustomer" : return this.ssnCustomer;
            case "passwordCustomer" : return this.passwordCustomer;
            case "passwordConfirm" : return this.passwordConfirm;
            case "registerButton" : return this.registerButton;
            case "stateCustomer" : return this.stateCustomer;
            case "usernameCustomer" : return this.usernameCustomer;
            case "registerPage" : return this.registerPage;
            case "signUptext" : return this.signUptext;
            case "registerSuccessFully" : return this.registerSuccessFully;
            case "updateButton" : return this.updateButton;

        }

        return null;
    }





}
