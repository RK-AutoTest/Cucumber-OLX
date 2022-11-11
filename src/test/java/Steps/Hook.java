package Steps;

import WebDriverManager.WebDriverManagerSingleton;

import io.cucumber.java.After;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class Hook  {

    WebDriverManagerSingleton wm=WebDriverManagerSingleton.getInstance();


    @Before
    public void screenshot(){
        wm.getDriver().manage().deleteAllCookies();
        System.out.println("Before hook working");
    }
    @After
    public void takeScreenshotOnFailure(io.cucumber.java.Scenario scenario) {

        if (scenario.isFailed()) {

            TakesScreenshot ts = (TakesScreenshot) wm.getDriver();

            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src, "image/png", "screenshot");
        }
    }
    public void teardown(){
        System.out.println("After hook working");
      wm.teardown();

    }

}

