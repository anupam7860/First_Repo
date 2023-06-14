package API.MARCH_API;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class FirstTestCase
{
public static void main(String[] args) 
{
 Response res=
	given()
 .contentType(ContentType.JSON)
 .when()
 .get("http://localhost:3000/APIStudents/sam3");
 System.out.println("Status code is  " +res.statusCode());
 System.out.println("Response data is ");
 System.out.println(res.asString());
}
}
