import java.util.Scanner;

public class IsEven5_17{
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integers, -1 to quit: ");
        int n;
        while((n = sc.nextInt()) != -1) {
            System.out.println(n + " is " + (isEven(n) ? "even" : "odd"));
        }
    }
}