package com.example.exceptionhandling.nestedtrycatch;

public class ArrayAndDivisor {
    void performOperation(int[] array, int index, int divisor) {
        try {
            try {
                int element = array[index];
                int result = element / divisor;
                System.out.println("Division result: " + result);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}
