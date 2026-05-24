// 3.19 Sales Commission Calculator
import java.util.Scanner;

public class SalesCommission{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
		
        System.out.println("Enter sales in dollars: ");
		double sales = scan.nextDouble();
		
		double earnings = 200 + (sales * 0.09);
        char symbol = '$';
		
        System.out.printf("Earnings: %c%.2f%n", symbol, earnings);
    }
}
