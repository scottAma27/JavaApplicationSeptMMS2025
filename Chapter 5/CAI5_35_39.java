import java.security.SecureRandom;
import java.util.Scanner;

public class CAI5_35_39{
    private static SecureRandom rand = new SecureRandom();
    private static Scanner sc = new Scanner(System.in);
    
    public static int generateNumber(int difficulty) {
        int max = (int)Math.pow(10, difficulty);
        return rand.nextInt(max);
    }
    
    public static void feedback(boolean correct) {
        String[] correctMsgs = {"Very good!", "Excellent!", "Nice work!", "Keep up the good work!"};
        String[] wrongMsgs = {"No. Please try again.", "Wrong. Try once more.", "Don't give up!", "Keep trying."};
        if(correct) System.out.println(correctMsgs[rand.nextInt(4)]);
        else System.out.println(wrongMsgs[rand.nextInt(4)]);
    }
    
    public static void main(String[] args) {
        System.out.print("Enter difficulty level 1-5: ");
        int difficulty = sc.nextInt();
        System.out.print("1:Add 2:Sub 3:Mul 4:Div 5:Random  Choice: ");
        int type = sc.nextInt();
        
        int correct = 0, total = 0;
        
        while(total < 10) {
            int n1 = generateNumber(difficulty);
            int n2 = generateNumber(difficulty);
            if(n2 == 0) n2 = 1; // avoid div by 0
            
            int op = type == 5 ? 1 + rand.nextInt(4) : type;
            int answer = 0;
            String question = "";
            
            switch(op) {
                case 1: question = n1 + " + " + n2; answer = n1 + n2; break;
                case 2: question = n1 + " - " + n2; answer = n1 - n2; break;
                case 3: question = n1 + " * " + n2; answer = n1 * n2; break;
                case 4: question = n1 + " / " + n2; answer = n1 / n2; break;
            }
            
            System.out.print("How much is " + question + "? ");
            int studentAnswer = sc.nextInt();
            
            if(studentAnswer == answer) {
                feedback(true);
                correct++;
            } else {
                feedback(false);
            }
            total++;
        }
        
        double percentage = (double)correct / total * 100;
        System.out.printf("Score: %.0f%%\n", percentage);
        if(percentage < 75) System.out.println("Please ask your teacher for extra help.");
        else System.out.println("Congratulations, you are ready to go to the next level!");
    }
}