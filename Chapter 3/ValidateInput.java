// 3.24 Validating User Input
import java.util.Scanner;

public class ValidateInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Enter 1 or 2: ");
            choice = scan.nextInt();
        } while (choice != 1 && choice != 2);

        System.out.println("You entered: " + choice);
    }
}