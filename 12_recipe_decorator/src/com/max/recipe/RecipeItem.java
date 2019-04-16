package com.max.recipe;

import java.time.LocalDate;

public class RecipeItem extends Recipe {

    private final String assignee;
    private final LocalDate expiration;
    private final String description;

    public RecipeItem(String assignee) {
        this.assignee = assignee;
        this.expiration = LocalDate.now().plusDays(7);
        this.description = "Drink 100 ml of whiskey/samogon/tequila in the morning.";
    }

    @Override
    public String getAssignee() {
        return assignee;
    }

    @Override
    public LocalDate getExpirationDate() {
        return this.expiration;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
