package Steps;


import WebDriverManager.WebDriverManagerSingleton;


import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjectHP.PageObjects;


public class Test_steps {
    WebDriverManagerSingleton wm = WebDriverManagerSingleton.getInstance();
    WebDriver driver = wm.getDriver();
    private final PageObjects po = PageFactory.initElements(driver, PageObjects.class);


    @Given("I navigate to home page of OLX {string}.")
    public void I_navigate_to_home_page_of_OLX(String url) {

        driver.get(url);

    }


// Scenario 1


    @When("^user clicks on drop down country list$")
    public void user_clicks_on_drop_down_country_list() {
        try {
            po.clickOnDropDownOption();
        } catch (Exception e) {
            System.out.println("error 1"+e);
        }
    }

    @Then("^user able to see and click on location options$")
    public void user_able_to_see_and_click_on_location_options() {
        try {
            po.selectDropDownOptionCountry();

        } catch (Exception e) {
            System.out.println("error 2" + e);
        }
    }


    // Scenario 2

    @When("user clicks on input field of search box {string}")
    public void user_clicks_on_input_field_of_search_box(String cars) {
        try {

            po.setSearchBox(cars);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Then("^user clicks on search button$")

    public void user_clicks_on_search_button() {
        try {
            po.setSearchButton();
            Thread.sleep(3000);
            Hook h = new Hook();
            h.teardown();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
