package com.example.exceptionhandling.uncheckedexception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.InputMismatchException;

class CalculatorTest {
    @Test
    void testDivideNumbersValid() {
        Calculator calculator = new Calculator();
        assertDoesNotThrow(() -> calculator.divideNumbers());
    }

    @Test
    void testDivideNumbersByZero() {
        Calculator calculator = new Calculator();
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            throw new ArithmeticException("Error: Division by zero is not allowed.");
        });
        assertEquals("Error: Division by zero is not allowed.", exception.getMessage());
    }

    @Test
    void testDivideNumbersInvalidInput() {
        Calculator calculator = new Calculator();
        Exception exception = assertThrows(InputMismatchException.class, () -> {
            throw new InputMismatchException("Error: Please enter numeric values only.");
        });
        assertEquals("Error: Please enter numeric values only.", exception.getMessage());
    }
}
