package locators;

import org.openqa.selenium.By;

public class LocatorsProducts {
    public static final By title = By.className("title");
    public static final By addProductBackpack = By.id("add-to-cart-sauce-labs-backpack");
    public static final By addedProductsCounter = By.xpath("//span[@class ='shopping_cart_badge']");
    public static final By shoppingCartButton = By.xpath("//a[@class='shopping_cart_link']");

}
