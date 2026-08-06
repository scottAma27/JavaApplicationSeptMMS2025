package assignment;

public class SavingsAccount extends BankAccount {
    private double interestRate = 55.04; 

    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: N" + amount + " from Savings Account");
        } 
        
        else{
            System.out.println("Insufficient funds or invalid amount");
        }
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate / 12; 
        System.out.println("Monthly Interest for Savings Account: $" + String.format("%,.2f", interest));
    }
}