import java.util.Scanner;

public class WhileLoop{
	public static void main (String [] args){
		Scanner scan = new Scanner (System.in);
		
		int sumTotal = 0;
		int i = 1;
		
		while(i <= 10){
			System.out.printf("Enter a number %d: ",i);
			int num = scan.nextInt();
			
			sumTotal += num;
			// sum = sum + num 
			i++;
		}
		System.out.printf("The sumTotal is %d%n",sumTotal);
		if(sum %2 == 0){
			System.out.printf("%d is an even number",sumTotal);
		}
		else{
			System.out.printf("% is an odd number",sumTotal);
		}
	}
}