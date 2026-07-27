package cwork5;

public class BankTransfer implements Payment{
    @Override
    public void pay(double amount){ 
        System.out.println("Paid " + amount + " via Bank Transfer"); 
    }
}