package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ={"src/test/java/Feature"},
        glue = {"StepDefination"},
        plugin = {"html:target/cucumber-report"}
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
