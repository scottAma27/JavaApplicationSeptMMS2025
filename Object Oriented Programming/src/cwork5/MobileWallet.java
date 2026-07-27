package cwork5;

public class MobileWallet implements Payment{
    @Override
    public void pay(double amount){ 
        System.out.println("Paid " + amount + " using Mobile Wallet"); 
    }
}