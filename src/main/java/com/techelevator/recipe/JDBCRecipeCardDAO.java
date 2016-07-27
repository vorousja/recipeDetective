package com.techelevator.recipe;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.model.Recipe;
@Component

	public class JDBCRecipeCardDAO implements RecipeDAO{
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JDBCRecipeCardDAO(DataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	
	public List<Recipe> getRecipesByIngredient(String ingredient) {
		
		List<Recipe> allRecipes = new ArrayList<>();
		String sqlForAllRecipes = "SELECT * FROM recipeCard WHERE ingredients LIKE ?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sqlForAllRecipes,"%"+ingredient+"%");
		while (result.next() ){
			Recipe recipe = new Recipe();
			recipe.setRecipeId(result.getLong("recipe_id"));
			recipe.setInfo(result.getString("description"));
			recipe.setIngredient(result.getString("ingredients"));
			recipe.setInstructions(result.getString("instructions"));
			recipe.setRecipeCard(result.getString("title"));
			allRecipes.add(recipe);
		}
		return allRecipes;
	}

	
}
