public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountName, double balance, double interestRate) {
        super(accountNumber, accountName, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
        System.out.println("Interest added : "+ interest);
    }
}
