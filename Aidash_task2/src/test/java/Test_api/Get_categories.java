package Test_api;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class Get_categories {
	
   @Test
	void get_categories(){
    	
      Response res=RestAssured.
    			given()
    			.header("user-key","d6ff9242adc332ffc58373b23ae0e777")
    			.when()
    			.get("https://developers.zomato.com/api/v2.1/categories");
    	
    	
    	    //System.out.println(res.getBody().asString());
    	    Assert.assertEquals(res.getStatusCode(), 200);
    			

    }
    @Test
    void Get_city() {
    	 Response res=RestAssured.
     			given()
     			.header("user-key","d6ff9242adc332ffc58373b23ae0e777")
     			//.header("city_ids","14")
     			.when()
     			.get("https://developers.zomato.com/api/v2.1/cities?city_ids=14");
     	
     	    
     	    //System.out.println(res.getBody().asString());
     	    String rs =res.getBody().asString();
     	   
     	    Assert.assertEquals(res.getStatusCode(), 200);
     	    //to verify response body
     	    Assert.assertEquals(rs.contains("Indore"),true);
     	    
    
    }
    @Test
    void Get_cuisine() {
    	 Response res=RestAssured.
     			given()
     			.header("user-key","d6ff9242adc332ffc58373b23ae0e777")
     			.when()
     			.get("https://developers.zomato.com/api/v2.1/cuisines?city_id=14");
     	
     	
    	     String rs =res.getBody().asString();
   	   
     	    //System.out.println(res.getBody().asString());
    	     
    	    Assert.assertEquals(rs.contains("American"),true);
    	    
     	    Assert.assertEquals(res.getStatusCode(), 200);
    }
    @Test
    void Get_Dailymenu() {
    	 Response res=RestAssured.
     			given()
     			.header("user-key","d6ff9242adc332ffc58373b23ae0e777")
     			.when()
     			.get("https://developers.zomato.com/api/v2.1/dailymenu?res_id=16507624");
     	
    	     String rs =res.getBody().asString();
     	    //System.out.println(res.getBody().asString());
    	     Assert.assertEquals(rs.contains("21112163"),true);
     	     Assert.assertEquals(res.getStatusCode(), 200);
    }
    
    @Test
    void Get_ListofRestaurant() {
    	 Response res=RestAssured.
     			given()
     			.header("user-key","d6ff9242adc332ffc58373b23ae0e777")
     			.when()
     			.get("https://developers.zomato.com/api/v2.1/establishments?city_id=11");
     					
     	
     	    //System.out.println(res.getBody().asString());
     	    Assert.assertEquals(res.getStatusCode(), 200);
    }
    
    @Test
    void Get_DetailofRestaurant() {
    	 Response res=RestAssured.
     			given()
     			.header("user-key","d6ff9242adc332ffc58373b23ae0e777")
     			.when()
     			.get("https://developers.zomato.com/api/v2.1/restaurant?res_id=16507624");
     	
     	    //System.out.println(res.getBody().asString());
     	    Assert.assertEquals(res.getStatusCode(), 200);
    }
    
    @Test
    void Get_Restaurant_Review() {
    	 Response res=RestAssured.
     			given()
     			.header("user-key","d6ff9242adc332ffc58373b23ae0e777")
     			.when()
     			.get("https://developers.zomato.com/api/v2.1/reviews?res_id=16507624");
     					
     	
     	    //System.out.println(res.getBody().asString());
     	    Assert.assertEquals(res.getStatusCode(), 200);
     	 
      	  
    }
    @Test
    void Get_Search() {
    	 Response res=RestAssured.
     			given()
     			.header("user-key","d6ff9242adc332ffc58373b23ae0e777")
     			.when()
     			.get("https://developers.zomato.com/api/v2.1/search?entity_id=14&entity_type=city&count=10&sort=rating&order=asc");
     					
    	 
  	    //System.out.println(res.getBody().asString());
    	
  	    Assert.assertEquals(res.getStatusCode(), 200);
     	  
    }
	
}
