package pageObjectHP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import java.time.Duration;

public class CategoryPageObject {
    WebDriver driver;

    public CategoryPageObject(WebDriver d){
        this.driver=d;
        PageFactory.initElements(driver,this);
    }
    @FindBy(how=How.XPATH,using = "//span[contains(text(),'All Categories')]")
    WebElement categories;
    @FindBy(how=How.XPATH,using = "//span[normalize-space()='Dogs']")
    WebElement dog;
 //   @FindBy(how=How.XPATH,using = "")
          //  WebElement;

    public void verifyTitle() {
       String title=driver.getTitle();
       System.out.println("fetched title"+title);
       String expected = "OLX - Free classifieds in India, Buy and Sell for free anywhere in India with OLX Online Classified Advertising";
       if(title.equalsIgnoreCase(expected)){
           System.out.println("Matched title");
       }else System.out.println("not matched");
    }

    public void clickCategories() {

        categories.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println(" clicked");
    }

    public void clickDog() {

        dog.click();
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    public void verifyDogPage(){
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        String dg=driver.getTitle();
        System.out.println("fetched title of dog page "+dg);
        String expected="Dogs for sale in India | OLX";
        if (dg.equalsIgnoreCase(expected)){
            System.out.println("Matched dog title");
        }else System.out.println("not matched dog title");
        }
}
