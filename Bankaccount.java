package oopsconcept;

public class Bankaccount {
	private int accountNo;
    private double balance;

    // Getter for accountNo
    public int getAccountNo() {
        return accountNo;
    }

    // Setter for accountNo
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining Balance: " + balance);
        }
    }

    // Main method (for testing)
    public static void main(String[] args) {

       Bankaccount acc = new Bankaccount();

        acc.setAccountNo(12345);
        acc.deposit(5000);
        acc.withdraw(1500);

        System.out.println("Final Balance: " + acc.getBalance());
    }
}