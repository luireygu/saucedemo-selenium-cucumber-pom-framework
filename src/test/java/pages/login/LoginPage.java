package pages.login;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import components.ComponentLogin;
import pages.products.ProductsPage;

public class LoginPage extends BasePage {

    private final ComponentLogin componentLogin;

    public LoginPage(WebDriver driver){
        super(driver);
        this.componentLogin = new ComponentLogin(driver);
    }
    public ProductsPage login(String user,String pass){
        componentLogin.sendUsername(user);
        componentLogin.sendPassword(pass);
        componentLogin.clickLogin();
        return new ProductsPage(driver);
    }

    public boolean isErrorMessageVisible(){
        return componentLogin.ErrorMessage();
    }

}
