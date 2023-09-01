package org.example.store;

import org.example.account.AccountManager;
import org.example.account.Customer;
import org.junit.jupiter.api.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

// change it to assertJ

import static org.mockito.Mockito.*;

import java.util.List;

public class StoreBetterTest {

    AccountManager accountManager = mock(AccountManager.class);
    MyStore store =new MyStore(accountManager);

    @Test
    void ProductOutOfStockTest () {
        Product product = new Product();

        product.setQuantity(0);

        Customer customer = new Customer();

        try {
            store.buy(product, customer);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        verify(accountManager, never()).withdraw(customer, product.getPrice());
    }

    @Test
    void PaymentFailureTest () {
        Product product = new Product();

        product.setQuantity(1);

        Customer customer = new Customer();

        when(accountManager.withdraw(eq(customer), anyInt()))
                .thenReturn("failure");

        try {
            store.buy(product, customer);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        verify(accountManager).withdraw(customer, product.getPrice());
    }

}






/*
 @Test
    void test2() {
        AccountManager accountManager = mock(AccountManager.class);

        Customer customer = new Customer();

        when(accountManager.withdraw(eq(customer), anyInt()))
                .thenReturn("success");

        when(accountManager.withdraw(eq(customer), anyInt()))
                .then(new Answer<String>() {
                    @Override
                    public String answer(InvocationOnMock invocationOnMock) throws Throwable {
                        int amount = invocationOnMock.getArgumentAt(1, Integer.class);
                        return "SUCCESS" + amount;
                    }
                });

        System.out.println(accountManager.withdraw(customer, 10));
        System.out.println(accountManager.withdraw(customer, 11));

        verify(accountManager).withdraw(customer, 10);
        verify(accountManager).withdraw(customer, 11);

        verifyZeroInteractions(accountManager);

    }
 */