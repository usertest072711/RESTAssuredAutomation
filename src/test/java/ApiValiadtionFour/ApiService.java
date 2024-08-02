package ApiValiadtionFour;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiService {
	 public Response getApiResponse() {
	        RestAssured.baseURI = "https://reqres.in/api"; // Example API endpoint
	        
	        
	        		 //JSONObject obj = new JSONObject();
	        //obj.put("name" , "morpheus");
	     //   obj.put("job" , "leader");
	        return RestAssured.given()
	        		
	        		//.body(obj.toJSONString())
	        
	        
	        		
	            .when()
	            .post("/users/2"); // Example endpoint
	        
	        
	        
	        
	 }
}
