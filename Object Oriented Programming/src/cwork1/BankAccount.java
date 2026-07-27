package cwork1;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    
    public BankAccount(String accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber; 
    }
    
    public void setAccountNumber(String accountNumber) { 
    }
    
    public String getAccountHolder() { 
        return accountHolder; 
    }
    
    public void setAccountHolder(String accountHolder) { 
    }

    public double getBalance() {
        return balance; 
    }
    
    public void setBalance(double balance) { 
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else{
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public String toString() {
        
        return String.format("%s%n%s%n%,.3f", accountNumber, accountHolder, balance);
    }
}