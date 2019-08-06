package StepDefinition;

import Hooks.TestInitialization;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import org.junit.Assert;
import utilities.RestAssuredExtension;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class GetOperationsValidationSteps{
    private static ResponseOptions<Response> response;

    @Given("^I perform get operation for \"([^\"]*)\"$")
    public void iPerformGetOperationFor(String relativeUrl)  {
        response=RestAssuredExtension.getUrl(relativeUrl);
        Assert.assertEquals(response.statusCode(),200);
    }

   @Then("^validate user first name is \"([^\"]*)\"$")
    public void validateFirstName(String fname){
        Assert.assertThat(response.getBody().jsonPath().get(),hasEntry("first_name",fname));
    }





}
