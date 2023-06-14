package API.MARCH_API;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class FourthTestCase
{
public static void main(String[] args) throws FileNotFoundException
{
	File f=new File("../MARCH_API/ArrayBodyData.json");
	FileReader fr=new FileReader(f);
	JSONTokener js=new JSONTokener(fr);
	JSONObject j=new JSONObject(js);
	
	Response rs=
	given ()
	.contentType(ContentType.JSON)
	.body(j.toString())
	.post("http://localhost:3000/DEVStudents");
	
	System.out.println("Status Code is ");
	System.out.println(rs.statusCode());
	
			
}
}
