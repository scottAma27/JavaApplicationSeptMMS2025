import java.util.Scanner;

public class Distance5_32{
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 y1 x2 y2: ");
        System.out.printf("Distance = %.2f\n", distance(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
    }
}