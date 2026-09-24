package hospital.model;

public class InvoiceItem {
    private int Id;
    private Invoice invoice;
    private String description;
    private int quantity;
    private double unitPrice; 
    private double amount;
    
    public InvoiceItem(){
        
    }

    public int getId() {
        return Id;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        calculateAmount();
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
        calculateAmount();
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    private void calculateAmount(){
        this.amount = quantity * unitPrice;
    }
    
}
