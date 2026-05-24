// 3.17 GasMileage
import java.util.Scanner;

public class GasMileage{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int miles;
		int gallons; 
		int totalMiles = 0;
		int totalGallons = 0;
        double sumTotal;

        while (true){
            System.out.print("Enter miles driven (-1 to quit): ");
            miles = scan.nextInt();
            if (miles == -1) break;

            System.out.print("Enter gallons used: ");
            gallons = scan.nextInt();

            totalMiles += miles;
            totalGallons += gallons;
            sumTotal = (double) miles / gallons;

            System.out.printf("sumTotal for this trip: %.2f%n", sumTotal);
        }

        if (totalGallons != 0) {
            System.out.printf("Combined sumTotal: %.2f%n", (double)  totalMiles / totalGallons);
        }
    }
}