package Steps;


import WebDriverManager.WebDriverManagerSingleton;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjectHP.CategoryPageObject;

public class CategorySteps {


    WebDriverManagerSingleton wm = WebDriverManagerSingleton.getInstance();
    WebDriver driver = wm.getDriver();
    CategoryPageObject co = PageFactory.initElements(driver, CategoryPageObject.class);


    @Given("Navigate to home page of OLX {string}.")

    public void Navigate_to_home_page_of_OLX(String url) {

        driver.get(url);

    }

    @Given("user is on home page  and verifies page title")
    public void user_is_on_home_page_and_verifies_page_title() {

        System.out.println("verifying title");
        co.verifyTitle();


    }

    @When("user clicks on Categories option")
    public void user_clicks_Categories_on_option() {

        co.clickCategories();

    }

    @And("user clicks on Dogs option")
    public void user_clicks_on_dogs_option() {

        co.clickDog();
        System.out.println("dog clicked");
    }

    @Then("it should take user to dog page and verifies page title")
    public void it_should_take_user_to_dog_page_and_verifies_page_title() {


        co.verifyDogPage();
    }


}
