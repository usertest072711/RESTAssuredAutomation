package StoreResponse;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class MyClass{
    
    private Response response;
   
    @Test
    public void sendGetRequestT() {
      RequestSpecification httpRequest = given()
    		  
              .header("Content-Type", "application/json");
  
      response = httpRequest
              .when()
              .get("https://gorest.co.in/public/v1/users");
              
    }     
   
    
    
    @Test
    public void verifyStatusCode() {
      RestUtil.verify201( response); 
    }}