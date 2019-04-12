package com.epam.strategy;

public class Fly implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("Flying...");
    }
}
