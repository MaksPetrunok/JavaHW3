package com.epam.expression;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ModulusTest {

    @Test
    public void testSimpleSum1() {
        Expression e = new Modulus("2","2");
        assertEquals(0, e.evaluate());
    }

    @Test
    public void testSimpleSum2() {
        Expression e = new Modulus("(-3)","(-2)");
        assertEquals(-1, e.evaluate());
    }

    @Test
    public void testWithProduct() {
        Expression e = new Modulus("2+3+1", "16/4");
        assertEquals(2, e.evaluate());
    }

    @Test
    public void testSumWithParentheses() {
        Expression e = new Modulus("(22-4+1)","(1)*2");
        assertEquals(1, e.evaluate());
    }
}