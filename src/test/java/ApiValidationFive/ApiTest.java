package ApiValidationFive;

import io.restassured.response.Response;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;


public class ApiTest {

	 public void testApiResponse() {
	        ApiService apiService = new ApiService();
	        Response apiResponse = apiService.getApiResponse();

	        // Convert the response body to a JSONObject for easy access
	        JSONObject jsonResponse = new JSONObject();

	        // Extract required data
	        String userId = jsonResponse.toJSONString("userId");
	        String id = jsonResponse.toJSONString("id");
	        String title = jsonResponse.toJSONString("title");
	        String body = jsonResponse.toJSONString("body");

	        // Print or use the extracted data
	        System.out.println("User ID: " + userId);
	        System.out.println("ID: " + id);
	        System.out.println("Title: " + title);
	        System.out.println("Body: " + body);

	        // Call method to write data to Excel
	        ExcelUtils.writeDataToExcel("api_response.xlsx", userId, id, title, body);
	    }
}