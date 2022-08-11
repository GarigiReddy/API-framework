package Genericlibrary;

import io.restassured.response.Response;

public class RestAssuredLibrary{
	/**
	 * 
	 * @param respose
	 * @param path
	 * @return
	 */
public String getJsonData(Response respose,String path) {
	String jsonData = respose.jsonPath().get(path);
	return jsonData;
	
}
}
