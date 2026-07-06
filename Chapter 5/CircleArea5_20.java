import java.util.Scanner;

public class CircleArea5_20{
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.printf("Area = %.2f\n", circleArea(r));
    }
}