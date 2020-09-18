package org.horizoncolumbus.hs;

import java.util.*;

public class Calculator {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter a operation: ");
        Scanner input = new Scanner(System.in);
        String operation = input.next();
        switch (operation) {
            case "add","plus", "+", "PLUS", "Plus":
                System.out.println("Enter a number1: ");
                double number1 = input.nextInt();
                System.out.println("Enter a number2: ");
                double number2 = input.nextInt();
                System.out.println(number1 + number2);
                break;
            case "sub","minus", "-", "MINUS", "Minus":
                System.out.println("Enter a number1: ");
                double numeber1 = input.nextInt();
                System.out.println("Enter a number2: ");
                double numeber2 = input.nextInt();
                System.out.println(numeber1 - numeber2);
                break;
            case "mul","multiply", "x", "X", "*", "MULTIPLY", "Multiply":
                System.out.println("Enter a number1: ");
                double nummber1 = input.nextInt();
                System.out.println("Enter a number1: ");
                double nummber2 = input.nextInt();
                System.out.println(nummber1 * nummber2);
                break;
            case "div", "divide", "/", "DIVIDE", "Divide":
                System.out.println("Enter a number1: ");
                double numnber1 = input.nextInt();
                System.out.println("Enter a number1: ");
                double numnber2 = input.nextInt();
                System.out.println(numnber1 / numnber2);
                break;
            default:
                System.out.println("Invalid Operation");
                input.close();
        }
    }
}
