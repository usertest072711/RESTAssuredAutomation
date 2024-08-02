package APIValidationTwo;

import APIValidation.APITest;
import APIValidation.DataProcessor;
import io.restassured.response.Response;

public class TestThree {
	public static void processResponseAndSaveToFile(String filePath) {
        APITest apiTest = new APITest();
        Response apiResponse = apiTest.getApiResponse();
        
        String responseBody = apiResponse.getBody().asString();
        
        // Save the response to a file using DataProcessor
        TestTwo.saveResponseToFile(responseBody, filePath);
    }

}
