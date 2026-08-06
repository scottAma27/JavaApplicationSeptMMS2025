package assignment;

class CurrentAccount extends BankAccount{
    private double overdraftLimit = 10000.0;

    public CurrentAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // 4. Implement abstract methods differently
    @Override
    public void withdraw(double amount){
        if(amount > 0 && (balance + overdraftLimit) >= amount){
            balance -= amount;
            System.out.println("Withdrawn: N" + amount + " from Current Account");
        } 
        
        else{
            System.out.println("Overdraft limit exceeded or invalid amount");
        }
    }

    @Override
    public void calculateInterest(){
        System.out.println("Current Account does not earn interest.");
    }
}