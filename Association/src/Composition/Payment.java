package Composition;

import java.time.LocalDate;

public class Payment{
    private double amount;
    private LocalDate paymentDate;
    private String paymentMethod;
    private String paymentType;
    
    
    public Payment(double amount, LocalDate paymentDate, String paymentMethod, String paymentType){
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.paymentType = paymentType;
    }
    public void displaymentDeails(){
        System.out.println();
        System.out.println("===========payment Information=================");
        
        System.out.println("payment Amount: "+  amount);
        System.out.println("payment Date: "+ paymentDate);
        System.out.println("payment Method: "+ paymentMethod);
        System.out.println("payment type: "+ paymentType);
        
        System.out.println("=================================================");
        
    }
}
