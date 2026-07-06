import java.util.Scanner;

public class SquareAsterisks5_18 {
    public static void squareOfAsterisks(int side) {
        for(int i = 0; i < side; i++) {
            for(int j = 0; j < side; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        squareOfAsterisks(sc.nextInt());
    }
}