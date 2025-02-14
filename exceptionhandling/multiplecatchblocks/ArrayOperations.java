package com.example.exceptionhandling.multiplecatchblocks;

public class ArrayOperations {

    public static void printValueAtIndex(int[] array, int index) {
        try {
            if (array == null) {
                throw new NullPointerException("Array is not initialized!");
            }

            if (index < 0 || index >= array.length) {
                throw new ArrayIndexOutOfBoundsException("Invalid index!");
            }

            System.out.println("Value at index " + index + ": " + array[index]);

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
