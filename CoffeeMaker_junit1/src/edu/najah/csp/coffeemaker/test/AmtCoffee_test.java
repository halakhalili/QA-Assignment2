

package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;


public class AmtCoffee_test {

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
     public void setAmtCoffeeTest(){
   	 System.out.println("The start of the coffee quantities testing process");

    	 
    	 //test 1
     try{
     r.setAmtCoffee("");
     assertEquals(0,r.getAmtCoffee(),0.001);
     }
     catch(RecipeException e){
     assertTrue("The entered value must be positive, please :)",r.getAmtCoffee()<=0);
     }
     
       //test 2
     try{
     r.setAmtCoffee("two");
     assertNull(r.getAmtCoffee());
     }
     catch(RecipeException e){
     assertTrue("The value entered must be in numbers and positive, please :)",r.getAmtCoffee()<=0);
     }
     
     //test 3
     try{
     r.setAmtCoffee("-5");
     assertEquals(0,r.getAmtCoffee(),0.001);
     }
     catch(RecipeException e){
     assertTrue("The entered value must be positive, please :)",r.getAmtCoffee()<=0);
     }
     

     //test 4
     try{
    	 r.setAmtCoffee("1/5");
    	 assertEquals(0,r.getAmtCoffee() ,0.001);
    	 }
    	 catch(RecipeException e){
    	 assertTrue("The entered value must be positive, please :)",r.getAmtCoffee()<=0);
    	 }

     //test 5
     try{
    	 r.setAmtCoffee("4");
    	 assertEquals(4,r.getAmtCoffee() ,0.001);
    	 assertTrue(r.getAmtCoffee()>0);
    	 }
    	 catch(RecipeException e){
    	 assertTrue("The entered value must be positive, please :)",r.getAmtCoffee()<=0);
    	 }
     
     System.out.println("The Coffee quantities testing Done");

     }
   	

	

}



