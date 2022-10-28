package Steps;

import Base.Browser;
import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import pageObjectHP.CategoryPageObject;
import pageObjectHP.PageObjects;

import java.time.Duration;

public class Test_steps  {
private Browser Bro;
private PageObjects po;



    public Test_steps(Browser browser) {
       Bro=browser;
    }

    // PageObjects po=new PageObjects(driver);
// Scenario 1
    @Given("^user on homepage$")
    public void user_on_homepage(){

        System.out.println("home");
    }

    @When("^user clicks on drop down country list$")
    public void user_clicks_on_drop_down_country_list(){
        try {PageObjects po=new PageObjects(Bro.getDriver());
            po.clickondropdownoption();
        } catch (Exception e) {
            System.out.println("error 1"+e);
        }
    }
    @Then("^user able to see and click on location options$")
    public void user_able_to_see_and_click_on_location_options(){
        try {PageObjects po=new PageObjects(Bro.getDriver());
            Bro.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            po.selectdropdowoptioncountry();

        } catch (Exception e) {
            System.out.println("error 2"+e);
        }
    }


    // Scenario 2

    @Given("user clicks on input field of search box {string}")
    public void user_clicks_on_input_field_of_search_box(String cars) {
        try {
            PageObjects po=new PageObjects(Bro.getDriver());
            po.sbox(cars);
            System.out.println("scenario two");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Then("^user clicks on search button$")

    public void user_clicks_on_search_button() {
        try {
            PageObjects po=new PageObjects(Bro.getDriver());
            System.out.println("scenario two submit");
            po.sbutton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}
