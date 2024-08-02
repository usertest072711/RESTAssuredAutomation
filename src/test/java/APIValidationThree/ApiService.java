package APIValidationThree;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.response.Response;

@Test
public class ApiService {
	public Response getApiResponse() {
        RestAssured.baseURI = "https://reqres.in/api"; // Replace with your API base URI
        
        return given()
            //.header("Authorization", "Bearer your_access_token_here") // Replace with your auth token if needed
            .get("/users?page=2"); // Replace with your endpoint
    }
}
