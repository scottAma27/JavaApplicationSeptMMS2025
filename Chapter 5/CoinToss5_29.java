import java.security.SecureRandom;
import java.util.Scanner;

enum Coin { HEADS, TAILS }

public class CoinToss5_29{
    private static SecureRandom rand = new SecureRandom();
    
    public static Coin flip() {
        return rand.nextInt(2) == 0 ? Coin.HEADS : Coin.TAILS;
    }
    
    public static void main ( String [] args ) {
        Scanner sc = new Scanner(System.in);
        int heads = 0, tails = 0;
        
        while(true) {
            System.out.print("Enter T to toss, Q to quit: ");
            String choice = sc.next().toUpperCase();
            if(choice.equals("Q")) break;
            
            Coin result = flip();
            if(result == Coin.HEADS) heads++; else tails++;
            System.out.println("Result: " + result);
            System.out.printf("Heads: %d  Tails: %d\n", heads, tails);
        }
    }
}