package APIValidation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APITest {
	
	@Test
	public Response getApiResponse() {
        RestAssured.baseURI = "https://reqres.in";
        
        Response response = given()
            .get("/api/users/2");
        
        return response;
    }
}
