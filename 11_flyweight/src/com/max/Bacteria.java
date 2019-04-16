package com.max;

import java.util.ArrayList;

public class Bacteria {

    private int generation;

    private ArrayList<Bacteria> friends = new ArrayList<>(500);
    private ArrayList<Bacteria> family = new ArrayList<>(200);
    private String description = new String("I am a big fat bacteria and I am gonna eat all your memory");


    public Bacteria(int generation) {
        this.generation = generation;
    }

    public int getGeneration() {
        return generation;
    }
}
