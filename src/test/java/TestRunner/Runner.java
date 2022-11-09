package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions( plugin = {"pretty", "html:target/cucumber-report/cucumber.html","json:target/cucumber-report/cucumber.json"},
        features="C:\\Users\\User\\IntelliJIDEAProjects\\Cucumber-OLX\\src\\test\\resources\\Features",
        glue={"Steps"},
        monochrome=true
)

public class Runner {



}
