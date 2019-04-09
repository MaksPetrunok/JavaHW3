package com.epam.expression;

public class Sum extends Operator {

    public Sum(String left, String right) {
        super(left, right);
    }

    public int evaluate() {
        return this.left.evaluate() + this.right.evaluate();
    }

    @Override
    public String toString() {
        return this.left + " + " + this.right;
    }
}
