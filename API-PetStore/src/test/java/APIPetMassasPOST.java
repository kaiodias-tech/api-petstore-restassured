import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

import io.restassured.response.Response;



public class APIPetMassasPOST {
	
	@Test
	public void Pet1( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 0,\r\n"
					+ "  \"category\": {\r\n"
					+ "    \"id\": 1,\r\n"
					+ "    \"name\": \"dog\"\r\n"
					+ "  },\r\n"
					+ "  \"name\": \"Ragna\",\r\n"
					+ "  \"photoUrls\": [\r\n"
					+ "    \"\"\r\n"
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
	public void Pet2( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 0,\r\n"
					+ "  \"category\": {\r\n"
					+ "    \"id\": 1,\r\n"
					+ "    \"name\": \"dog\"\r\n"
					+ "  },\r\n"
					+ "  \"name\": \"Nique\",\r\n"
					+ "  \"photoUrls\": [\r\n"
					+ "    \"\"\r\n"
					+ "  ],\r\n"
					+ "  \"tags\": [\r\n"
					+ "    {\r\n"
					+ "      \"id\": 1,\r\n"
					+ "      \"name\": \"Maltes\"\r\n"
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
	public void Pet3( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 0,\r\n"
					+ "  \"category\": {\r\n"
					+ "    \"id\": 1,\r\n"
					+ "    \"name\": \"dog\"\r\n"
					+ "  },\r\n"
					+ "  \"name\": \"Zeus\",\r\n"
					+ "  \"photoUrls\": [\r\n"
					+ "    \"\"\r\n"
					+ "  ],\r\n"
					+ "  \"tags\": [\r\n"
					+ "    {\r\n"
					+ "      \"id\": 1,\r\n"
					+ "      \"name\": \"Pitbull\"\r\n"
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
	public void Pet4( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 0,\r\n"
					+ "  \"category\": {\r\n"
					+ "    \"id\": 1,\r\n"
					+ "    \"name\": \"dog\"\r\n"
					+ "  },\r\n"
					+ "  \"name\": \"Perseus\",\r\n"
					+ "  \"photoUrls\": [\r\n"
					+ "    \"\"\r\n"
					+ "  ],\r\n"
					+ "  \"tags\": [\r\n"
					+ "    {\r\n"
					+ "      \"id\": 1,\r\n"
					+ "      \"name\": \"Bulldog\"\r\n"
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
	public void Pet5( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 0,\r\n"
					+ "  \"category\": {\r\n"
					+ "    \"id\": 1,\r\n"
					+ "    \"name\": \"dog\"\r\n"
					+ "  },\r\n"
					+ "  \"name\": \"Yori\",\r\n"
					+ "  \"photoUrls\": [\r\n"
					+ "    \"\"\r\n"
					+ "  ],\r\n"
					+ "  \"tags\": [\r\n"
					+ "    {\r\n"
					+ "      \"id\": 1,\r\n"
					+ "      \"name\": \"Fila\"\r\n"
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
	public void Pet6( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 0,\r\n"
					+ "  \"category\": {\r\n"
					+ "    \"id\": 1,\r\n"
					+ "    \"name\": \"cat\"\r\n"
					+ "  },\r\n"
					+ "  \"name\": \"Jenny\",\r\n"
					+ "  \"photoUrls\": [\r\n"
					+ "    \"\"\r\n"
					+ "  ],\r\n"
					+ "  \"tags\": [\r\n"
					+ "    {\r\n"
					+ "      \"id\": 1,\r\n"
					+ "      \"name\": \"azul russo\"\r\n"
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
	public void Pet7( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 0,\r\n"
					+ "  \"category\": {\r\n"
					+ "    \"id\": 1,\r\n"
					+ "    \"name\": \"cat\"\r\n"
					+ "  },\r\n"
					+ "  \"name\": \"Ted\",\r\n"
					+ "  \"photoUrls\": [\r\n"
					+ "    \"\"\r\n"
					+ "  ],\r\n"
					+ "  \"tags\": [\r\n"
					+ "    {\r\n"
					+ "      \"id\": 1,\r\n"
					+ "      \"name\": \"siamês\"\r\n"
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
	public void Pet8( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 0,\r\n"
					+ "  \"category\": {\r\n"
					+ "    \"id\": 1,\r\n"
					+ "    \"name\": \"cat\"\r\n"
					+ "  },\r\n"
					+ "  \"name\": \"Alice\",\r\n"
					+ "  \"photoUrls\": [\r\n"
					+ "    \"\"\r\n"
					+ "  ],\r\n"
					+ "  \"tags\": [\r\n"
					+ "    {\r\n"
					+ "      \"id\": 1,\r\n"
					+ "      \"name\": \"sem raça definida\"\r\n"
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
	public void Pet9( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 0,\r\n"
					+ "  \"category\": {\r\n"
					+ "    \"id\": 1,\r\n"
					+ "    \"name\": \"cat\"\r\n"
					+ "  },\r\n"
					+ "  \"name\": \"Ton\",\r\n"
					+ "  \"photoUrls\": [\r\n"
					+ "    \"\"\r\n"
					+ "  ],\r\n"
					+ "  \"tags\": [\r\n"
					+ "    {\r\n"
					+ "      \"id\": 1,\r\n"
					+ "      \"name\": \"sem raça definida\"\r\n"
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
	public void Pet10( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 0,\r\n"
					+ "  \"category\": {\r\n"
					+ "    \"id\": 1,\r\n"
					+ "    \"name\": \"cat\"\r\n"
					+ "  },\r\n"
					+ "  \"name\": \"Paçoca\",\r\n"
					+ "  \"photoUrls\": [\r\n"
					+ "    \"\"\r\n"
					+ "  ],\r\n"
					+ "  \"tags\": [\r\n"
					+ "    {\r\n"
					+ "      \"id\": 1,\r\n"
					+ "      \"name\": \"ciamês\"\r\n"
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
}

