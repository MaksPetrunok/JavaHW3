package com.max.recipe;

import java.time.LocalDate;

public class RecipeUpdateDose extends RecipeDecorator {

    public RecipeUpdateDose(Recipe coreRecipe) {
        super(coreRecipe);
    }

    @Override
    public String getAssignee() {
        return coreRecipe.getAssignee();
    }

    @Override
    public LocalDate getExpirationDate() {
        return coreRecipe.getExpirationDate();
    }

    @Override
    public String getDescription() {
        return coreRecipe.getDescription().concat(" Increase portion by 20 ml.");
    }
}
