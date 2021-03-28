

package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;



public class AmtMilk_test {

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
    public void setAmtMilkTest(){
  	 System.out.println("The start of the Milk quantities testing process");

   	 
   	 //test 1
    try{
    r.setAmtMilk("");
    assertEquals(0,r.getAmtMilk(),0.001);
    }
    catch(RecipeException e){
    assertTrue("The entered value must be positive, please :)",r.getAmtMilk()<=0);
    }
    
      //test 2
    try{
    r.setAmtMilk("two");
    assertNull(r.getAmtMilk());
    }
    catch(RecipeException e){
    assertTrue("The value entered must be in numbers and positive, please :)",r.getAmtMilk()<=0);
    }
    
    //test 3
    try{
    r.setAmtMilk("-5");
    assertEquals(0,r.getAmtMilk(),0.001);
    }
    catch(RecipeException e){
    assertTrue("The entered value must be positive, please :)",r.getAmtMilk()<=0);
    }
    

    //test 4
    try{
   	 r.setAmtMilk("1/5");
   	 assertEquals(0,r.getAmtMilk() ,0.001);
   	 }
   	 catch(RecipeException e){
   	 assertTrue("The entered value must be positive, please :)",r.getAmtMilk()<=0);
   	 }

    //test 5
    try{
   	 r.setAmtMilk("4");
   	 assertEquals(4,r.getAmtMilk() ,0.001);
   	 assertTrue(r.getAmtMilk()>0);
   	 }
   	 catch(RecipeException e){
   	 assertTrue("The entered value must be positive, please :)",r.getAmtMilk()<=0);
   	 }
    
    System.out.println("The Milk quantities testing Done");

    }
  	

	


}
