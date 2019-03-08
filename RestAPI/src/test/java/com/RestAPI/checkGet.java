package com.RestAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class checkGet {
	
	@Test
	public void testResponseCode() {
		
		Response resp = RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London&appid=39c793b181e31c7c5a46cc138e6e7909");
		
		int code = resp.getStatusCode();
		System.out.println(code);
		
		String data = resp.asString();
		System.out.println(data);
		//resp.asString();
		
		Assert.assertEquals(200, code);
	}

}
