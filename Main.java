public class Main {
    public static void main(String[] args) {

        Account account = new Account(101, "Alice Johnson", 1000.00);
        System.out.println("Account created: " + account);

        // Deposit
        account.deposit(500.00);
        System.out.println("After deposit: " + account);

        // Valid withdrawal
        try {
            account.withdraw(200.00);
            System.out.println("After withdrawal: " + account);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Invalid withdrawal — amount exceeds balance
        try {
            account.withdraw(5000.00); // This will throw InvalidAmountException
            System.out.println("After withdrawal: " + account);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Final account state: " + account);
    }
}
