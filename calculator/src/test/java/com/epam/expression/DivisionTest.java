package com.epam.expression;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisionTest {

    @Test
    public void testSimpleSum1() {
        Expression e = new Division("2","2");
        assertEquals(1, e.evaluate());
    }

    @Test
    public void testSimpleSum2() {
        Expression e = new Division("(-2)","(-1)");
        assertEquals(2, e.evaluate());
    }

    @Test
    public void testWithProduct() {
        Expression e = new Division("2+3+1", "16/4");
        assertEquals(1, e.evaluate());
    }

    @Test
    public void testSumWithParentheses() {
        Expression e = new Division("(22-4)","(-1)*2");
        assertEquals(-9, e.evaluate());
    }
}