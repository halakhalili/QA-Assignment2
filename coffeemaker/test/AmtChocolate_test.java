package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class AmtChocolate_test {
	
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
     public void setAmtChocolateTest(){
    	 System.out.println("The start of the chocolate quantities testing process");
    	 
    	 //test 1
     try{
     r.setAmtChocolate(""); //actual value
     assertEquals(0,r.getAmtChocolate(),0.001); //equal the expected value(0) with actual value ,,,, 0.001 An expression for delta ,,, Because the function without delta is neglected
     }
     catch(RecipeException e){
     assertTrue("The entered value must be positive, please :)",r.getAmtChocolate()<=0);
     }
     
       //test 2
     try{
     r.setAmtChocolate("two");
     assertNull(r.getAmtChocolate());
     }
     catch(RecipeException e){
     assertTrue("The value entered must be in numbers and positive, please :)",r.getAmtChocolate()<=0);
     }
     
     //test 3
     try{
     r.setAmtChocolate("-5");
     assertEquals(0,r.getAmtChocolate(),0.001);
     }
     catch(RecipeException e){
     assertTrue("The entered value must be positive, please :)",r.getAmtChocolate()<=0);
     }
     

     //test 4
     try{
    	 r.setAmtChocolate("1/5");
    	 assertEquals(0,r.getAmtChocolate() ,0.001);
    	 }
    	 catch(RecipeException e){
    	 assertTrue("The entered value must be positive, please :)",r.getAmtChocolate()<=0);
    	 }

     //test 5
     try{
    	 r.setAmtChocolate("4");
    	 assertEquals(4,r.getAmtChocolate() ,0.001);
    	 assertTrue(r.getAmtChocolate()>0);
    	 }
    	 catch(RecipeException e){
    	 assertTrue("The entered value must be positive, please :)",r.getAmtChocolate()<=0);
    	 }
     
     System.out.println("The chocolate quantities testing Done");

     }
   	

	

}
