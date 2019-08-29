package cucumberTest.StepDefinition;

import Configuration.ConfigLoader;
import DataDomains.Users;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import utilities.Constants;
import utilities.RestClients;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class CodeTaskSteps {
    private static CloseableHttpResponse httpResponse;

    @Given("^get base url$")
    public void getBaseUrl() {
        httpResponse = RestClients.getUrl(ConfigLoader.getBasePath());

    }

    @Then("^validate status code (\\d+) and status message \"([^\"]*)\"$")
    public void validateStatusCodeAndStatusMessage(int expStatusCode, String expStatusMsg) throws Throwable {
        int actualStatusCode = httpResponse.getStatusLine().getStatusCode();
        String actualStatusMessage = httpResponse.getStatusLine().toString();
        Assert.assertEquals("Status code is not 200", actualStatusCode, expStatusCode);
        Assert.assertTrue("Status msg is not OK", actualStatusMessage.contains(expStatusMsg));
    }

    @Then("^validate content type header value is\"([^\"]*)\"$")
    public void validateContentTypeHeaderValueIs(String expContentType) throws Throwable {
        Map<String, String> headerMap = RestClients.getHeaderMap();
        String actualContentType = headerMap.get(Constants.CONTENT_TYPE);
        Assert.assertTrue("Invalid Content type", actualContentType.equalsIgnoreCase(expContentType));
    }

    @Then("^validate the content of the response body is the array of (\\d+) users$")
    public void validateTheContentOfTheResponseBodyIsTheArrayOfUsers(int expUsers) throws IOException, URISyntaxException {
        String responseString = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
        JSONArray jsonarray = new JSONArray(responseString);
        int actualUsers = jsonarray.length();
        Assert.assertTrue("users count mismatch", actualUsers == expUsers);


        createJsonFile();
        setDataInObjectMapper();


    }

    public void createJsonFile() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        Users users = new Users();
        mapper.writeValue(new File("C:\\Users\\laxmi_bala\\Desktop\\Laxmi\\Project\\RestApiTestProject\\RestAssuredTestAutomation\\user.json"), users);
    }

    public void setDataInObjectMapper() throws IOException, URISyntaxException {
        httpResponse = RestClients.getUrl(ConfigLoader.getBasePath());
        String responseString = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        List<Users> users = Arrays.asList(mapper.readValue(responseString, Users[].class));
        System.out.println("\nJSON array to List of objects");
        users.stream().forEach(x -> System.out.println(x.getName()));

        List<Users> users1 = mapper.readValue(responseString, new TypeReference<List<Users>>() {
        });
        System.out.println("\nAlternative...");
        users1.stream().forEach(x -> System.out.println(x.getCompany().getName()));

        Users[] users3 = mapper.readValue(responseString, Users[].class);

        for (Users user : users3) {
            System.out.println("Val of name is: " + user.getName());
        }


    }

    @Then("^get all users name$")
    public void getAllUsersName() throws IOException {
        String responseString = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
        JSONArray jsonarray = new JSONArray(responseString);
        for (int i = 0; i < jsonarray.length(); i++) {
            JSONObject obj = jsonarray.getJSONObject(i);
            String name = obj.getString("name");
            System.out.println(name);

        }
    }

    @Then("^validate user \"([^\"]*)\" company name is \"([^\"]*)\"$")
    public void validateUserCompanyNameIs(String username, String expCompanyname) throws Throwable {
        List<Users> userDataList = RestClients.getUserDataList();
        List<Users> users= userDataList.stream().filter(x->x.getName().equalsIgnoreCase(username)).collect(Collectors.toList());
        for (Users x : users) {
            String actualCompanyName = x.getCompany().getName();
            Assert.assertTrue("mismatch data",actualCompanyName.equals(expCompanyname));
            break;
        }


    }
}
