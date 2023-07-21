import java.util.HashMap;
import java.util.Map;

public class Bank {

    private Map<Integer, Account> accounts = new HashMap<>();

    public void addNewAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
        System.out.println("Account added successfully");
    }

    public void deposit(double value, int accountNumber) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            account.deposit(value);
        } else {
            System.out.println("Account not found");
        }
    }

    public void withdraw(double value, int accountNumber) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            account.withdraw(value);
        } else {
            System.out.println("Account not found");
        }
    }

    public void displayBalance(int accountNumber) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            System.out.println("Account name: " + account.getAccountName() + " Account balance: " + account.getBalance());
        } else {
            System.out.println("Account not found");
        }
    }

    public Account getAccount(int accountNumber) {
        return accounts.get(accountNumber);
    }
}