import java.util.Scanner;

public class Exercise2_10_11 {
    public static void main(String[] args) {
        
        // Set up values for 2.10
        int x = 2;
        int y = 3;
        
        System.out.println("The value for 2.10 is");
        
        System.out.printf("x = %d%n", x);
        
        System.out.printf("Value of %d + %d is %d%n", x, x, (x + x));
        
        System.out.printf("x =");
        
        System.out.printf("%d = %d%n", (x + y), (y + x));
        
        System.out.println("\nThe answer for 2.11 Variable Modification is");
        
        // Set up variables for 2.11
        int i = 1, j = 2, k = 3, p = 0, value = 0;
        Scanner input = new Scanner(System.in);
        
        p = i + j + k + 7;
        System.out.println("After a) p = " + p);
        
        System.out.println("variables whose values are modified");
        
        System.out.println("a = 5");
        
        System.out.print("Enter a number for value: ");
        value = input.nextInt();
        System.out.println("After d) value = " + value);
    }
}