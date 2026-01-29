package pages.products;

import components.ComponentProducts;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.cart.CartPage;

public class ProductsPage extends BasePage {

    private final ComponentProducts componentProducts;


    public ProductsPage(WebDriver driver){
        super(driver);
        this.componentProducts = new ComponentProducts(driver);

    }

    public boolean isProductsTitleVisible(){
        return componentProducts.productsTitleVisible();
    }

    public void clickAddBackPack(){
        componentProducts.clickAddProductBackpack();
    }
    public String totalProductsAdded(){
        return componentProducts.counterProductCart();
    }
    public CartPage clickShoppingCart(){
        componentProducts.clickShoppingCartBtn();
        return new CartPage(driver);

    }

}
