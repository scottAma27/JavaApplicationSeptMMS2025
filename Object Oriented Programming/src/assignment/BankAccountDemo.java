package assignment;

public class BankAccountDemo{
    
    public static void main(String[] args) {

        BankAccount savings = new SavingsAccount("0072411226", "David Sam", 50000.0);
        BankAccount current = new CurrentAccount("2766129891", "Wisdom Emma", 1000000.0);

        System.out.println("========Savings Account Operations===========");
        savings.deposit(210000);
        savings.withdraw(10000);
        savings.displayBalance();
        savings.calculateInterest();

        System.out.println("\n==============Current Account Operations=============");
        current.deposit(89000);
        current.withdraw(52000); 
        current.displayBalance();
        current.calculateInterest();
    }
}

