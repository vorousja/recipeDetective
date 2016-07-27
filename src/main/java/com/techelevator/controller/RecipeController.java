package com.techelevator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;

import com.techelevator.model.Recipe;
import com.techelevator.recipe.RecipeDAO;

@Controller

public class RecipeController {
	
	private RecipeDAO recipeDAO;
	
	//Autowire constructor so as to allow Spring to search
	//for a class that has the Component annotation at the top 
	@Autowired
	
	public RecipeController(RecipeDAO recipeDAO){
		this.recipeDAO = recipeDAO;
	}
	@RequestMapping({"/"})
	public String displayLandingView(){
		return "LandingView";
	}
	@RequestMapping({"/recipeResult"}) 
		public String displayRecipeResult(@RequestParam String enteredIngredients, ModelMap model) {
		model.put("recipes", recipeDAO.getRecipesByIngredient(enteredIngredients));
		
		return "recipeResult";
		}
	
}


