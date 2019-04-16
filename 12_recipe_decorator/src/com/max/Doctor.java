package com.max;

import com.max.recipe.Recipe;
import com.max.recipe.RecipeItem;
import com.max.recipe.RecipeProlongation;
import com.max.recipe.RecipeUpdateDose;

public class Doctor {

    public Recipe getRecipe(String assignee) {
        return new RecipeItem(assignee);
    }

    public Recipe prolongateRecipe(Recipe recipe) {
        return new RecipeProlongation(recipe);
    }

    public Recipe updateDose(Recipe recipe) {
        return new RecipeUpdateDose(recipe);
    }

    public static void main(String[] args) {

        Doctor doc = new Doctor();

        Recipe recipe = doc.getRecipe("John");
        Recipe prolongedRecipe = doc.prolongateRecipe(recipe);
        Recipe updatedRecipe = doc.updateDose(recipe);
        Recipe updatedProlonged = doc.updateDose(prolongedRecipe);

        System.out.println("Original recipe:");
        System.out.println(recipe);
        System.out.println("Prolonged recipe:");
        System.out.println(prolongedRecipe);
        System.out.println("Updated recipe:");
        System.out.println(updatedRecipe);
        System.out.println("Updated Prolonged recipe:");
        System.out.println(updatedProlonged);
    }
}
