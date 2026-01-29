package components;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import locators.LocatorsProducts;

public class ComponentProducts extends BasePage {

    public ComponentProducts(WebDriver driver){
        super(driver);
    }
    public boolean productsTitleVisible(){
        try {
            return waitVisibleElement(LocatorsProducts.title).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    public void clickAddProductBackpack(){
            click(LocatorsProducts.addProductBackpack);
    }
    public String counterProductCart(){
        return waitVisibleElement(LocatorsProducts.addedProductsCounter).getText();
    }
    public void clickShoppingCartBtn(){
        click(LocatorsProducts.shoppingCartButton);
    }


}
