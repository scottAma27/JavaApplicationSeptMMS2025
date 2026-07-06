import java.util.Scanner;

public class TempConversion5_22{
    public static double celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }
    public static double fahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1: F->C 2: C->F  Choice: ");
        int choice = sc.nextInt();
        System.out.print("Enter temperature: ");
        double t = sc.nextDouble();
        if(choice == 1) System.out.printf("%.2f F = %.2f C\n", t, celsius(t));
        else System.out.printf("%.2f C = %.2f F\n", t, fahrenheit(t));
    }
}