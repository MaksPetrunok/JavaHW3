package com.max.recipe;

import java.time.LocalDate;

public abstract class Recipe {

    abstract String getAssignee();
    abstract LocalDate getExpirationDate();
    abstract String getDescription();

    @Override
    public String toString() {
        return String.format(
                "Assignee: %s\n" +
                        "Expires on: %s\n" +
                        "Description: %s\n",

                this.getAssignee(),
                this.getExpirationDate().toString(),
                this.getDescription()
        );
    }
}
