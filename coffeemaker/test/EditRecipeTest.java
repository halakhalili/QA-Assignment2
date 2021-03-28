package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.RecipeBook;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class EditRecipeTest {

	@Test
	public void testEditRecipe() throws RecipeException {
		
		RecipeBook objRecipeBook = new RecipeBook();
		Recipe objRecipe = new Recipe();
		int recipeToEdit = 0;
		
		objRecipe.setName("recipe");
		objRecipeBook.addRecipe(objRecipe);
		
		String expected = "recipe";
		String actual = objRecipeBook.editRecipe(recipeToEdit, objRecipe);
		
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testEditRecope1() throws RecipeException {
		
		RecipeBook objrRecipeBook = new RecipeBook();
		
		int recipeToEdit = 0;
		
		Recipe newRecipe = new Recipe();
		
		assertNull(objrRecipeBook.editRecipe(recipeToEdit, newRecipe));
	}

}
