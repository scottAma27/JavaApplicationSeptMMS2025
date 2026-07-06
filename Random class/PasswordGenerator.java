import java.util.*;

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
            int randomIndex = random.nextInt(88);
            password.append(allChars.charAt(randomIndex));
        }
        

        System.out.println("Your random 15-character password is: " + password.toString());
    }
}
// charAt is used to look for single character/index given to it by the random code 