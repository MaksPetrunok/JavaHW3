package com.epam.expression;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void testSimpleSum1() {
        Expression e = new Sum("2","2");
        assertEquals(e.evaluate(), 4);
    }

    @Test
    public void testSimpleSum2() {
        Expression e = new Sum("(-2)","0");
        assertEquals(e.evaluate(), -2);
    }

    @Test
    public void testWithProduct() {
        Expression e = new Sum("2*3", "16/4");
        assertEquals(e.evaluate(), 10);
    }

    @Test
    public void testSumWithParentheses() {
        Expression e = new Sum("(22-4)","(-18)*2");
        assertEquals(e.evaluate(), -18);
    }
}