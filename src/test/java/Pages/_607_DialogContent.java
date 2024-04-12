package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _607_DialogContent extends ParentPage{

    public _607_DialogContent() {
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

    @FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/h1")
    public WebElement profileUpdatetext;

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
            case "profileUpdatetext" : return this.profileUpdatetext;
            case "stateCustomer" : return this.stateCustomer;
            case "updateButton" : return this.updateButton;

        }

        return null;
    }
//    public WebElement findElement(By locator) {
//        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//    }
//
//    public void clearAndType(By locator, String text) {
//        WebElement element = findElement(locator);
//        element.clear();
//        element.sendKeys(text);
//    }
//
//    public String getText(By locator) {
//        return findElement(locator).getText();
//    }




}
