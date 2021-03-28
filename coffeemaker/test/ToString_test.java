package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class ToString_test {

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
	public void testToString() throws RecipeException {
		
		System.out.println("");
		 //Test 1
		
		 r.setName("choco");
		 assertEquals("choco",r.toString());
		 //Test 2
		 
		 r.setName("");
		 assertEquals("",r.toString());
		 //Test 3
		 
		 r.setName(null);
		 assertEquals("",r.getName());
		 
	}
	
	

}
