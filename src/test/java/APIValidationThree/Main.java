package APIValidationThree;

import org.apache.commons.io.FileUtils;

import io.restassured.response.Response;

public class Main {

	public static void main(String[] args) {
		GetToken gk = new GetToken();
        Response resp = GetToken.PostToken();
        
        // Convert the response body to a string
        String responseBody = resp.getBody().asString();
        
        // Define the file path where you want to save the response
        String filePath = "/RESTAssuredAutomation/src/main/resources/StoreData.json";
        
        // Save the response to the file
        UseToken.writeToFile(responseBody, filePath); 

	
	}
	}


