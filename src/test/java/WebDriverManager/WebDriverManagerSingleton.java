package WebDriverManager;



import io.cucumber.java.After;
import io.cucumber.java.Scenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManagerSingleton {
    // to create instance of singleton class.
    private static WebDriverManagerSingleton wdm = null;
    private static WebDriver driver;
    //to create private constructor


    private WebDriverManagerSingleton() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    //to create instance of class
    public static WebDriverManagerSingleton getInstance() {
        if (wdm == null) {
            wdm = new WebDriverManagerSingleton();
        }
        return wdm;
    }

    public WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();

        }
        return driver;
    }


    public void teardown(){
        driver.quit();

    }

}
