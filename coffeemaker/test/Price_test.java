package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;


public class Price_test {

Recipe r;
    
    @Before 
    public void setup() {
  	  r=new Recipe();
  	  System.out.println("setup of recipe done");
    }

    @After
    public void Removal() {
	   r=null;
	  System.out.println("remove");

   }
    
   
	@Test
    public void setPriceTest()  throws RecipeException{
  	 System.out.println("The start of the Price testing process");

   	 
   	 //test 1
    try{
    r.setPrice("");
    assertEquals(0,r.getPrice(),0.001);
    }
    catch(RecipeException e){
    assertTrue("The entered value must be positive, please :)",r.getPrice()<=0);
    }
    
      //test 2
    try{
    r.setPrice("two");
    assertNull(r.getPrice());
    }
    catch(RecipeException e){
    assertTrue("The value entered must be in numbers and positive, please :)",r.getPrice()<=0);
    }
    
    //test 3
    try{
    r.setPrice("-5");
    assertEquals(0,r.getPrice(),0.001);
    }
    catch(RecipeException e){
    assertTrue("The entered value must be positive, please :)",r.getPrice()<=0);
    }
    

    //test 4
    try{
   	 r.setPrice("1/5");
   	 assertEquals(0,r.getPrice() ,0.001);
   	 }
   	 catch(RecipeException e){
   	 assertTrue("The entered value must be positive, please :)",r.getPrice()<=0);
   	 }

    //test 5
    try{
   	 r.setPrice("4");
   	 assertEquals(4,r.getPrice() ,0.001);
   	 assertTrue(r.getPrice()>0);
   	 }
   	 catch(RecipeException e){
   	 assertTrue("The entered value must be positive, please :)",r.getPrice()<=0);
   	 }
    
    System.out.println("The Price testing Done");

    }
  	

	




}
