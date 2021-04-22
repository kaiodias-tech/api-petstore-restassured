import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

import io.restassured.response.Response;



public class APIPetMassasPUT {
	
	@Test
	public void altStatusPet1( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 9222968140498001910,\r\n"
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
					+ "      \"id\": 1000,\r\n"
					+ "      \"name\": \"Vendido para Levi \"\r\n"
					+ "    }\r\n"
					+ "  ],\r\n"
					+ "  \"status\": \"delivered\"\r\n"
					+ "}")
		.when()
			.put("https://petstore.swagger.io/v2/pet")
		.then()
			.log()
			.all()
			.statusCode(200);
	}
	
	
	@Test
	public void altStatusPet2( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 9222968140498001931,\r\n"
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
					+ "      \"id\": 1001,\r\n"
					+ "      \"name\": \"Vendido para Fran\"\r\n"
					+ "    }\r\n"
					+ "  ],\r\n"
					+ "  \"status\": \"delivered\"\r\n"
					+ "}")
		.when()
			.post("https://petstore.swagger.io/v2/pet")
		.then()
			.log()
			.all()
			.statusCode(200);
	}
	
	
	@Test
	public void altStatusPet3( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 9222968140498001932,\r\n"
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
					+ "      \"id\": 1002,\r\n"
					+ "      \"name\": \"Vendido para a Mari\"\r\n"
					+ "    }\r\n"
					+ "  ],\r\n"
					+ "  \"status\": \"delivered\"\r\n"
					+ "}")
		.when()
			.post("https://petstore.swagger.io/v2/pet")
		.then()
			.log()
			.all()
			.statusCode(200);
	}
	
	
	@Test
	public void valtStatusPet4( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 9222968140498001933,\r\n"
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
					+ "      \"id\": 1003,\r\n"
					+ "      \"name\": \"Vendido para o Renan\"\r\n"
					+ "    }\r\n"
					+ "  ],\r\n"
					+ "  \"status\": \"delivered\"\r\n"
					+ "}")
		.when()
			.post("https://petstore.swagger.io/v2/pet")
		.then()
			.log()
			.all()
			.statusCode(200);
	}
	
	
	@Test
	public void altStatusPet5( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 9222968140498001945,\r\n"
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
					+ "      \"id\": 1004,\r\n"
					+ "      \"name\": \"Vendido para o Giovani\"\r\n"
					+ "    }\r\n"
					+ "  ],\r\n"
					+ "  \"status\": \"delivered\"\r\n"
					+ "}")
		.when()
			.post("https://petstore.swagger.io/v2/pet")
		.then()
			.log()
			.all()
			.statusCode(200);
	}
	
	
	@Test
	public void altStatusPet6( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 9222968140498001949,\r\n"
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
					+ "      \"id\": 2000,\r\n"
					+ "      \"name\": \"Reservado para o Levi\"\r\n"
					+ "    }\r\n"
					+ "  ],\r\n"
					+ "  \"status\": \"approved\"\r\n"
					+ "}")
		.when()
			.post("https://petstore.swagger.io/v2/pet")
		.then()
			.log()
			.all()
			.statusCode(200);
	}
	
	
	@Test
	public void valtStatusPet7( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 9222968140498001950,\r\n"
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
					+ "      \"id\": 2001,\r\n"
					+ "      \"name\": \"Reservado para a Fran\"\r\n"
					+ "    }\r\n"
					+ "  ],\r\n"
					+ "  \"status\": \"approved\"\r\n"
					+ "}")
		.when()
			.post("https://petstore.swagger.io/v2/pet")
		.then()
			.log()
			.all()
			.statusCode(200);
	}
	
	
	@Test
	public void altStatusPet8( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 9222968140498001952,\r\n"
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
					+ "      \"id\": 2002,\r\n"
					+ "      \"name\": \"Reservado para a Mari\"\r\n"
					+ "    }\r\n"
					+ "  ],\r\n"
					+ "  \"status\": \"approved\"\r\n"
					+ "}")
		.when()
			.post("https://petstore.swagger.io/v2/pet")
		.then()
			.log()
			.all()
			.statusCode(200);
	}
	
	
	@Test
	public void altStatusPet9( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 9222968140498001955,\r\n"
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
					+ "      \"id\": 1003,\r\n"
					+ "      \"name\": \"Reservado para o Renan\"\r\n"
					+ "    }\r\n"
					+ "  ],\r\n"
					+ "  \"status\": \"approved\"\r\n"
					+ "}")
		.when()
			.post("https://petstore.swagger.io/v2/pet")
		.then()
			.log()
			.all()
			.statusCode(200);
	}
	
	
	@Test
	public void altStatusPet10( ) {
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"id\": 9222968140498001956,\r\n"
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
					+ "      \"id\": 2004,\r\n"
					+ "      \"name\": \"Reservado para o Giovani\"\r\n"
					+ "    }\r\n"
					+ "  ],\r\n"
					+ "  \"status\": \"approved\"\r\n"
					+ "}")
		.when()
			.post("https://petstore.swagger.io/v2/pet")
		.then()
			.log()
			.all()
			.statusCode(200);
	}
}