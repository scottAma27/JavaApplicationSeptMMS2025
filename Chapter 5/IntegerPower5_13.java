import java.util.Scanner;

public class IntegerPower5_13 {
    public static int integerPower(int base, int exponent) {
        int result = 1;
        for(int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exp = sc.nextInt();
        System.out.printf("%d^%d = %d\n", base, exp, integerPower(base, exp));
    }
}