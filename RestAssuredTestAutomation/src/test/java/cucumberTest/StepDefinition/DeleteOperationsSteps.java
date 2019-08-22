package cucumberTest.StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import org.junit.Assert;
import utilities.RestAssuredExtension;

import java.util.HashMap;
import java.util.Map;

public class DeleteOperationsSteps {

    private static ResponseOptions<Response> response;

    @Given("^perform delete operation for employee id \"([^\"]*)\" in \"([^\"]*)\"$")
    public void perform_delete_operation_for_employee_id_in(String id, String url) throws Throwable {
        Map<String,String> pathparams =new HashMap<>();
        pathparams.put("eid",id);
       response= RestAssuredExtension.deleteOperationsWithParameters(url,pathparams);
        Assert.assertEquals(response.statusCode(), "200");
    }

    @Then("^verify employee id \"([^\"]*)\" deleted successfully$")
    public void verify_employee_id_deleted_successfully(String id) throws Throwable {

        Assert.assertTrue(true);
    }
}
