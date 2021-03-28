package edu.najah.csp.coffeemaker;

import edu.najah.csp.coffeemaker.exceptions.RecipeException;

/**
 * @author Eng
 */
public class Recipe {
    private String name;
    private double price;
    private double amtCoffee;
    private double amtMilk;
    private double amtSugar;
    private double amtChocolate;
    
    /**
     * Creates a default recipe for the coffee maker.
     */
    public Recipe() {
    	this.name = "";
    	this.price = 0.0;
    	this.amtCoffee = 0.0;
    	this.amtMilk = 0.0;
    	this.amtSugar = 0.0;
    	this.amtChocolate = 0.0;
    }
    
    /**
	 * @return   Returns the amtChocolate.
	 */
    public double getAmtChocolate() {
		return amtChocolate;
	}
    /**
	 * @param amtChocolate   The amtChocolate to set.
	 */
    public void setAmtChocolate(String expected) throws RecipeException {
    	double amtChocolate = 0;
    	try {
    		amtChocolate = Double.parseDouble(expected);
    	} catch (NumberFormatException e) {
    		throw new RecipeException("Units of chocolate must be a positive integer");
    	}
		if (amtChocolate >= 0) {
			this.amtChocolate = amtChocolate;
		} else {
			throw new RecipeException("Units of chocolate must be a positive integer");
		}
	}
    /**
	 * @return   Returns the amtCoffee.
	 */
    public double getAmtCoffee() {
		return amtCoffee;
	}
    /**
	 * @param amtCoffee   The amtCoffee to set.
	 */
    public void setAmtCoffee(String coffee) throws RecipeException {
    	double amtCoffee = 0;
    	try {
    		amtCoffee = Double.parseDouble(coffee);
    	} catch (NumberFormatException e) {
    		throw new RecipeException("Units of coffee must be a positive integer");
    	}
		if (amtCoffee >= 0) {
			this.amtCoffee = amtCoffee;
		} else {
			throw new RecipeException("Units of coffee must be a positive integer");
		}
	}
    /**
	 * @return   Returns the amtMilk.
	 */
    public double getAmtMilk() {
		return amtMilk;
	}
    /**
	 * @param amtMilk   The amtMilk to set.
	 */
    public void setAmtMilk(String milk) throws RecipeException{
    	double amtMilk = 0;
    	try {
    		amtMilk = Double.parseDouble(milk);
    	} catch (NumberFormatException e) {
    		throw new RecipeException("Units of milk must be a positive integer");
    	}
		if (amtMilk >= 0) {
			this.amtMilk = amtMilk;
		} else {
			throw new RecipeException("Units of milk must be a positive integer");
		}
	}
    /**
	 * @return   Returns the amtSugar.
	 */
    public double getAmtSugar() {
		return amtSugar;
	}
    /**
	 * @param amtSugar   The amtSugar to set.
	 */
    public void setAmtSugar(String sugar) throws RecipeException {
    	double amtSugar = 0;
    	try {
    		amtSugar = Double.parseDouble(sugar);
    	} catch (NumberFormatException e) {
    		throw new RecipeException("Units of sugar must be a positive integer");
    	}
		if (amtSugar >= 0) {
			this.amtSugar = amtSugar;
		} else {
			throw new RecipeException("Units of sugar must be a positive integer");
		}
	}
    /**
	 * @return   Returns the name.
	 */
    public String getName() {
		return name;
	}
    /**
	 * @param name   The name to set.
	 */
    public void setName(String name) throws RecipeException {
    	if(name != null) {
    		this.name = name;
    	}
    	}
    	
	
    /**
	 * @return   Returns the price.
	 */
    public double getPrice() {
		return price;
	}
    /**
	 * @param price   The price to set.
	 */
    public void setPrice(String price) throws RecipeException{
    	double amtPrice = 0;
    	try {
    		amtPrice = Double.parseDouble(price);
    	} catch (NumberFormatException e) {
    		throw new RecipeException("Price must be a positive integer");
    	}
		if (amtPrice >= 0) {
			this.price = amtPrice;
		} else {
			throw new RecipeException("Price must be a positive integer");
		}
	} 
    
    /**
     * Returns the name of the recipe.
     * @return String
     */
    public String toString() {
    	return name;
    	
    }

	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Recipe other = (Recipe) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
