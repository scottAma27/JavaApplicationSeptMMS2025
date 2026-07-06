import java.util.Scanner;

public class SeparateDigits5_21{
    public static int quotient(int a, int b) { return a / b; }
    public static int remainder(int a, int b) { return a % b; }
    
    public static void displayDigits(int number) {
        int divisor = 10000;
        while(divisor > number) divisor /= 10;
        while(divisor > 0) {
            System.out.print(quotient(number, divisor) + "  ");
            number = remainder(number, divisor);
            divisor /= 10;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1-99999: ");
        displayDigits(sc.nextInt());
    }
}