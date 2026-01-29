package pages.products;

import components.ComponentProducs;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.cart.CartPage;

public class ProductsPage extends BasePage {

    private final ComponentProducs componentProducs;


    public ProductsPage(WebDriver driver){
        super(driver);
        this.componentProducs = new ComponentProducs(driver);

    }

    public boolean isProductsTitleVisible(){
        return componentProducs.productsTitleVisible();
    }

    public void clickAddBackPack(){
        componentProducs.clickAddProductBackpack();
    }
    public String totalProductsAdded(){
        return componentProducs.counterProductCart();
    }
    public CartPage clickShoppingCart(){
        componentProducs.clickShoppingCartBtn();
        return new CartPage(driver);

    }

}
