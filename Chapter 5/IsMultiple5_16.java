import java.util.Scanner;

public class IsMultiple5_16 {
    public static boolean isMultiple(int num1, int num2) {
        return num2 % num1 == 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Enter two integers, 0 0 to quit: ");
            int a = sc.nextInt(); int b = sc.nextInt();
            if(a == 0 && b == 0) break;
            System.out.println(b + (isMultiple(a,b) ? " is " : " is not ") + "a multiple of " + a);
        }
    }
}