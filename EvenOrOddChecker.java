import java.util.Scanner;

public class EvenOrOddChecker{
	public static void main (String [] args){
		
		Scanner scan = new Scanner(System.in);
		char option; 
		
		do{
			System.out.print("Enter a number: ");
			int num = scan.nextInt();
			
			if(num % 2 == 0){
				System.out.printf("The %d is an even number%n", num);
				System.out.printf("");
				System.out.printf("=======================================");
			}
			else{
				System.out.printf("The %d is an odd number%n", num);
				System.out.print("");
				System.out.print("=======================================");
				
			}
			System.out.print("Do you want to run the program again (Y/N): ");
			option = scan.next().charAt(0);
		}
		while(option == 'Y' || option == 'y');
		System.out.println("Good bye.......");
		System.out.printf("");
		System.out.printf("=======================================");
	}
}
/*
	write a java program to accept 10 numbers, find the sum of the first 5th and 10th number
	and multiply it by the sum of the 3rd 8th and 2nd number and subtract the result from
	the sum of 4th, 7th and 9th number. Check if the result of your last calculation is greater than or equals to 100
	if true, disply hurrayyy i did it. otherwise, disply i still need to learn more in java
*/

