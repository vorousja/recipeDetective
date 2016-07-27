package com.techelevator.model;

public class Recipe {
	
	private String recipeCard;
	private String instructions;
	private String ingredient;
	private String info;
	private Long recipeId;
	
	public Long getRecipeId() {
		return recipeId;
	}
	public void setRecipeId(Long recipeId) {
		this.recipeId = recipeId;
	}
	public String getRecipeCard() {
		return recipeCard;
	}
	public void setRecipeCard(String recipeCard) {
		this.recipeCard = recipeCard;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	public String getIngredient() {
		return ingredient;
	}
	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}
	
	public String getInfo(){
		return info;
	}
	public void setInfo(String info) {
		this.info = info;

	}
	
	
	
}
