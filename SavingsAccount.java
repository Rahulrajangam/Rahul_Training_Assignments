package oopsconcept;

import java.util.Scanner;

//PARENT CLASS
public class SavingsAccount {
 protected int accountNo;
 protected double balance;
 protected double interestRate;

 // Setters
 public void setAccountNo(int accountNo) {
     this.accountNo = accountNo;
 }

 public void setBalance(double balance) {
     this.balance = balance;
 }

 public void setInterestRate(double interestRate) {
     this.interestRate = interestRate;
 }

 // deposit method
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
     } else {
         System.out.println("Deposit amount must be positive!");
     }
 }

 // withdraw method
 public void withdraw(double amount) {
     if (amount > balance) {
         System.out.println("Insufficient balance!");
     } else if (amount <= 0) {
         System.out.println("Invalid withdrawal amount!");
     } else {
         balance -= amount;
     }
 }

 // addInterest method
 public void addInterest() {
     double interest = balance * (interestRate / 100);
     balance += interest;
     System.out.println("Interest added: " + interest);
 }
}

//CHILD CLASS
class PremiumSavingsAccount extends SavingsAccount {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     PremiumSavingsAccount acc = new PremiumSavingsAccount();

     System.out.print("Enter Account Number: ");
     acc.setAccountNo(sc.nextInt());

     System.out.print("Enter Initial Balance: ");
     acc.setBalance(sc.nextDouble());

     System.out.print("Enter Interest Rate (%): ");
     acc.setInterestRate(sc.nextDouble());

     System.out.print("Enter deposit amount: ");
     acc.deposit(sc.nextDouble());

     System.out.print("Enter withdraw amount: ");
     acc.withdraw(sc.nextDouble());

     acc.addInterest();

     System.out.println("Final Balance = " + acc.balance);
 }
}
