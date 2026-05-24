// 3.18 Credit Limit Calculator
import java.util.Scanner;

public class CreditLimit{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int account; 
		int balance; 
		int charges; 
		int credits; 
		int limit;
		int newBalance;

        System.out.print("Enter account number: ");
        account = scan.nextInt();
       
        System.out.print("Enter balance: ");
        balance = scan.nextInt();
		
        System.out.print("Enter charges: ");
        charges = scan.nextInt();
		
		System.out.print("Enter credits: ");
        credits = scan.nextInt();
		
        System.out.print("Enter credit limit: ");
        limit = scan.nextInt();

        newBalance = balance + charges - credits;
        System.out.println("New balance: " + newBalance);
		
		if (newBalance > limit){
            System.out.println("Credit limit exceeded");
            }
    }
}