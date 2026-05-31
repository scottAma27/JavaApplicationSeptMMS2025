// write a java program to accept 10 numbers, find the sum of the first 5th and 10th number
// and multiply it by the sum of the 3rd 8th and 2nd number and subtract the result from
// the sum of 4th, 7th and 9th number. Check if the result of your last calculation is greater that or equal to 100
// if true, disply hurrayyy i did it otherwise, disply i still need to learn more in java

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number: ");
            numbers[i] = scanner.nextDouble();
        }

        double sum1 = numbers[4] + numbers[9]; 
        double sum2 = numbers[2] + numbers[7] + numbers[1]; 
        double sum3 = numbers[3] + numbers[6] + numbers[8]; 

        double result = sum3 - (sum1 * sum2);

        System.out.printf("Result: %.2f%n", result);
        if (result >= 100) {
            System.out.println("Hurrayyy! I did it");
        } else {
            System.out.println("I still need to learn more in Java");
        }
    }
}