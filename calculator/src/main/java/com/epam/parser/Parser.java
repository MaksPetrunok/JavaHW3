package com.epam.parser;

import com.epam.expression.*;

public class Parser {

    private static Expression parseValue(String expression) throws NumberFormatException {
        return new Value(Integer.parseInt(expression));
    }

    private static Expression parseParentheses(String expression)
            throws NumberFormatException, ParenthesesMismatchException {

        if (expression.length() == 0) {
            throw new NumberFormatException();
        }
        if (expression.charAt(0) == '(' || expression.charAt(expression.length() - 1) == ')') {
            if (expression.charAt(0) != '(' || expression.charAt(expression.length() - 1) != ')') {
                throw new ParenthesesMismatchException();
            }
            else {
                expression = expression.substring(1, expression.length() - 1);
            }
        }

        if (expression.matches("^[\\-]?[0-9]*$")) {
            return parseValue(expression);
        }
        return new ExpressionItem(expression);
    }

    private static Expression parseProduct(String expression)
            throws NumberFormatException, ParenthesesMismatchException {

        for (int i = 0; i < expression.length(); i++) {
            switch (expression.charAt(i)) {
                case '(':
                    i = skipParentheses(i, expression);
                    break;
                case '*':
                    return new Product(expression.substring(0, i), expression.substring(i + 1));
                case '/':
                    return new Division(expression.substring(0, i), expression.substring(i + 1));
                case '%':
                    return new Modulus(expression.substring(0, i), expression.substring(i + 1));
            }
        }
        return parseParentheses(expression);
    }

    private static Expression parseSum(String expression)
            throws NumberFormatException, ParenthesesMismatchException {

        for (int i = 0; i < expression.length(); i++) {
            switch (expression.charAt(i)) {
                case '(':
                    i = skipParentheses(i, expression);
                    break;
                case '+':
                    return new Sum(expression.substring(0, i), expression.substring(i + 1));
                case '-':
                    return new Subtraction(expression.substring(0, i), expression.substring(i + 1));
            }
        }
        return parseProduct(expression);
    }

    private static int skipParentheses(int position, String expr) throws ParenthesesMismatchException {
        int openParentheses = 0;

        do {
            switch (expr.charAt(position)) {
                case '(': openParentheses++; break;
                case ')': openParentheses--;
            }
            position++;
        } while (openParentheses != 0 && position < expr.length());
        if (openParentheses != 0)
            throw new ParenthesesMismatchException();
        return position - 1;
    }

    public static Expression parse(String expression) {
        Expression result = null;
        try {
            result = parseSum(expression);
        }
        catch (NumberFormatException e) {
            System.err.println("Incorrect input.");
            System.exit(1);
        }
        catch (ParenthesesMismatchException e) {
            System.err.println("Incorrect parentheses.");
            System.exit(1);
        }
        return result;
    }
}
