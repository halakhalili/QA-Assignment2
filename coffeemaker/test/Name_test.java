package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;


public class Name_test {
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
	 public void setNameTest() throws RecipeException{
	  	 System.out.println("The start of the Name testing process");
	  	 //test 1
	 r.setName("");
	 assertNotNull(r.getName());
	 assertEquals("",r.getName());

	 
	 //test 2
	 r.setName(null) ;
	 assertNotNull(r.getName());
	 assertEquals("",r.getName());
	 
	 //test 3
	 r.setName("choco");
	 assertNotNull(r.getName());
	 assertEquals("choco",r.getName());
	    System.out.println("The Name testing Done");
	 }


}
