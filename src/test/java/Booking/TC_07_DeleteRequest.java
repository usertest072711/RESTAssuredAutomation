package Booking;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

import Utils.BasePathData;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC_07_DeleteRequest {
	int bookingid = 0;
	String token;

	@Test (priority=1)
	public void createbooking() {
		try {
			String Booking = FileUtils.readFileToString(new File(BasePathData.Create_File), "UTF-8");
			Response response =
			RestAssured
			.given()
			.contentType(ContentType.JSON)
			.body(Booking)
			.baseUri("https://restful-booker.herokuapp.com/booking")
			.when()
			.post()
			.then()
			.assertThat()
			.statusCode(200)
			.log().body()
			.extract()
			.response();
			
			bookingid = response.path("bookingid");		
			System.out.println("booking id is:"+ bookingid);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	@Test (priority=2)
	public void gettoken() {
		
		try {
			String gettoken = FileUtils.readFileToString(new File(BasePathData.Generate_Token), "UTF-8");
			Response response =
			RestAssured
			.given()
			.contentType(ContentType.JSON)
			.body(gettoken)
			.baseUri("https://restful-booker.herokuapp.com/auth")
			.when()
			.post()
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
		
	@Test (priority=3)
public void deletebooking() throws IOException {
		
		RestAssured
		.given()
		.contentType(ContentType.JSON)
		
		.header("Cookie", "token="+token)
		.baseUri("https://restful-booker.herokuapp.com/booking")
		.when()
		.delete("/{bookingid}",bookingid)
		.then()
		.assertThat()
		.statusCode(200)
		.log().body();
		
			
		
		
	

	
		

		}	


}
