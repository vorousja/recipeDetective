package com.techelevator.recipe;

import java.util.List;

import com.techelevator.model.Recipe;

public interface RecipeDAO {
	public List<Recipe> getRecipesByIngredient(String ingredient);
}
