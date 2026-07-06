import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumber5_30_5_31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        boolean playAgain;
        
        do {
            int number = 10;
            int guess, guesses = 0;
            
            System.out.println("Guess a number between 1 and 1000");
            
            do {
                System.out.print("Enter guess: ");
                guess = sc.nextInt();
                guesses++;
                
                if(guess > number) System.out.println("Too high. Try again.");
                else if(guess < number) System.out.println("Too low. Try again.");
            } while(guess != number);
            
            if(guesses <= 10){
				System.out.println("Aha! You know the secret!");
                if(guesses == 10) 
					System.out.println("Congratulations. You guessed the number!");
                else System.out.println("Either you know the secret or you got lucky!");
            } else {
                System.out.println("You should be able to do better!");
            }
            
            System.out.print("Play again? 1=yes 2=no: ");
            playAgain = sc.nextInt() == 1;
        } while(playAgain);
    }
}