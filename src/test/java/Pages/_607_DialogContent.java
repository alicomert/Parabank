package Pages;


import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _607_DialogContent extends ParentPage{

    public _607_DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }


    @FindBy(xpath="//*[@id='customer.firstName']")
    public WebElement firstName;
    @FindBy(xpath="//*[@id='customer.lastName']")
    public WebElement lastName;
    @FindBy(xpath="//*[@id='customer.address.street']")
    public WebElement address;
    @FindBy(xpath="//*[@id='customer.address.city']")
    public WebElement city;
    @FindBy(xpath="//*[@id='customer.address.state']")
    public WebElement state;
    @FindBy(xpath="//*[@id='customer.address.zipCode']")
    public WebElement zipCode;
    @FindBy(xpath="//*[@id='customer.phoneNumber']")
    public WebElement phone;
    @FindBy(xpath = "(//*[@class='button'])[2]")
    public WebElement savaButton;



    public WebElement getWebElement(String strElement){

        switch (strElement){
            case "firstName" : return this.firstName;
            case "lastName" : return this.lastName;
            case "address" : return this.address;
            case "city" : return this.city;
            case "state" : return this.state;
            case "zipCode" : return this.zipCode;
            case "phone" : return this.phone;
            case "savaButton" : return this.savaButton;

        }

        return null;
    }





}
