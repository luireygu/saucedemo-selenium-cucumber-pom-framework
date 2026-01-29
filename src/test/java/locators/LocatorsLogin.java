package locators;

import org.openqa.selenium.By;

public class LocatorsLogin {
    public static final By userName = By.id("user-name");
    public static final By password = By.id("password");
    public static final By btnLogin = By.id("login-button");
    public static final By errorMessage = By.cssSelector("[data-test='error']");

}
