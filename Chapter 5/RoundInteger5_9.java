import java.util.Scanner;

public class RoundInteger5_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter double values: ");
        while (sc.hasNextDouble()) {
            double x = sc.nextDouble();
            double y = Math.floor(x + 0.5);
            
            System.out.printf("Original: %.4f  Rounded: %.0f\n", x, y);
        }
        sc.close();
    }
}