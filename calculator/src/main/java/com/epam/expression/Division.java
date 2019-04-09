package com.epam.expression;

public class Division extends Operator {

    public Division(String left, String right) {
        super(left, right);
    }

    public int evaluate() {
        int rightValue = this.right.evaluate();
        if (rightValue == 0) {
            System.err.println("Division by zero.");
            System.exit(1);
        }
        return this.left.evaluate() / rightValue;
    }

    @Override
    public String toString() {
        return this.left + " / " + this.right;
    }
}
