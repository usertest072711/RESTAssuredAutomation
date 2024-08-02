package APIValidation;

import io.restassured.response.Response;

public class ResponseHandler {
	public void processResponse() {
        APITest apiTest = new APITest();
        Response apiResponse = apiTest.getApiResponse();
        
        // Extract relevant data or the entire response as needed
        String responseBody = apiResponse.getBody().asString();
        
        // Pass the response to another class or method for further processing or saving
        DataProcessor.saveResponse(responseBody); // Example method call
    }
}
