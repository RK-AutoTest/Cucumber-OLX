package Steps;

import Base.Browser;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import pageObjectHP.CategoryPageObject;

public class CategorySteps  {

    private Browser Bro;



    public CategorySteps(Browser browser) {

        Bro=browser;
    }


    @Given("user is on home page  and verifies page title")
    public void user_is_on_home_page_and_verifies_page_title() {

       CategoryPageObject co=new CategoryPageObject(Bro.getDriver());
        co.verifyTitle();


    }
    @When("user clicks on Categories option")
    public void user_clicks_Categories_on_option() {
        CategoryPageObject co=new CategoryPageObject(Bro.getDriver());
        co.clickCategories();

    }
    @And("user clicks on Dogs option")
    public void user_clicks_on_dogs_option() {
        CategoryPageObject co=new CategoryPageObject(Bro.getDriver());
        co.clickDog();
       System.out.println("dog clicked");
    }
    @Then("it should take user to dog page and verifies page title")
    public void it_should_take_user_to_dog_page_and_verifies_page_title() {
        CategoryPageObject co=new CategoryPageObject(Bro.getDriver());

        co.verifyDogPage();
    }


}
