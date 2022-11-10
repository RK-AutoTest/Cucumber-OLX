package pageObjectHP;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.time.Duration;

public class CategoryPageObject {
    WebDriver driver;

    public CategoryPageObject(WebDriver d) {
        driver = d;

    }

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'All Categories')]")
    WebElement categories;
    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Dogs']")
    WebElement dog;
    //   @FindBy(how=How.XPATH,using = "")
    //  WebElement;

    public void verifyTitle() {
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        String title = driver.getTitle();
        System.out.println("fetched title " + title);
        String expected = "OLX - Free classifieds in India, Buy and Sell for free anywhere in India with OLX Online Classified Advertising";
        Assert.assertEquals(title, expected);
        System.out.println("'--Title matched of Home Page--'");
    }

    public void clickCategories() {

        categories.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    public void clickDog() {

        dog.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void verifyDogPage() throws InterruptedException {

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        Thread.sleep(3000);
        String dg = driver.getTitle();
        System.out.println("fetched title of dog page --" + dg);
        String expected = "Dogs for sale in India | OLX";
        Assert.assertEquals(dg, expected);
        System.out.println("'--Title matched of Dog Page--'");

    }
}
