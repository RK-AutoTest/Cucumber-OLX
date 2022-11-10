package Steps;

import WebDriverManager.WebDriverManagerSingleton;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import org.testng.annotations.AfterSuite;


public class Hook {

    WebDriverManagerSingleton wm=WebDriverManagerSingleton.getInstance();


    @Before
    public void screenshot(){
        System.out.println("Before hook working");
    }

    public void teardown(){
        System.out.println("After hook working");
      wm.teardown();

    }
}
