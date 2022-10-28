package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( plugin = {"pretty", "html:target/html"},features="C:\\Users\\User\\IntelliJIDEAProjects\\Cucumber-OLX\\src\\test\\resources\\Features",glue={"Steps"})

public class Runner {
}
