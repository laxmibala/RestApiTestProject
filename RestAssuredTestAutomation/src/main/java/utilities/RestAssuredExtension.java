package utilities;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

public class RestAssuredExtension {
    public static RequestSpecification request;

    public RestAssuredExtension() {
        RequestSpecBuilder builder =new RequestSpecBuilder();
        builder.setBaseUri("http://localhost:3000/");
        builder.setContentType(ContentType.JSON);
        request= RestAssured.given().spec(builder.build());

    }


    public static void getOperationsWithParameters(String url, Map<String,Object> pathParams){
        request.pathParams(pathParams);
        try {
           request.get(new URI(url));

        }catch (URISyntaxException e){
            e.printStackTrace();
        }

    }

    public static ResponseOptions<Response> getUrl(String url)  {
         try {
             return request.get(new URI(url));
        }catch (URISyntaxException e){
            e.printStackTrace();
        }
         return null;
    }



    public static ResponseOptions<Response> postOperationsWithbody(String url,Map<String,String> body)  {
        request.body(body);
        return request.post(url);

    }

    public static ResponseOptions<Response> postOperationsWithParametersAndBody(String url,Map<String,String> params,Map<String,String> body)  {
        request.pathParams(params);
        request.body(body);
        return request.post(url);


    }

    public static ResponseOptions<Response> deleteOperationsWithParameters(String url,Map<String,String> params)  {
        request.pathParams(params);
        return request.delete(url);
    }



}
