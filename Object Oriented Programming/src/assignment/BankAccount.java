package assignment;

public abstract class BankAccount{
    
     String accountNumber;
     String accountHolder;
     double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Amount Deposited:  N" + amount);
        } 
        
        else{
            System.out.println("Invalid  Amount");
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance:  N" + balance);
    }

    public abstract void withdraw(double amount);
    public abstract void calculateInterest();
}