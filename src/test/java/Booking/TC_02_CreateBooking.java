package Booking;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

import Utils.BasePathData;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC_02_CreateBooking {
	@Test
	public void CreateBooking() {
		
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
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
