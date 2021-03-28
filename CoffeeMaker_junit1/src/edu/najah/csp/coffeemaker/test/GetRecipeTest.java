package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.RecipeBook;

public class GetRecipeTest {

	@Test
	public void testGetRecipes() {
		
		RecipeBook objrecipeBook = new RecipeBook();
		
		assertNotNull(objrecipeBook.getRecipes());
	}
}