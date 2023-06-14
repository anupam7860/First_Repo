package API.MARCH_API;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class JsonObjectComplex 

{
public static void main(String[] args) 
{
JSONObject inner=new JSONObject();
inner.put("house no.", "12");
inner.put("sector","1");
inner.put("type","2");

JSONObject outer=new JSONObject();
outer.put("firstname", "anu");
outer.put("lastname", "malik");
outer.put("id", "tome");
outer.put("role","designation");
outer.put("Address",inner);

Response rs=
given()
.contentType(ContentType.JSON)
.body(outer.toString())
.when()
.post("http://localhost:3000/TOPStudents");
System.out.println("Status Code is ");
System.out.println(rs.statusCode());

}
}
