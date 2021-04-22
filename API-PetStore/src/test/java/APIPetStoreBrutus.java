import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

import io.restassured.response.Response;



public class APIPetStoreBrutus {
	
	@Test
	public void criandoUsuario( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "\"id\": 0,\r\n"
					+ "\"username\": \"maria.assuncao\",\r\n"
					+ "\"firstName\": \"Maria\",\r\n"
					+ "\"lastName\": \"Assunção\",\r\n"
					+ "\"email\": \"maria.a@yahoo.com\",\r\n"
					+ "\"password\": \"testes123456\",\r\n"
					+ "\"phone\": \"(11) 2222-3333\",\r\n"
					+ "\"userStatus\": 0\r\n"
					+ "}")
		.when()
			.post("https://petstore.swagger.io/v2/user")
		.then()
			.log()
			.all()
			.statusCode(200);
	}
	
	
	@Test
	public void criandoPet( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 0,\r\n"
					+ "  \"category\": {\r\n"
					+ "    \"id\": 1,\r\n"
					+ "    \"name\": \"dog\"\r\n"
					+ "  },\r\n"
					+ "  \"name\": \"Brutus\",\r\n"
					+ "  \"photoUrls\": [\r\n"
					+ "    \"https://tudosobrecachorros.com.br/wp-content/uploads/Bulldog-Franc%C3%AAs-08.jpg\"\r\n"
					+ "  ],\r\n"
					+ "  \"tags\": [\r\n"
					+ "    {\r\n"
					+ "      \"id\": 1,\r\n"
					+ "      \"name\": \"Bulldog Francês\"\r\n"
					+ "    }\r\n"
					+ "  ],\r\n"
					+ "  \"status\": \"available\"\r\n"
					+ "}")
		.when()
			.post("https://petstore.swagger.io/v2/pet")
		.then()
			.log()
			.all()
			.statusCode(200);
	}
	

	@Test
	public void vendendoPet( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 0,\r\n"
					+ "  \"petId\": 9222968140498012620,\r\n"
					+ "  \"quantity\": 1,\r\n"
					+ "  \"shipDate\": \"2021-04-21T22:19:12.478Z\",\r\n"
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
	
}
