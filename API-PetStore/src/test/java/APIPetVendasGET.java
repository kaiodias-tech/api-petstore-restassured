import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

import io.restassured.response.Response;



public class APIPetVendasGET {
	
	@Test
	public void consultaOrderPet1 () {
	given()
		.contentType("application/json")
	.when()
		.get("https://petstore.swagger.io/v2/store/order/1000")
	.then()
		.log()
		.all()
		.statusCode(200);
	}
	
	@Test
	public void consultaOrderPet2 () {
	given()
		.contentType("application/json")
	.when()
		.get("https://petstore.swagger.io/v2/store/order/1001")
	.then()
		.log()
		.all()
		.statusCode(200);
	}
	
	@Test
	public void consultaOrderPet3 () {
	given()
		.contentType("application/json")
	.when()
		.get("https://petstore.swagger.io/v2/store/order/1002")
	.then()
		.log()
		.all()
		.statusCode(200);
	}
	
	@Test
	public void consultaOrderPet4 () {
	given()
		.contentType("application/json")
	.when()
		.get("https://petstore.swagger.io/v2/store/order/1003")
	.then()
		.log()
		.all()
		.statusCode(200);
	}
	
	@Test
	public void consultaOrderPet5 () {
	given()
		.contentType("application/json")
	.when()
		.get("https://petstore.swagger.io/v2/store/order/1004")
	.then()
		.log()
		.all()
		.statusCode(200);
	}
	
	@Test
	public void consultaOrderPet6 () {
	given()
		.contentType("application/json")
	.when()
		.get("https://petstore.swagger.io/v2/store/order/2000")
	.then()
		.log()
		.all()
		.statusCode(200);
	}
	
	@Test
	public void consultaOrderPet7 () {
	given()
		.contentType("application/json")
	.when()
		.get("https://petstore.swagger.io/v2/store/order/2001")
	.then()
		.log()
		.all()
		.statusCode(200);
	}
	
	@Test
	public void consultaOrderPet8 () {
	given()
		.contentType("application/json")
	.when()
		.get("https://petstore.swagger.io/v2/store/order/2002")
	.then()
		.log()
		.all()
		.statusCode(200);
	}
	
	@Test
	public void consultaOrderPet9 () {
	given()
		.contentType("application/json")
	.when()
		.get("https://petstore.swagger.io/v2/store/order/2003")
	.then()
		.log()
		.all()
		.statusCode(200);
	}
	
	@Test
	public void consultaOrderPet10 () {
	given()
		.contentType("application/json")
	.when()
		.get("https://petstore.swagger.io/v2/store/order/2004")
	.then()
		.log()
		.all()
		.statusCode(200);
	}
}