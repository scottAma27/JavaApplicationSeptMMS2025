import java.util.Scanner;

public class ReverseDigits5_26{
    public static int reverse(int number) {
        int reversed = 0;
        while(number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        System.out.println("Reversed: " + reverse(sc.nextInt()));
    }
}