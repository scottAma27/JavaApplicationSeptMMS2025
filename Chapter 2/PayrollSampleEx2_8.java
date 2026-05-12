import java.util.Scanner;

public class PayrollSampleEx2_8 {
    public static void main(String[] args) {
        
        int a, b, c;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter value for b: ");
        b = input.nextInt();
        
        System.out.print("Enter value for c: ");
        c = input.nextInt();
        
        a = b * c;
        
        System.out.printf("The product of b and c is %d%n", a);
    }
}