package APIValidationThree;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GetToken {
	
	

	
	@Test
	public Response PostToken() {
		
		RequestSpecification res = RestAssured.given();
		res.baseUri("https://reqres.in/api/users");

	    JSONObject obj = new JSONObject();
		obj.put("name", "morpheus");
		obj.put("job", "leader");
		
	    
	    
	  
		
	Response response = res.contentType(ContentType.JSON).
		body(obj.toJSONString()).post();
	
	
	String token = response.prettyPrint();
	return response;
	
	
	
	
	
	
	
	
		
		
	}
}
