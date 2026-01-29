package components;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import locators.LocatorCartPage;

public class ComponentCart extends BasePage {

    public ComponentCart(WebDriver driver){
        super(driver);
    }

    public void checkout(){
        click(LocatorCartPage.checkout);
    }

}
