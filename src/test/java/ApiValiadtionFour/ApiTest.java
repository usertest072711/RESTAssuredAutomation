package ApiValiadtionFour;

import com.fasterxml.jackson.databind.JsonNode;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiTest {
	 public void testApiRequestWithJsonData() {
	        // Step 1: Read data from JSON file
	        JsonNode jsonData = JsonFileReader.readJsonFile("/RESTAssuredAutomation/JsonDataOne.json");
	        
	        // Extract data from JSON node
	       // String username = jsonData.get("username").asText();
	        //String password = jsonData.get("password").asText();
	        
	        // Step 2: Send API request using Rest Assured
	        Response response = RestAssured.given()
	           // .header("Content-Type", "application/json")
	            //.body("{ \"username\": \"" + username + "\", \"password\": \"" + password + "\" }")
	            .when()
	            .delete("https://reqres.in/api/users/2"); // Replace with your API endpoint
	        
	        // Step 3: Validate the response
	        response.then().statusCode(204);
	        System.out.println("Response: " + response.getBody().asString());
	    }
}
