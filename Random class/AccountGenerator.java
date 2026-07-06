import java.util.Random;

public class AccountGenerator {
    public static void main(String[] args) {
        Random rand = new Random();
        StringBuilder account = new StringBuilder("30");

        for (int i = 0; i < 8; i++) {
            account.append(rand.nextInt(10));
        }

        System.out.println("Account number: " + account);
		
		System.out.println(account.length());
    }
}