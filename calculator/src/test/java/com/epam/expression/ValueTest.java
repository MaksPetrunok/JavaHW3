package com.epam.expression;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValueTest {

    @Test
    public void testPositive() {
        Expression exp = new Value(22);
        assertEquals(exp.evaluate(), 22);
    }

    @Test
    public void testNegative() {
        Expression exp = new Value(-22);
        assertEquals(exp.evaluate(), -22);
    }

    @Test
    public void testZero() {
        Expression exp = new Value(0);
        assertEquals(exp.evaluate(), 0);
    }
}