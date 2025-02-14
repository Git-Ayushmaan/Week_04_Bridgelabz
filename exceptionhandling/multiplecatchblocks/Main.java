package com.example.exceptionhandling.multiplecatchblocks;

public class Main {
    public static void main(String[] args) {
        int[] validArray = {10, 20, 30, 40, 50};
        int[] nullArray = null;

        System.out.println("Test Case 1: Valid array and index");
        ArrayOperations.printValueAtIndex(validArray, 2);

        System.out.println("\nTest Case 2: Valid array and invalid index");
        ArrayOperations.printValueAtIndex(validArray, 10);

        System.out.println("\nTest Case 3: Null array");
        ArrayOperations.printValueAtIndex(nullArray, 0);
    }
}