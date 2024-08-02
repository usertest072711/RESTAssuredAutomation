package StoreResponse;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class CreatePet {
	
@Test
	public void CreateNew() {
		
	
	RequestSpecification req = RestAssured.given();
	req.baseUri("https://petstore.swagger.io/v2/pet/123");
	
	Response response = req.get();
	
	ResponseBody rbody = response.getBody();
	
	String body = rbody.asString();
	
	
	
	System.out.println(body);
	System.out.println(response.getStatusCode());
	
	
	}

}
