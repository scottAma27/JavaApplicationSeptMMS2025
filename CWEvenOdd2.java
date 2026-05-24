import java.util.Scanner;

public class CWEvenOdd2{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scan.nextInt();
		
		boolean isEvenOrOdd = (number % 2 == 0);
		
		System.out.printf("Is the number (%d) even: %b",number,isEvenOrOdd);
	} 
}