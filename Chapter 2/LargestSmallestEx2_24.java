import java.util.Scanner;

public class LargestSmallestEx2_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        int largest = num1;
        int smallest = num1;

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
        if (num2 > largest) largest = num2;
        if (num2 < smallest) smallest = num2;

        System.out.print("Enter third integer: ");
        int num3 = input.nextInt();
        if (num3 > largest) largest = num3;
        if (num3 < smallest) smallest = num3;

        System.out.print("Enter fourth integer: ");
        int num4 = input.nextInt();
        if (num4 > largest) largest = num4;
        if (num4 < smallest) smallest = num4;

        System.out.print("Enter fifth integer: ");
        int num5 = input.nextInt();
        if (num5 > largest) largest = num5;
        if (num5 < smallest) smallest = num5;

        System.out.printf("Largest: %d%n", largest);
        System.out.printf("Smallest: %d%n", smallest);
    }
}