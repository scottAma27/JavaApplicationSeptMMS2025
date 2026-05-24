import java.util.Scanner;

public class CWork3UserInfo{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = scan.nextLine();
		
		System.out.print("Enter address: ");
        String address = scan.nextLine();
        
        System.out.print("Enter age: ");
        int age = scan.nextInt();
		
		//scan.nextLine
		
        System.out.printf("\nMy name is %s, i am %d years old %n",name,age);
  
        System.out.printf("My Address is: %s%n",address);
        
    }
}