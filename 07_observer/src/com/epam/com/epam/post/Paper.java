package com.epam.com.epam.post;

public class Paper {

    private int id;

    public Paper(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Paper " + id;
    }
}
