import java.util.Scanner;

public class Minimum5_23{
    public static double minimum(double x, double y, double z) {
        return Math.min(Math.min(x, y), z);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        System.out.printf("Minimum = %.2f\n", Minimum5_23(a,b,c));
    }
}