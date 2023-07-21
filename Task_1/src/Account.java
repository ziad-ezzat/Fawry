public class Account {
    private int accountNumber;
    private String accountName;
    private double balance;

    public Account(int accountNumber, String accountName, double balance) {
        setAccountNumber(accountNumber);
        setAccountName(accountName);
        setBalance(balance);
    }

    public void deposit(double value) {
        double newBalance = balance + value;
        setBalance(newBalance);
    }
    public void withdraw(double value) {
        if(value<=balance&&value>0) {
            double newBalance = balance - value;
            setBalance(newBalance);
        }
        else{
            System.out.println("sorry your balance is: "+balance+" can't withdraw :(");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
