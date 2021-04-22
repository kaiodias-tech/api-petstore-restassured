import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

import io.restassured.response.Response;



public class APIPetVendasPOST {
	
	@Test
	public void vendaPet1( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 1000,\r\n"
					+ "  \"petId\": 9222968140498001910,\r\n"
					+ "  \"quantity\": 1,\r\n"
					+ "  \"shipDate\": \"2021-04-20T22:19:12.478Z\",\r\n"
					+ "  \"status\": \"delivered\",\r\n"
					+ "  \"complete\": true\r\n"
					+ "}")
		.when()
			.post("https://petstore.swagger.io/v2/store/order")
		.then()
			.log()
			.all()
			.statusCode(200);
	}
	
	
	@Test
	public void vendaPet2( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 1001,\r\n"
					+ "  \"petId\": 9222968140498001931,\r\n"
					+ "  \"quantity\": 1,\r\n"
					+ "  \"shipDate\": \"2021-04-20T22:19:12.478Z\",\r\n"
					+ "  \"status\": \"delivered\",\r\n"
					+ "  \"complete\": true\r\n"
					+ "}")
		.when()
			.post("https://petstore.swagger.io/v2/store/order")
		.then()
			.log()
			.all()
			.statusCode(200);
	}
	
	
	@Test
	public void vendaPet3( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 1002,\r\n"
					+ "  \"petId\": 9222968140498001932,\r\n"
					+ "  \"quantity\": 1,\r\n"
					+ "  \"shipDate\": \"2021-04-20T22:19:12.478Z\",\r\n"
					+ "  \"status\": \"delivered\",\r\n"
					+ "  \"complete\": true\r\n"
					+ "}")
		.when()
			.post("https://petstore.swagger.io/v2/store/order")
		.then()
			.log()
			.all()
			.statusCode(200);
	}
	
	
	@Test
	public void vendaPet4( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 1003,\r\n"
					+ "  \"petId\": 9222968140498001933,\r\n"
					+ "  \"quantity\": 1,\r\n"
					+ "  \"shipDate\": \"2021-04-20T22:19:12.478Z\",\r\n"
					+ "  \"status\": \"delivered\",\r\n"
					+ "  \"complete\": true\r\n"
					+ "}")
		.when()
			.post("https://petstore.swagger.io/v2/store/order")
		.then()
			.log()
			.all()
			.statusCode(200);
	}
	
	
	@Test
	public void vendaPet5( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 1004,\r\n"
					+ "  \"petId\": 9222968140498001945,\r\n"
					+ "  \"quantity\": 1,\r\n"
					+ "  \"shipDate\": \"2021-04-20T22:19:12.478Z\",\r\n"
					+ "  \"status\": \"delivered\",\r\n"
					+ "  \"complete\": true\r\n"
					+ "}")
		.when()
			.post("https://petstore.swagger.io/v2/store/order")
		.then()
			.log()
			.all()
			.statusCode(200);
	}
	
	
	@Test
	public void vendaPet6( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 2000,\r\n"
					+ "  \"petId\": 9222968140498001949,\r\n"
					+ "  \"quantity\": 1,\r\n"
					+ "  \"shipDate\": \"2021-04-20T22:19:12.478Z\",\r\n"
					+ "  \"status\": \"approved\",\r\n"
					+ "  \"complete\": true\r\n"
					+ "}")
		.when()
			.post("https://petstore.swagger.io/v2/store/order")
		.then()
			.log()
			.all()
			.statusCode(200);
	}
	
	
	@Test
	public void vendaPet7( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 2001,\r\n"
					+ "  \"petId\": 9222968140498001950,\r\n"
					+ "  \"quantity\": 1,\r\n"
					+ "  \"shipDate\": \"2021-04-20T22:19:12.478Z\",\r\n"
					+ "  \"status\": \"approved\",\r\n"
					+ "  \"complete\": true\r\n"
					+ "}")
		.when()
			.post("https://petstore.swagger.io/v2/store/order")
		.then()
			.log()
			.all()
			.statusCode(200);
	}
	
	
	@Test
	public void vendaPet8( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 2002,\r\n"
					+ "  \"petId\": 9222968140498001952,\r\n"
					+ "  \"quantity\": 1,\r\n"
					+ "  \"shipDate\": \"2021-04-20T22:19:12.478Z\",\r\n"
					+ "  \"status\": \"approved\",\r\n"
					+ "  \"complete\": true\r\n"
					+ "}")
		.when()
			.post("https://petstore.swagger.io/v2/store/order")
		.then()
			.log()
			.all()
			.statusCode(200);
	}
	
	
	@Test
	public void vendaPet9( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 1003,\r\n"
					+ "  \"petId\": 9222968140498001955,\r\n"
					+ "  \"quantity\": 1,\r\n"
					+ "  \"shipDate\": \"2021-04-20T22:19:12.478Z\",\r\n"
					+ "  \"status\": \"delivered\",\r\n"
					+ "  \"complete\": true\r\n"
					+ "}")
		.when()
			.post("https://petstore.swagger.io/v2/store/order")
		.then()
			.log()
			.all()
			.statusCode(200);
	}
	
	
	@Test
	public void vendaPet10( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 2004,\r\n"
					+ "  \"petId\": 9222968140498001956,\r\n"
					+ "  \"quantity\": 1,\r\n"
					+ "  \"shipDate\": \"2021-04-20T22:19:12.478Z\",\r\n"
					+ "  \"status\": \"approved\",\r\n"
					+ "  \"complete\": true\r\n"
					+ "}")
		.when()
			.post("https://petstore.swagger.io/v2/store/order")
		.then()
			.log()
			.all()
			.statusCode(200);
	}
}

