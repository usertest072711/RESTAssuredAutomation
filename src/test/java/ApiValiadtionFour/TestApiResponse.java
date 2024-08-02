package ApiValiadtionFour;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TestApiResponse {
	
	@Test
	public void testApiResponse() {
        // Step 1: Create an instance of ApiService
        ApiService apiService = new ApiService();

        // Step 2: Get API response
        Response apiResponse = apiService.getApiResponse();

        // Step 3: Convert the response body to a JSON string
        String responseBody = apiResponse.getBody().asString();

        // Step 4: Define the file path where you want to save the JSON response
        String filePath = "JsonDataOne.json";

        // Step 5: Save the JSON response to the file
        FileUtils.writeJsonToFile(responseBody, filePath);

        // Step 6: Optionally, assert the status code or response content
        Assert.assertEquals(apiResponse.getStatusCode(), 201, "Status code should be 201");
    }
}
