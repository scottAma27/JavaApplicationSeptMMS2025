// 3.21 Find the Largest Number
import java.util.Scanner;

public class Largest{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number; 
		int largest = Integer.MIN_VALUE;
		int counter = 0;

        while (counter < 10){
            System.out.print("Enter number: ");
            number = scan.nextInt();
            if (number > largest){
                largest = number;
            }
            counter++;
        }
        System.out.println("Largest: " + largest);
    }
}