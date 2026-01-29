package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.login.LoginPage;
import pages.products.ProductsPage;
import utils.DriverFactory;


public class LoginSteps {
    private LoginPage loginPage;
    private ProductsPage productsPage;

    @Given("el usuario está en la página de login")
    public void elUsuarioEstaEnLaPaginaDeLogin() {
        loginPage = new LoginPage(DriverFactory.getDriver());
    }

    @When("ingresa usuario {string} y contraseña {string}")
    public void ingresaUsuarioYContrasena(String user, String pass) {
        productsPage = loginPage.login(user, pass);
    }

    @Then("debe ver la página de productos")
    public void debeVerLaPaginaDeProductos() {
        Assertions.assertTrue(productsPage.isProductsTitleVisible(), "❌ No se mostró la página de productos");
    }


    @Then("debe ver un mensaje de error")
    public void debeVerUnMensajeDeError() {
        Assertions.assertTrue(loginPage.isErrorMessageVisible(), "❌ No se mostró el mensaje de error");
    }
}
