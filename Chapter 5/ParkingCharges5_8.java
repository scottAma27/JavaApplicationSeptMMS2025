import java.util.Scanner;

public class ParkingCharges5_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalReceipts = 0.0;
        String choice;
        
        do {
            System.out.print("Enter hours parked (or -1 to quit): ");
            double hours = sc.nextDouble();
            
            if (hours == -1) break;
            
            double charge = calculateCharges(hours);
            totalReceipts += charge;
            
            System.out.printf("Charge for customer: $%.2f\n", charge);
            System.out.printf("Total receipts so far: $%.2f\n", totalReceipts);
            
        } while (true);
        
        System.out.printf("Total receipts for yesterday: $%.2f\n", totalReceipts);
        sc.close();
    }
    
    public static double calculateCharges(double hours) {
        double charge = 2.00; // minimum for up to 3 hours
        
        if (hours > 3) {
            charge += 0.50 * Math.ceil(hours - 3); // charge for each hour or part thereof
        }
        
        if (charge > 10.00) {
            charge = 10.00; // max charge
        }
        
        return charge;
    }
}