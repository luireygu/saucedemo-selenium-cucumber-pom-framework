package pages.checkout;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import components.ComponentCheckout;

public class CheckoutPage extends BasePage {

    private final ComponentCheckout componentCheckout;
    public CheckoutPage(WebDriver driver){
        super(driver);
        this.componentCheckout = new ComponentCheckout(driver);
    }
    public void fillingOutCheckoutFields(String name,String lastname,String code){
        componentCheckout.sendkeysFirstName(name);
        componentCheckout.sendkeysLastName(lastname);
        componentCheckout.sendkeysPostalCode(code);
    }

    public void clickContinue(){
        componentCheckout.clickbtncontinue();
    }
    public void completePurchase(){
        componentCheckout.clickbtnCompletePurchase();
    }

    public String getSuccessfulPurchaseText(){
        return componentCheckout.successfullPurchaseText();
    }

}
