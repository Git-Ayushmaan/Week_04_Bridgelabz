package com.example.exceptionhandling.customexception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VoteCheckerTest {
    private VoteChecker voteChecker;

    @BeforeEach
    void setUp() {
        voteChecker = new VoteChecker();
    }

    @Test
    void testValidateAgeSuccess() {
        assertDoesNotThrow(() -> voteChecker.validateAge(18));
    }

    @Test
    void testValidateAgeFailure() {
        Exception exception = assertThrows(InvalidAgeException.class, () -> voteChecker.validateAge(16));
        assertEquals("Age must be 18 or above", exception.getMessage());
    }
}
