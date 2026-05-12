import java.util.Scanner; 

public class Exercise2_3 {
    public static void main(String[] args) {
        
        int c, thisIsAVariable, q76354, number;
       
        Scanner input = new Scanner(System.in);       
      
        System.out.print("Enter an integer: ");
        
        int value = input.nextInt();
        
        number = value;
        
        System.out.println("This is a Java program");
        
        System.out.printf("%s%n%s%n", "This is a Java", "program");
        
        if (number != 7) {
            System.out.println("The variable number is not equal to 7");
        }
    }
}