/*
write a java program to accept 3 numbers,
find the sum of the 3 numbers and check if it is an 
even number and is divisible by 10. If true,
accept 3 numbers and find the product of the 3 number and check if the numbers is greater than 200
if true display hurray. if not,
display on going othrwiese if the sum of the 3 number is not devesible by 10 and it's not an even number
display i must solve this program on my own
*/

import java.util.Scanner;

public class ClassWork3Numbers{
	public static void main (String [] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int sum = num1 + num2 + num3;

        if (sum % 2 == 0 && sum % 10 == 0){
            int product = num1 * num2 * num3;
            if (product > 200) {
                System.out.println("Hurray..........");
            } else{
                System.out.println("On going");
            }
        } else if (sum % 2 != 0 && sum % 10 != 0) {
            System.out.println("I must solve this program on my own");
        }

        // scan.close();
	}
}