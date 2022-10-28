package Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browser {
    public static WebDriver driver;
    @Before
    public void setUp() {
        open_browser();
    }
    public void open_browser(){

        try {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver\\chromedriver.exe");
            DesiredCapabilities d= new DesiredCapabilities();
            d.setCapability("pageLoadStrategy","normal");
            driver=new ChromeDriver();
            driver.get("https://www.olx.in/");
            driver.manage().window().maximize();

        } catch (Exception e) {
            e.printStackTrace() ;

        }
    }

    public WebDriver getDriver() {
        return driver;
    }
    @After
    public void tearDown() {

        try {
            Thread.sleep(5000);
            getDriver().quit();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
