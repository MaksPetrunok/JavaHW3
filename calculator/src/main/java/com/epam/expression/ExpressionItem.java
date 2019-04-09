package com.epam.expression;

import com.epam.parser.Parser;

public class ExpressionItem implements Expression {

    private Expression expression;

    public ExpressionItem(String expression) {
        this.expression = Parser.parse(expression);
    }

    @Override
    public int evaluate() {
        return this.expression.evaluate();
    }

    @Override
    public String toString() {
        return "[" + this.expression.toString() + "]";
    }
}
