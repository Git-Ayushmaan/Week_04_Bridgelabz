package com.example.exceptionhandling.exceptionpropagation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExceptionClassTest {
    private ExceptionClass exceptionClass;

    @BeforeEach
    void setUp() {
        exceptionClass = new ExceptionClass();
    }

    @Test
    void testMethod1ThrowsArithmeticException() {
        assertThrows(ArithmeticException.class, () -> exceptionClass.method1());
    }

    @Test
    void testMethod2PropagatesException() {
        assertThrows(ArithmeticException.class, () -> exceptionClass.method2());
    }
}
