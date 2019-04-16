package com.max.recipe;

import java.time.LocalDate;

public class RecipeProlongation extends RecipeDecorator {

    public RecipeProlongation(Recipe coreRecipe) {
        super(coreRecipe);
    }

    @Override
    public String getAssignee() {
        return coreRecipe.getAssignee();
    }

    @Override
    public LocalDate getExpirationDate() {
        return coreRecipe.getExpirationDate().plusDays(3);
    }

    @Override
    public String getDescription() {
        return coreRecipe.getDescription();
    }

//    @Override
//    public String getDescription() {
//        return coreRecipe.getDescription().concat(" Increase portion by 20 ml.");
//    }
}
