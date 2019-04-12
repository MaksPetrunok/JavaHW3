package com.epam.strategy;

public class Run implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("Running...");
    }
}
