package cucumberTest.Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features"
        , glue ="cucumberTest",tags = {"@GetOperation,@codeTask"},
        plugin={"pretty","html:target/cucumber","json:target/cucumber.json"}
)
public class TestRunner {

}

