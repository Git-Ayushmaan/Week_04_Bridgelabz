package com.example.exceptionhandling.nestedtrycatch;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int index = 2;
        int divisor = 0;

        ArrayAndDivisor and = new ArrayAndDivisor();
        and.performOperation(array, index, divisor);
    }
}
