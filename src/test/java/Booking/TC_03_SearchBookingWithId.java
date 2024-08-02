package Booking;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class TC_03_SearchBookingWithId {
	
	@Test
	public void SearchBooking() {
		RestAssured
		.given()
		.contentType(ContentType.JSON)
		.baseUri("https://restful-booker.herokuapp.com/booking/2362")
		.when()
		.get()
		.then()
		.assertThat()
		.statusCode(200)
		.log().all();

		
	}

}
