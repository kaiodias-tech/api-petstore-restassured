import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

import io.restassured.response.Response;



public class APIPetMassasGET {
	
	@Test
	public void consultaPet1 () {
	given()
		.contentType("application/json")
	.when()
		.get("https://petstore.swagger.io/v2/pet/9222968140498001910")
	.then()
		.log()
		.all()
		.statusCode(200);
	}
	
	@Test
	public void consultaPet2 () {
	given()
		.contentType("application/json")
	.when()
		.get("https://petstore.swagger.io/v2/pet/9222968140498001931")
	.then()
		.log()
		.all()
		.statusCode(200);
	}
	
	@Test
	public void consultaPet3 () {
	given()
		.contentType("application/json")
	.when()
		.get("https://petstore.swagger.io/v2/pet/9222968140498001932")
	.then()
		.log()
		.all()
		.statusCode(200);
	}
	
	@Test
	public void consultaPet4 () {
	given()
		.contentType("application/json")
	.when()
		.get("https://petstore.swagger.io/v2/pet/9222968140498001933")
	.then()
		.log()
		.all()
		.statusCode(200);
	}
	
	@Test
	public void consultaPet5 () {
	given()
		.contentType("application/json")
	.when()
		.get("https://petstore.swagger.io/v2/pet/9222968140498001945")
	.then()
		.log()
		.all()
		.statusCode(200);
	}
	
	@Test
	public void consultaPet6 () {
	given()
		.contentType("application/json")
	.when()
		.get("https://petstore.swagger.io/v2/pet/9222968140498001949")
	.then()
		.log()
		.all()
		.statusCode(200);
	}
	
	@Test
	public void consultaPet7 () {
	given()
		.contentType("application/json")
	.when()
		.get("https://petstore.swagger.io/v2/pet/9222968140498001950")
	.then()
		.log()
		.all()
		.statusCode(200);
	}
	
	@Test
	public void consultaPet8 () {
	given()
		.contentType("application/json")
	.when()
		.get("https://petstore.swagger.io/v2/pet/9222968140498001952")
	.then()
		.log()
		.all()
		.statusCode(200);
	}
	
	@Test
	public void consultaPet9 () {
	given()
		.contentType("application/json")
	.when()
		.get("https://petstore.swagger.io/v2/pet/9222968140498001955")
	.then()
		.log()
		.all()
		.statusCode(200);
	}
	
	@Test
	public void consultaPet10 () {
	given()
		.contentType("application/json")
	.when()
		.get("https://petstore.swagger.io/v2/pet/9222968140498001956")
	.then()
		.log()
		.all()
		.statusCode(200);
	}
}

