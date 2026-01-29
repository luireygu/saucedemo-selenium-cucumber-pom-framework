package pages.cart;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import components.ComponentCart;
import pages.checkout.CheckoutPage;

public class CartPage extends BasePage {
    private final ComponentCart componentCart;

    public CartPage(WebDriver driver){
        super(driver);
        this.componentCart = new ComponentCart(driver);
    }

    public CheckoutPage clickCheckout(){
        componentCart.checkout();
        return new CheckoutPage(driver);
    }

}
