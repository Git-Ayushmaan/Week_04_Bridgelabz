package com.example.exceptionhandling.throwvsthrows;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InterestCalculatorTest {
    @Test
    void testCalculateInterestValid() {
        assertEquals(200.0, InterestCalculator.calculateInterest(1000, 10, 2));
    }

    @Test
    void testCalculateInterestNegativeAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> InterestCalculator.calculateInterest(-1000, 10, 2));
        assertEquals("Invalid input: Amount and rate must be positive", exception.getMessage());
    }

    @Test
    void testCalculateInterestNegativeRate() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> InterestCalculator.calculateInterest(1000, -10, 2));
        assertEquals("Invalid input: Amount and rate must be positive", exception.getMessage());
    }
}