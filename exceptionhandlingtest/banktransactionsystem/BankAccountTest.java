package com.example.exceptionhandling.banktransactionsystem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {
    private BankAccount bankAccount;

    @BeforeEach
    void setUp() {
        bankAccount = new BankAccount(100.0);
    }

    @Test
    void testWithdrawSuccess() throws InsufficientBalanceException {
        bankAccount.withdraw(50.0);
        assertEquals(50.0, bankAccount.getBalance());
    }

    @Test
    void testWithdrawInsufficientBalance() {
        Exception exception = assertThrows(InsufficientBalanceException.class, () -> {
            bankAccount.withdraw(200.0);
        });
        assertEquals("Insufficient balance!", exception.getMessage());
    }

    @Test
    void testWithdrawNegativeAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            bankAccount.withdraw(-10.0);
        });
        assertEquals("Invalid amount!", exception.getMessage());
    }
}
