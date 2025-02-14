package com.example.exceptionhandling.multiplecatchblocks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationsTest {
    @Test
    void testPrintValueAtIndexValid() {
        int[] array = {1, 2, 3, 4, 5};
        assertDoesNotThrow(() -> ArrayOperations.printValueAtIndex(array, 2));
    }

    @Test
    void testPrintValueAtIndexNullArray() {
        Exception exception = assertThrows(NullPointerException.class, () -> ArrayOperations.printValueAtIndex(null, 2));
        assertEquals("Array is not initialized!", exception.getMessage());
    }

    @Test
    void testPrintValueAtIndexInvalidIndex() {
        int[] array = {1, 2, 3, 4, 5};
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> ArrayOperations.printValueAtIndex(array, 10));
        assertEquals("Invalid index!", exception.getMessage());
    }
}
