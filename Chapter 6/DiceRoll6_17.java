import java.security.SecureRandom;

public class DiceRoll6_17{
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        int[] frequency = new int[13]; // index 2-12 used

        for(int i = 0; i < 36000000; i++) {
            int die1 = 1 + rand.nextInt(6);
            int die2 = 1 + rand.nextInt(6);
            ++frequency[die1 + die2];
        }

        System.out.println("Sum\tFrequency");
        for(int sum = 2; sum <= 12; sum++) {
            System.out.printf("%d\t%d\n", sum, frequency[sum]);
        }
    }
}