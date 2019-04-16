package com.max.recipe;

import java.time.LocalDate;

public abstract class RecipeDecorator extends Recipe {

    protected Recipe coreRecipe;

    public RecipeDecorator(Recipe coreRecipe) {
        this.coreRecipe = coreRecipe;
    }

    abstract String getAssignee();
    abstract LocalDate getExpirationDate();
    abstract String getDescription();
}
