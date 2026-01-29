package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.login.LoginPage;
import pages.products.ProductsPage;
import pages.cart.CartPage;
import pages.checkout.CheckoutPage;
import utils.DriverFactory;

public class CheckoutSteps {
    /*
      Scenario: Finalizar compra exitosamente
    Given el usuario tiene productos en el carrito
    When completa el formulario de compra
    Then debe ver el mensaje de compra exitosa
     */
    // login , add producto
    private LoginPage loginPage;
    private ProductsPage productsPage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;

    String expectedText = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";

    @Given("el usuario tiene productos en el carrito")
    public void elUsuarioTieneProductosEnElCarrito(){
        loginPage = new LoginPage(DriverFactory.getDriver());
        productsPage = loginPage.login("standard_user","secret_sauce");
        productsPage.clickAddBackPack();
    }
    @When("completa el formulario de compra")
    public void completaElFormularioDeCompra(){
        cartPage = productsPage.clickShoppingCart();
        checkoutPage = cartPage.clickCheckout();
        checkoutPage.fillingOutCheckoutFields("Luis Carlos","Reyes Guerrero","124");
        checkoutPage.clickContinue();
        checkoutPage.completePurchase();
    }
    @Then("debe ver el mensaje de compra exitosa")
    public void debeVerElMensajeDeCompraExitosa(){
        Assertions.assertEquals(checkoutPage.textSuccessfull(),expectedText,"La cantidad de productos añadidos es diferente a 1 ");
    }

}
