package StoreResponse;





import io.restassured.response.Response;

public class RestUtil {
	
	public static String getUrl = "https://gorest.co.in/public/v1/users";

	
	public static Response verify200(Response response) {
	    int statusCode = response.getStatusCode();
	    System.out.println("Status code: " + statusCode);
		return response;
	   
	  }
}
