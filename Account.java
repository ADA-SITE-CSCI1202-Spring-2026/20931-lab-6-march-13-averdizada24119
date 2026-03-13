public class Account {

    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Withdraw method with validation
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InvalidAmountException(
                "Withdrawal amount $" + amount + " exceeds current balance $" + balance
            );
        }
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
    }

    @Override
    public String toString() {
        return "Account{" +
               "accountNumber=" + accountNumber +
               ", accountHolderName='" + accountHolderName + '\'' +
               ", balance=$" + balance +
               '}';
    }
}
