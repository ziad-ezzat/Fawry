import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. add account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. View balance");
            System.out.println("5. Calculate and add interest");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter account number: ");
                int accountNumber = scanner.nextInt();
                System.out.print("Enter account holder name: ");
                scanner.nextLine();
                String accountHolderName = scanner.nextLine();
                System.out.print("Enter initial balance: ");
                double balance = scanner.nextDouble();
                System.out.print("Enter interest rate: ");
                double interestRate = scanner.nextDouble();

                SavingsAccount account = new SavingsAccount(accountNumber, accountHolderName, balance, interestRate);
                bank.addNewAccount(account);
            } else if (choice == 2) {
                System.out.print("Enter account number: ");
                int accountNumber = scanner.nextInt();
                System.out.print("Enter deposit amount: ");
                double amount = scanner.nextDouble();

                bank.deposit(amount, accountNumber);
            } else if (choice == 3) {
                System.out.print("Enter account number: ");
                int accountNumber = scanner.nextInt();
                System.out.print("Enter withdrawal amount: ");
                double amount = scanner.nextDouble();

                bank.withdraw(amount, accountNumber);
            } else if (choice == 4) {
                System.out.print("Enter account number: ");
                int accountNumber = scanner.nextInt();

                bank.displayBalance(accountNumber);
            } else if (choice == 5) {
                System.out.print("Enter account number: ");
                int accountNumber = scanner.nextInt();

                Account account = bank.getAccount(accountNumber);
                if (account instanceof SavingsAccount) {
                    SavingsAccount savingsAccount = (SavingsAccount) account;
                    savingsAccount.calculateInterest();
                } else {
                    System.out.println("Account not found or is not a Savings Account.");
                }
            } else if (choice == 6) {
                System.out.println("Exiting the application. Thank you!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }

        scanner.close();
    }
}