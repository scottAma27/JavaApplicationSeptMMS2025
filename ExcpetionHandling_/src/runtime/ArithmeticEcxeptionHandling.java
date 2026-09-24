package runtime;

import java.util.Scanner;

public class ArithmeticEcxeptionHandling {
    public static void main (String [] args){
        try{
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Dividing the number by the second number");
        System.out.println("Enter a number: ");
        int num1 = scan.nextInt();
        
        System.out.print("Enter a second number: ");
        int num2 = scan.nextInt();
        
        int division = num1/num2;
        
        System.out.printf("The result is %d%n", division);
    }
    catch(ArithmeticException e){
        System.out.println("Number can not be divided by zero");
    }
}
}