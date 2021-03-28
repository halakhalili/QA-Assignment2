package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;


import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.RecipeBook;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class DeleteRecipetest {

	@Test
	public void testDeleteRecipe() throws RecipeException {
		
		RecipeBook objRecipeBook = new RecipeBook();
		Recipe objRecipe = new Recipe();
		int recipeToDelete = 0;
		
		objRecipe.setName("recipe");
		objRecipeBook.addRecipe(objRecipe);
		
		String expected = "recipe";
		String actual = objRecipeBook.deleteRecipe(recipeToDelete);
		
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDeleteRecipe1() {
		
		RecipeBook objRecipeBook = new RecipeBook();

		int recipeToDelete = 0;
		
		assertNull(objRecipeBook.deleteRecipe(recipeToDelete));
	
	}
}