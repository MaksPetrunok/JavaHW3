package com.max;

import java.util.ArrayList;
import java.util.List;

public class MainIncubator {

    public static void main(String[] args) {

        List<Bacteria> incubator = new ArrayList<>();
        incubator.add(new Bacteria(0));

        try {
//            addBacteriaDirect(incubator);
            addBacteriaSmart(incubator);
        } catch (OutOfMemoryError e) {
            System.out.println("Incubator size before memory error: " + incubator.size());
        }

    }

    /*
    Max number of bacteria before OutOfMemoryError: 548,343
     */
    public static void addBacteriaDirect(List<Bacteria> list) throws OutOfMemoryError {
        while (true) {
            int currentBacterias = list.size();
            for (int i=0; i<currentBacterias; i++) {
                list.add(new Bacteria(list.get(i).getGeneration() + 1));
            }
        }
    }

    /*
    Max number of bacteria before OutOfMemoryError: 157,704,907
     */
    public static void addBacteriaSmart(List<Bacteria> list) throws OutOfMemoryError {
        while (true) {
            int currentBacterias = list.size();
            for (int i=0; i<currentBacterias; i++) {
                list.add(BacteriaFactory.createBacteria(list.get(i).getGeneration() + 1));
            }
        }
    }
}
