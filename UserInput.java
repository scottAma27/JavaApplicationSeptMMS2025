import java.util.Scanner;

public class UserInput{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		
		// nextline reads everything of a word on that line including space
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		// next reads only one word of a word on that line with no space 
		System.out.print("Enter your gender: ");
		String gender = input.next();
		
		// nextByte will read a byte
		System.out.print("Enter your age: ");
		byte age = input.nextByte();
		
		// next short will read a short 
		System.out.print("Enter the number of student in your class: ");
		short numberOfStudent = input.nextShort();
		
		System.out.print("Enter the number of students of sudents in you school: ");
		int totalNumberOfStudent = input.nextInt();
		
		System.out.print("Do you love learing java(true/false): ");
		boolean loveJava = input.nextBoolean();
		
		
		System.out.print("Enter your Grade: ");
		char grade = input.next().charAt(0);
		
		System.out.println("");
		System.out.printf("information about %s%n",name);
		System.out.println("==================");
		
		System.out.printf("Hello %s, you are welcome to NIIT %n", name);
		System.out.printf("You are a %s and you are %d years old%n", gender,age);
		System.out.printf("There are %d students in your class %n", numberOfStudent);
		System.out.printf("The total number of studens is %,d%n",totalNumberOfStudent);
		System.out.printf("Your grade is %c%n",grade);
		System.out.printf("Do you love java? %b%n",loveJava);
	}
}