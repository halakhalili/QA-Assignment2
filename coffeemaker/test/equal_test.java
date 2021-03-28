package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;



public class equal_test {

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
	public void testEqualsObject()  throws RecipeException {
		 System.out.println("start equal test");
		 
		
		 Recipe rec1 = new Recipe();
		 Recipe rec2 = new Recipe();
		 
		 //test1 compare
		 assertEquals(rec1, rec2); 
		 rec1.setName("milk");
		 assertNotEquals(rec1, rec2); 
		 
		 try{
		 rec2.setName(null); 
		 rec2.setPrice("5");
		 assertNotEquals(rec1, rec2);
		 }
		 catch(RecipeException e){
		 assertTrue("Input positive price",rec2.getPrice()<0);
		 assertNull(rec2.getName());
		 }
		 System.out.println(" end equal test");
		 }
		
	}


