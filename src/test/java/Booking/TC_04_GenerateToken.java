package Booking;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

import Utils.BasePathData;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC_04_GenerateToken {
	
	String token;

	@Test
	public void getToken() {
		try {
			String gettoken = FileUtils.readFileToString(new File(BasePathData.Generate_Token), "UTF-8");
			Response response =
			RestAssured
			.given()
			.contentType(ContentType.JSON)
			.body(gettoken)
			.baseUri("https://restful-booker.herokuapp.com/auth")
			.when()
			.get()
			.then()
			.assertThat()
			.statusCode(200)
			.log().body()
			.extract()
			.response();
			
			token = response.path("token");
			System.out.println("token is:"+ token);
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
}
