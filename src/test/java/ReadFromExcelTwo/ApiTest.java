package ReadFromExcelTwo;

import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiTest {
	
	@Test
	public void testPostRequest() throws IOException {
        // Define the path to your Excel file
        String excelFilePath = "C:\\Users\\Vaishnavi\\eclipse-workspace\\RESTAssuredAutomation\\ExcelData\\RestTestData.xlsx";
        
        // Read data from the Excel sheet
        String requestBody = ExcelReader.getRequestBody(excelFilePath, 0, 1); // sheetIndex and rowIndex

        // Send POST request with the Excel data as the body
        Response response = RestAssured.given()
                .contentType("application/json")
                .body(requestBody)
                .post("https://your-api-endpoint");

        // Print the response for verification
        System.out.println(response.getBody().asString());
    }

}
