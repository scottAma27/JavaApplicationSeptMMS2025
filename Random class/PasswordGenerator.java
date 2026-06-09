import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {

        String upperLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()-_=+[]{}|;:,.<>?";
        

        String allChars = upperLetters + lowerLetters + numbers + specialChars;
        

        Random random = new Random();
        StringBuilder password = new StringBuilder();
        int passwordLength = 15;
        

        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = random.nextInt(allChars.length());
            password.append(allChars.charAt(randomIndex));
        }
        

        System.out.println("Your random 15-character password is: " + password.toString());
    }
}