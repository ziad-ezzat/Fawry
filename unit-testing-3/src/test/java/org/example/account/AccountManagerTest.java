package org.example.account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class AccountManagerTest {

    private AccountManager accountManager;
    private Customer customer;

    @BeforeEach
    void setUp() {
        accountManager = new AccountManagerImpl();
        customer = new Customer();
    }

    @Test
    void testDeposit() {
        accountManager.deposit(customer, 10);
        assertEquals(10, customer.getBalance());
    }

    @Test
    void testWithdrawSuccess() {
        accountManager.deposit(customer, 10);
        String result = accountManager.withdraw(customer, 5);
        assertEquals("success", result);
        assertEquals(5, customer.getBalance());
    }

    @Test
    void testWithdrawInsufficientBalance() {
        accountManager.deposit(customer, 10);
        String result = accountManager.withdraw(customer, 15);
        assertEquals("insufficient account balance", result);
        assertEquals(10, customer.getBalance());
    }

    @Test
    void testWithdrawInsufficientBalanceWithCredit() {
        customer.setCreditAllowed(true);
        accountManager.deposit(customer, 10);
        String result = accountManager.withdraw(customer, 15);
        assertEquals("success", result);
        assertEquals(-5, customer.getBalance());
    }

    @Test
    void testWithdrawInsufficientBalanceWithCreditAndMaxCredit() {
        customer.setCreditAllowed(true);
        accountManager.deposit(customer, 10);
        String result = accountManager.withdraw(customer, 2000);
        assertEquals("maximum credit exceeded", result);
        assertEquals(10, customer.getBalance());
    }

    @Test
    void testWithdrawInsufficientBalanceWithCreditAndMaxCreditAndVip() {
        customer.setCreditAllowed(true);
        customer.setVip(true);
        accountManager.deposit(customer, 10);
        String result = accountManager.withdraw(customer, 2000);
        assertEquals("success", result);
        assertEquals(-1990, customer.getBalance());
    }
}


/*
    private AccountManager accountManager;
    @Mock
    private Customer customer = mock(Customer.class);

    @BeforeEach
    void setUp() {
        accountManager = new AccountManagerImpl();
    }

    @Test
    void testDeposit() {
        accountManager.deposit(customer, 10);
        verify(customer).setBalance(10);
    }
 */