package cwork5;

public class PaymentDemo{
   
    public static void main(String[] args){
        Payment [] paymentMethod = {
            new CreditCard(),
            new BankTransfer(),
            new MobileWallet(),
        };
        for(Payment payment : paymentMethod){
                  
        payment.pay(200); 
        payment.pay(500); 
        payment.pay(300);
    }
    }
}
