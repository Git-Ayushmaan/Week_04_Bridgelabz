package com.example.exceptionhandling.uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

class Calculator {
    public void divideNumbers() {
        Scanner kb = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int numerator = kb.nextInt();
            System.out.print("Enter denominator: ");
            int denominator = kb.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numeric values only.");
        } finally {
            kb.close();
        }
    }
}