package APIValidationThree;

import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UseToken {

	
	
		
		public static void writeToFile(String content, String filePath) {
	        try (FileWriter fileWriter = new FileWriter(filePath)) {
	            fileWriter.write(content);
	            System.out.println("Response saved to file: " + filePath);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    
	
		}
		
	}

