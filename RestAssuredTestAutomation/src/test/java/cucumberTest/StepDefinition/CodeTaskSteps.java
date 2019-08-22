package cucumberTest.StepDefinition;

import Configuration.ConfigLoader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.junit.Assert;
import utilities.RestClients;


public class CodeTaskSteps {
   private static CloseableHttpResponse httpResponse;

    @Given("^get base url$")
    public void getBaseUrl() {
        httpResponse = RestClients.getUrl(ConfigLoader.getBasePath());

    }

    @Then("^validate status code (\\d+) and status message \"([^\"]*)\"$")
    public void validateStatusCodeAndStatusMessage(int expStatusCode, String expStatusMsg) throws Throwable {
        int actualStatusCode =httpResponse.getStatusLine().getStatusCode();
        String actualStatusMessage =httpResponse.getStatusLine().toString();
        Assert.assertEquals("Status code is not 200",actualStatusCode,expStatusCode);
        Assert.assertTrue("Status msg is not OK",actualStatusMessage.contains(expStatusMsg));
    }
}
