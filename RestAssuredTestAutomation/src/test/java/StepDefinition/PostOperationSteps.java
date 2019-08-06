package StepDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import org.junit.Assert;
import utilities.RestAssuredExtension;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostOperationSteps  {
    private static ResponseOptions<Response> response;
    RestAssuredExtension restAssuredExtension =new RestAssuredExtension();

    @Given("add employee data in \"([^\"]*)\" url$")
    public void user_get_employee_details_from(String url, DataTable table) throws Throwable {
        List<List<String>> data= table.raw();
        response= RestAssuredExtension.postOperationsWithbody(url,setBody(data));
        Assert.assertEquals(response.statusCode(),201);
    }


    @Then("^verify employee \"([^\"]*)\" added successfully$")
    public void verify_department_added_successfully(String fname) throws Throwable {
        Assert.assertTrue(response.getBody().jsonPath().get("first_name").equals(fname));
    }


   public Map<String,String> setBody(List<List<String>> data){
       Map<String,String> empMap=new HashMap<>();
       empMap.put(data.get(0).get(0),data.get(1).get(0));
       empMap.put(data.get(0).get(1),data.get(1).get(1));
       empMap.put(data.get(0).get(2),data.get(1).get(2));
        return empMap;

    }



    @Given("^add department \"([^\"]*)\" for employee id \"([^\"]*)\" in \"([^\"]*)\" url$")
    public void add_department_for_employee_id(String id, String dept,String url) throws Throwable {
        Map<String,String> pathparams =new HashMap<>();
        pathparams.put("eid",id);

        Map<String,String> body=new HashMap<>();
        body.put("Dept",dept);

        response =RestAssuredExtension.postOperationsWithParametersAndBody(url,pathparams,body);
    }


}
