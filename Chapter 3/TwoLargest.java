// 3.23 Find the Two Largest Numbers
import java.util.Scanner;

public class TwoLargest{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number, largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++){
            System.out.print("Enter number: ");
            number = scan.nextInt();
            if (number > largest){
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest){
                secondLargest = number;
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Second largest: " + secondLargest);
    }
}