package components;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import locators.LocatorsProducts;

public class ComponentProducs extends BasePage {

    public ComponentProducs(WebDriver driver){
        super(driver);
    }
    public boolean productsTitleVisible(){
        return waitVisibleElement(LocatorsProducts.title).isDisplayed();
    }
    public void clickAddProductBackpack(){
        if (waitVisibleElement(LocatorsProducts.addProductBackpack).isDisplayed()){
            click(LocatorsProducts.addProductBackpack);
        }
    }
    public String counterProductCart(){
       return getText(LocatorsProducts.addedProductsCounter);
    }
    public void clickShoppingCartBtn(){
        click(LocatorsProducts.shoppingCartButton);
    }


}
