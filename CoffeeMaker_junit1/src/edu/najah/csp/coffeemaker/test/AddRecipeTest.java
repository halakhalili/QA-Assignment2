
package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;



import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.RecipeBook;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;
public class AddRecipeTest {

	@Test
	public void testAddRecipe() throws RecipeException {
		RecipeBook objRecipeBook = new RecipeBook();
		
		Recipe objRecipe = new Recipe();
		objRecipe.setName("recipe");
			
		assertTrue(objRecipeBook.addRecipe(objRecipe));
		
		}
	
	@Test
	public void testAddRecipe1() throws RecipeException {

		RecipeBook objRecipeBook = new RecipeBook();
		
		Recipe objRecipe = new Recipe();
		objRecipe.setName("recipe");
		
		Recipe objRecipe2 = new Recipe();
		objRecipe2.setName("recipe");
		
		objRecipeBook.addRecipe(objRecipe);
		
		assertFalse(objRecipeBook.addRecipe(objRecipe2));
		
	}
}
