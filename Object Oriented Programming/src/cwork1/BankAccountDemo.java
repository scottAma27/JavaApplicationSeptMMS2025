package cwork1;

public class BankAccountDemo{
   
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("00347223364", "Emma Daniel", 3000.22);
        
        acc.deposit(500);
        acc.withdraw(200);
       
        System.out.println(acc);
    }

}
