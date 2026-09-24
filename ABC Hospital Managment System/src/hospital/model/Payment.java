package hospital.model;

import java.time.LocalDate;

public class Payment {
    private int Id;
    private Invoice Invoice;
    private double amount;
    private LocalDate paymentDate;
    private String paymentMethod;
    
    public Payment(){
        
    }

    public int getId() {
        return Id;
    }

    public Invoice getInvoice() {
        return Invoice;
    }

    public void setInvoice(Invoice Invoice) {
        this.Invoice = Invoice;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
}
