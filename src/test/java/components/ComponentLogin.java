package components;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import locators.LocatorsLogin;

public class ComponentLogin extends BasePage {

    public ComponentLogin(WebDriver driver){
        super(driver);
    }

    public void sendUsername(String username){
        sendKeys(LocatorsLogin.userName,username);
    }
    public void sendPassword(String password){
        sendKeys(LocatorsLogin.password,password);
    }
    public void clickLogin(){
        click(LocatorsLogin.btnLogin);
    }
    public boolean ErrorMessage(){
        try {
            return waitVisibleElement(LocatorsLogin.errorMessage).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

}
