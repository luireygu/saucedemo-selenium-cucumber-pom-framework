package components;

import locators.LocatorsProducts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import locators.LocatorsCheckout;

public class ComponentCheckout extends BasePage {

    public ComponentCheckout(WebDriver driver){
        super(driver);
    }
    public void sendkeysFirstName(String firstName){
        sendKeys(LocatorsCheckout.firstName,firstName);
    }
    public void sendkeysLastName(String lastName){
        sendKeys(LocatorsCheckout.lastName,lastName);
    }
    public void sendkeysPostalCode(String postalCode) {
        WebElement input = waitVisibleElement(LocatorsCheckout.postalCode);
        input.click();
        input.clear();
        input.sendKeys(postalCode);
        //sendKeys(LocatorsCheckout.postalCode, postalCode);
    }
    public void clickbtncontinue(){
        click(LocatorsCheckout.btrContinue);
    }
    public void clickbtnCompletePurchase(){
        click(LocatorsCheckout.completePurchase);
    }
    public String successfullPurchaseText(){
        return getText(LocatorsCheckout.textAssert);
    }




}
