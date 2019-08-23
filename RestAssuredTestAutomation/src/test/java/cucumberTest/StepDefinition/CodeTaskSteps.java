package cucumberTest.StepDefinition;

import Configuration.ConfigLoader;
import com.fasterxml.jackson.databind.ObjectMapper;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.it.Ma;
import gherkin.deps.com.google.gson.JsonObject;
import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import utilities.Constants;
import utilities.RestClients;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


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

    @Then("^validate content type header value is\"([^\"]*)\"$")
    public void validateContentTypeHeaderValueIs(String expContentType) throws Throwable {
        Map<String, String> headerMap = RestClients.getHeaderMap();
        String actualContentType = headerMap.get(Constants.CONTENT_TYPE);
        Assert.assertTrue("Invalid Content type",actualContentType.equalsIgnoreCase(expContentType));
    }

    @Then("^validate the content of the response body is the array of (\\d+) users$")
    public void validateTheContentOfTheResponseBodyIsTheArrayOfUsers(int expUsers) throws IOException {
       String responseString = EntityUtils.toString(httpResponse.getEntity(),"UTF-8");
        JSONArray jsonarray = new JSONArray(responseString);
        int actualUsers=jsonarray.length();
        Assert.assertTrue("users count mismatch",actualUsers==expUsers);
        for(int i=0; i<jsonarray.length(); i++){
            JSONObject obj = jsonarray.getJSONObject(i);
            String name = obj.getString("name");
            System.out.println(name);

        }


    }
}
