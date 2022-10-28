package pageObjectHP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class PageObjects {
      WebDriver driver ;
    public PageObjects(WebDriver driver) {
        this.driver =driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(how = How.XPATH, using ="//div[@data-aut-id='locationBox']//button[@role='button']")
    WebElement dropdownlist;
    @FindBy(how = How.XPATH, using ="//body/div[@id='app']/div[@id='container']/header/div/div/div/div/div/div/div/div/div/div/div[@data-aut-id='locationItem']/div[1]")
    WebElement listoption;
   @FindBy(how = How.XPATH, using ="//input[@placeholder='Find Cars, Mobile Phones and more...']")
   WebElement searchbox;
    @FindBy(how = How.XPATH, using ="//div[@data-aut-id='btnSearch']")
    WebElement searchbutton;
    @FindBy(how = How.XPATH, using ="")
    WebElement websitelink;

    public void clickondropdownoption(){

        try { driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            dropdownlist.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void selectdropdowoptioncountry(){
        try {driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            listoption.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sbox(String txt){
        try {
            searchbox.sendKeys(txt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sbutton(){
        try {driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            searchbutton.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
