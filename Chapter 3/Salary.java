// 3.20 Salary Calculator
import java.util.Scanner;

public class Salary{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double hours; 
		double rate; 
		double pay;

        for (int i = 1; i <= 3; i++){
            System.out.print("Enter hours worked: ");
            hours = scan.nextDouble();
			
            System.out.print("Enter hourly rate: ");
            rate = scan.nextDouble();

            if (hours <= 40){
                pay = hours * rate;
            } 
			else{
                pay = (40 * rate) + ((hours - 40) * rate * 1.5);
            }
            System.out.printf("Gross pay: $%.2f%n", pay);
        }
    }
}
