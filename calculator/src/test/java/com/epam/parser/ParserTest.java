package com.epam.parser;

import com.epam.expression.Expression;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void shouldReturnParsedValue0() throws Exception {
        Expression exp = Parser.parse("0");
        assertEquals(exp.evaluate(), 0);
    }

    @Test
    public void shouldReturnParsedNegativeValue() throws Exception {
        Expression exp = Parser.parse("(-357)");
        assertEquals(exp.evaluate(), -357);
    }

    @Test
    public void testParentheses1() {
        Expression exp = Parser.parse("(2+2)");
        assertEquals(exp.evaluate(), 4);
    }

    @Test
    public void testParentheses2() {
        Expression exp = Parser.parse("(1+1)-(2+2)");
        assertEquals(exp.evaluate(), -2);
    }
}
