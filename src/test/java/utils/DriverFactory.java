package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class DriverFactory {

    private static final int PAGE_TIMEOUT = 30;
    private static final int TIMEOUT = 15;
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    private static final ThreadLocal <WebDriverWait> wait = new ThreadLocal<>();
    String browser = ConfigReader.getProperty("browser");

    private DriverFactory() {}

    public static void initDriver (){

        if (driver.get() == null){

            String browser = ConfigReader.getProperty("browser");
            boolean maximize = Boolean.parseBoolean(ConfigReader.getProperty("maximize", "true"));
            WebDriver webDriver;
            switch (browser.toLowerCase()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();

                    ChromeOptions options = new ChromeOptions();

                    Map<String, Object> prefs = new HashMap<>();
                    prefs.put("credentials_enable_service", false);
                    prefs.put("profile.password_manager_enabled", false);

                    options.setExperimentalOption("prefs", prefs);

                    // PERFIL LIMPIO (CLAVE)
                    options.addArguments("--incognito");
                    options.addArguments("--disable-notifications");
                    options.addArguments("--disable-infobars");
                    options.addArguments("--disable-save-password-bubble");
                    options.addArguments("--disable-features=AutofillServerCommunication");
                    options.addArguments("--disable-features=PasswordManager");

                    webDriver = new ChromeDriver(options);
                    break;

                case "edge":
                    WebDriverManager.edgedriver().setup();
                    webDriver = new EdgeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    webDriver = new FirefoxDriver();
                    break;

                default:
                    throw new RuntimeException(
                            "Browser no soportado: " + browser
                    );
            }
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
            webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_TIMEOUT));
            webDriver.manage().timeouts().scriptTimeout(Duration.ofSeconds(PAGE_TIMEOUT));
            if (maximize) {
                webDriver.manage().window().maximize();
            }
            driver.set(webDriver);
            wait.set(new WebDriverWait(webDriver,Duration.ofSeconds(TIMEOUT)));

        }
    }
    public static WebDriver getDriver(){
        return driver.get();
    }
    public static WebDriverWait getWait(){
        return wait.get();
    }
    public static void quitDriver(){
        if (driver.get() != null){
            driver.get().quit();
            driver.remove();
            wait.remove();
        }
    }

}
