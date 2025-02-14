package com.example.exceptionhandling.nestedtrycatch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayAndDivisorTest {
    @Test
    void testPerformOperationValid() {
        int[] array = {10, 20, 30, 40};
        assertDoesNotThrow(() -> new ArrayAndDivisor().performOperation(array, 1, 2));
    }

    @Test
    void testPerformOperationInvalidIndex() {
        int[] array = {10, 20, 30, 40};
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> new ArrayAndDivisor().performOperation(array, 10, 2));
        assertEquals("Invalid array index!", exception.getMessage());
    }

    @Test
    void testPerformOperationDivideByZero() {
        int[] array = {10, 20, 30, 40};
        Exception exception = assertThrows(ArithmeticException.class, () -> new ArrayAndDivisor().performOperation(array, 1, 0));
        assertEquals("Cannot divide by zero!", exception.getMessage());
    }
}