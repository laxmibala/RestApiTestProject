package cucumberTest.Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features"
        , glue ="cucumberTest",tags = {"@GetOperation,@codeTask"}
)
public class TestRunner {

}

