package com.epam.expression;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractionTest {

    @Test
    public void testSimpleSum1() {
        Expression e = new Subtraction("2","2");
        assertEquals(0, e.evaluate());
    }

    @Test
    public void testSimpleSum2() {
        Expression e = new Subtraction("(-2)","0");
        assertEquals(-2, e.evaluate());
    }

    @Test
    public void testWithProduct() {
        Expression e = new Subtraction("2*3", "16/4");
        assertEquals(2, e.evaluate());
    }

    @Test
    public void testSumWithParentheses() {
        Expression e = new Subtraction("(22-4)","(-18)*2");
        assertEquals(54, e.evaluate());
    }
}