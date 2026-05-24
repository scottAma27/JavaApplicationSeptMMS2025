// 3.38 Enforcing Privacy with Cryptography Decrypt:
import java.util.Scanner;

public class Decrypt{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter encrypted 4-digit number: ");
        int num = scan.nextInt();
        int d1 = (num / 1000 + 3) % 10;
        int d2 = (num / 100 % 10 + 3) % 10;
        int d3 = (num / 10 % 10 + 3) % 10;
        int d4 = (num % 10 + 3) % 10;
        int decrypted = 3 * 1000 + d4 * 100 + d1 * 10 + d2;
        System.out.println("Decrypted: " + decrypted);
    }
}