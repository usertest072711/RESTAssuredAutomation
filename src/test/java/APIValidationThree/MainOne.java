package APIValidationThree;

import io.restassured.response.Response;

public class MainOne {

	public static void main(String[] args) {
		 ApiService apiService = new ApiService();
	        Response apiResponse = apiService.getApiResponse();
	        
	        // Convert the response body to a string
	        String responseBody = apiResponse.getBody().asString();
	        
	        // Define the file path where you want to save the response
	        String filePath = "/RESTAssuredAutomation/src/test/java/APIValidationTwo/Data.json";
	        
	        // Save the response to the file
	        FileUtils.writeToFile(responseBody, filePath);
	    }

	}

}
