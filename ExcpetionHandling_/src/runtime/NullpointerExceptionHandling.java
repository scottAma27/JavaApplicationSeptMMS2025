package runtime;

import java.util.Scanner;

public class NullpointerExceptionHandling {
    public static void main (String [] agrs){
        try{
            
        Scanner scan = new Scanner(System.in);

        String name = null;
        
        System.out.print("Enter name: ");
        name = scan.nextLine();
        
        System.out.println("The leagt of name is "+ name.length());
    }
    catch(NullPointerException e){
        System.out.println("Name has not been initialiazed");
        }
    }  
}