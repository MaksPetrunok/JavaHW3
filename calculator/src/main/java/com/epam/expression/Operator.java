package com.epam.expression;

import com.epam.parser.Parser;

public abstract class Operator implements Expression {

    protected Expression left;
    protected Expression right;

    public Operator(String left, String right) {
        this.left = Parser.parse(left);
        this.right = Parser.parse(right);
    }
}
