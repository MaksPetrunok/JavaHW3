package com.epam.expression;

public class Value implements Expression {

    private int value;

    public Value(int value) {
        this.value = value;
    }

    public int evaluate() {
        return this.value;
    }

    @Override
    public String toString() {
        return Integer.toString(this.value);
    }
}
