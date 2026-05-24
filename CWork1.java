import java.util.Scanner;

public class CWork1{
	public static void main (String [] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num1 = scan.nextInt();
		
		System.out.print("Enter a second number: ");
		int num2 = scan.nextInt();
		
		System.out.print("Enter a third number: ");
		int num3 = scan.nextInt();
		
		System.out.print("Enter a forth number: ");
		int num4 = scan.nextInt();
		
		System.out.print("Enter a fifth number: ");
		int num5 = scan.nextInt();
		
		int sum = num1 + num2 + num3 + num4 + num5;
		int product = num1 * num2 * num3 * num4 * num5;
		double avarage = (double)(num1 + num2 + num3 + num4 + num5)/5.0;
		
		System.out.printf("The sum of %d + %d + %d + %d + %d = %d%n",num1,num2,num3,num4,num5,sum);
		System.out.printf("The product of %d * %d * %d * %d * %d = %d%n",num1,num2,num3,num4, num5,product);
		System.out.printf("The avarage of (%d + %d + %d + %d + %d)/5.0 = %2.f%n",num1,num2,num3,num4, num5,avarage); 
	}
}