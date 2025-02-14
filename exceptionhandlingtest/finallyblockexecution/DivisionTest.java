package com.example.exceptionhandling.finallyblockexecution;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {
    @Test
    void testDivideSuccess() {
        assertEquals(2, Division.divide(10, 5));
    }

    @Test
    void testDivideByZeroThrowsException() {
        assertThrows(ArithmeticException.class, () -> Division.divide(10, 0));
    }
}
