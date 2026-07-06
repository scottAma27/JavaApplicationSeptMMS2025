import java.util.Scanner;

public class DuplicateElimination6_12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5]; // smallest possible
        int count = 0;

        for(int i = 0; i < 5; i++) {
            System.out.print("Enter number 10-100: ");
            int num = sc.nextInt();

            boolean duplicate = false;
            for(int j = 0; j < count; j++) {
                if(numbers[j] == num) { duplicate = true; break; }
            }

            if(!duplicate) {
                numbers[count++] = num;
            }

            System.out.print("Unique numbers so far: ");
            for(int j = 0; j < count; j++) System.out.print(numbers[j] + " ");
            System.out.println();
        }
    }
}