package cucumberTest.Hooks;


import cucumber.api.java.Before;
import utilities.RestAssuredExtension;

public class TestInitialization {
    @Before
    public void setup(){
        RestAssuredExtension restAssuredExtension =new RestAssuredExtension();

    }
}
