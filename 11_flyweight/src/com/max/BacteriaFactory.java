package com.max;

import java.util.HashMap;

public abstract class BacteriaFactory {

    private static HashMap<Integer, Bacteria> pool = new HashMap<>();

    public static Bacteria createBacteria(Integer generation) {

        if (pool.containsKey(generation)) {
            return pool.get(generation);
        } else {
            Bacteria bacteria = new Bacteria(generation);
            pool.put(generation, bacteria);
            return bacteria;
        }
    }
}
