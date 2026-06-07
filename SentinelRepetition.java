import java.util.Scanner;

public class SentinelRepetition{
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		int num;
		int sum = 0;
		
		System.out.println("Enter -1 to end the input");
		
		while(true)//this is sentinel loop when you see true in a bracket.{
			System.out.print("Enter number: ");
			num = scan.nextInt();
			
			if(num == -1){
				break; // it's also know as "Stop completely."
			}
			sum += num;
		}
		System.out.printf("The sum of all the number is %d%n",sum);
	}
}