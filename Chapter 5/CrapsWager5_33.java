import java.security.SecureRandom;
import java.util.Scanner;

public class CrapsWager5_33{
    private static SecureRandom rand = new SecureRandom();
    
    public static int rollDice() { return 1 + rand.nextInt(6); }
    
    public static String chatter() {
        String[] msgs = {"Oh, you're going for broke, huh?", "Aw c'mon, take a chance!", "You're up big. Now's the time to cash in!"};
        return msgs[rand.nextInt(msgs.length)];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bankBalance = 1000;
        
        while(bankBalance > 0) {
            System.out.println("Bank Balance: $" + bankBalance);
            System.out.print(chatter() + " Enter wager: ");
            int wager = sc.nextInt();
            while(wager > bankBalance) {
                System.out.print("Wager too high. Re-enter: ");
                wager = sc.nextInt();
            }
            
            int die1 = rollDice(), die2 = rollDice(), sum = die1 + die2;
            System.out.printf("You rolled %d + %d = %d\n", die1, die2, sum);
            
            boolean win = (sum == 7 || sum == 11);
            boolean lose = (sum == 2 || sum == 3 || sum == 12);
            
            if(win) {
                bankBalance += wager;
                System.out.println("You win!");
            } else if(lose) {
                bankBalance -= wager;
                System.out.println("You lose!");
            } else {
                int point = sum;
                System.out.println("Point is " + point);
                while(true) {
                    die1 = rollDice(); die2 = rollDice(); sum = die1 + die2;
                    System.out.printf("Rolled %d + %d = %d\n", die1, die2, sum);
                    if(sum == point) { win = true; break; }
                    if(sum == 7) { win = false; break; }
                }
                if(win) { bankBalance += wager; System.out.println("You win!"); }
                else { bankBalance -= wager; System.out.println("You lose!"); }
            }
            if(bankBalance == 0) System.out.println("Sorry. You busted!");
        }
    }
}