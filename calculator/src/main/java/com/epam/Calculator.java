package com.epam;

import com.epam.expression.*;
import java.util.Scanner;

public class Calculator {

    private static String readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main(String[] args) {

        String input = readInput();
        Expression expr = new ExpressionItem(input);

        if (args.length == 1 && "-v".equals(args[0])) {
            System.out.println(expr.toString());
        }
        System.out.println("Result: " + expr.evaluate());
    }
}
