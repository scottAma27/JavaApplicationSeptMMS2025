import java.util.Scanner;

public class SquareCharacter5_19{
    public static void squareOfAsterisks(int side, char fillCharacter) {
        for(int i = 0; i < side; i++) {
            for(int j = 0; j < side; j++) {
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        int side = sc.nextInt();
        System.out.print("Enter fill character: ");
        char fill = sc.next().charAt(0);
        squareOfAsterisks(side, fill);
    }
}