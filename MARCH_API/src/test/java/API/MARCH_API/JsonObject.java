package API.MARCH_API;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class JsonObject 
{
public static void main(String[] args) 
{
JSONObject js=new JSONObject();
js.put("firstname","tom");
js.put("lastname","hardy");
js.put("id","2");
js.put("designation", "senior");
System.out.println(js.toString());

Response rs=
given()
 .contentType(ContentType.JSON)
 .body(js.toString())
 .when()
 .post("http://localhost:3000/TOPStudents");
System.out.println("Stauts code is ");
System.out.println(rs.statusCode());
}
}
