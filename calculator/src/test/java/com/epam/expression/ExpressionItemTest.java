package com.epam.expression;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExpressionItemTest {

    @Test
    public void testExpression1() {
        Expression e = new ExpressionItem("2");
        assertEquals(2, e.evaluate());
    }

    @Test
    public void testExpression2() {
        Expression e = new ExpressionItem("(-2)");
        assertEquals(-2, e.evaluate());
    }

    @Test
    public void testExpression3() {
        Expression e = new ExpressionItem("2+3*4");
        assertEquals(14, e.evaluate());
    }

    @Test
    public void testExpression4() {
        Expression e = new ExpressionItem("(1+1)*(2-1)/(1+0)/(1-0)");
        assertEquals(2, e.evaluate());
    }

    @Test
    public void testExpression5() {
        Expression e = new ExpressionItem("(1+1)*3-5*(2-1)");
        assertEquals(1, e.evaluate());
    }

    @Test
    public void testExpression6() {
        Expression e = new ExpressionItem("(1+1)%3+8*(8/4-5%(7-5))");
        assertEquals(10, e.evaluate());
    }
}