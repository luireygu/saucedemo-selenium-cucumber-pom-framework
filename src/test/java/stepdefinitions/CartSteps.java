package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.products.ProductsPage;
import pages.login.LoginPage;
import utils.DriverFactory;

public class CartSteps {
    private LoginPage loginPage;
    private ProductsPage productsPage;


    @Given("el usuario está logueado")
    public void elUsuarioEstaLogueado(){
        loginPage = new LoginPage(DriverFactory.getDriver());
        productsPage = loginPage.login("standard_user","secret_sauce");

    }
    @When("agrega un producto al carrito")
    public void agregaUnProductoAlCarrito(){

        productsPage.clickAddBackPack();
    }
    @Then ("el carrito debe mostrar 1 producto")
    public void elCarritoDebeMostrarUnProducto(){
        Assertions.assertEquals(productsPage.totalProductsAdded(),"1","La cantidad de productos añadidos es diferente a 1 ");
    }
}
