package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;



public class AmtSugar_test {
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
    public void setAmtSugarTest(){
  	 System.out.println("The start of the Sugar quantities testing process");

   	 
   	 //test 1
    try{
    r.setAmtSugar("");
    assertEquals(0,r.getAmtSugar(),0.001);
    }
    catch(RecipeException e){
    assertTrue("The entered value must be positive, please :)",r.getAmtSugar()<=0);
    }
    
      //test 2
    try{
    r.setAmtSugar("two");
    assertNull(r.getAmtSugar());
    }
    catch(RecipeException e){
    assertTrue("The value entered must be in numbers and positive, please :)",r.getAmtSugar()<=0);
    }
    
    //test 3
    try{
    r.setAmtSugar("-5");
    assertEquals(0,r.getAmtSugar(),0.001);
    }
    catch(RecipeException e){
    assertTrue("The entered value must be positive, please :)",r.getAmtSugar()<=0);
    }
    

    //test 4
    try{
   	 r.setAmtSugar("1/5");
   	 assertEquals(0,r.getAmtSugar() ,0.001);
   	 }
   	 catch(RecipeException e){
   	 assertTrue("The entered value must be positive, please :)",r.getAmtSugar()<=0);
   	 }

    //test 5
    try{
   	 r.setAmtSugar("4");
   	 assertEquals(4,r.getAmtSugar() ,0.001);
   	 assertTrue(r.getAmtSugar()>0);
   	 }
   	 catch(RecipeException e){
   	 assertTrue("The entered value must be positive, please :)",r.getAmtSugar()<=0);
   	 }
    
    System.out.println("The Sugar quantities testing Done");

    }
  	

	



}
