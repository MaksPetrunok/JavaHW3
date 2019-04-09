package com.epam.expression;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    @Test
    public void testSimpleSum1() {
        Expression e = new Product("2","2");
        assertEquals(4, e.evaluate());
    }

    @Test
    public void testSimpleSum2() {
        Expression e = new Product("(-2)","0");
        assertEquals(0, e.evaluate());
    }

    @Test
    public void testWithProduct() {
        Expression e = new Product("2+3+1", "16/4");
        assertEquals(24, e.evaluate());
    }

    @Test
    public void testSumWithParentheses() {
        Expression e = new Product("(22-4)","(-1)*2");
        assertEquals(-36, e.evaluate());
    }
}