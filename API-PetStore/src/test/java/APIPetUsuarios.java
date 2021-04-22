import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

import io.restassured.response.Response;



public class APIPetUsuarios {
	
	@Test
	public void criandoUsuarios( ) {
		given()
			.contentType("application/json")
			.body("[\r\n"
					+ "  {\r\n"
					+ "    \"id\": 0,\r\n"
					+ "    \"username\": \"levi.tomaz\",\r\n"
					+ "    \"firstName\": \"Levi\",\r\n"
					+ "    \"lastName\": \"Almeida\",\r\n"
					+ "    \"email\": \"llevitomasenzoalmeida@psq.med.br\",\r\n"
					+ "    \"password\": \"oByo6hHFGa\",\r\n"
					+ "    \"phone\": \"(51) 99778-4686\",\r\n"
					+ "    \"userStatus\": 0\r\n"
					+ "  },\r\n"
					+ "\r\n"
					+ "    {\r\n"
					+ "    \"id\": 0,\r\n"
					+ "    \"username\": \"fran.barros\",\r\n"
					+ "    \"firstName\": \"Francisca\",\r\n"
					+ "    \"lastName\": \"Barros\",\r\n"
					+ "    \"email\": \"franciscarafaelabarros@tera.com.br\",\r\n"
					+ "    \"password\": \"KOHa2wFLQZ\",\r\n"
					+ "    \"phone\": \"(66) 98528-1633\",\r\n"
					+ "    \"userStatus\": 0\r\n"
					+ "  },\r\n"
					+ "\r\n"
					+ "    {\r\n"
					+ "    \"id\": 0,\r\n"
					+ "    \"username\": \"mari.almeida\",\r\n"
					+ "    \"firstName\": \"Maria\",\r\n"
					+ "    \"lastName\": \"Almeida\",\r\n"
					+ "    \"email\": \"marialiviamarciaalmeida_@munhozengenharia.com.br\",\r\n"
					+ "    \"password\": \"o6KSAfGpLP\",\r\n"
					+ "    \"phone\": \"(47) 99454-1516\",\r\n"
					+ "    \"userStatus\": 0\r\n"
					+ "  },\r\n"
					+ "\r\n"
					+ "    {\r\n"
					+ "    \"id\": 0,\r\n"
					+ "    \"username\": \"renan.rocha\",\r\n"
					+ "    \"firstName\": \"Renan\",\r\n"
					+ "    \"lastName\": \"Rocha\",\r\n"
					+ "    \"email\": \"rrenanryanrodrigodarocha@pmi.com\",\r\n"
					+ "    \"password\": \"qD8B5XfT5o\",\r\n"
					+ "    \"phone\": \"(98) 99187-9779\",\r\n"
					+ "    \"userStatus\": 0\r\n"
					+ "  },\r\n"
					+ "\r\n"
					+ "    {\r\n"
					+ "    \"id\": 0,\r\n"
					+ "    \"username\": \"giovani.bap\",\r\n"
					+ "    \"firstName\": \"Giovanni\",\r\n"
					+ "    \"lastName\": \"Baptista\",\r\n"
					+ "    \"email\": \"ggiovanninelsonemanuelbaptista@integrasjc.com.br\",\r\n"
					+ "    \"password\": \"EdiAJQ5hDz\",\r\n"
					+ "    \"phone\": \"(95) 98512-2045\",\r\n"
					+ "    \"userStatus\": 0\r\n"
					+ "  }\r\n"
					+ "]")
		.when()
			.post("https://petstore.swagger.io/v2/user/createWithArray")
		.then()
			.log()
			.all()
			.statusCode(200);
	}	
}

