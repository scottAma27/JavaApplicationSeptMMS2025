/*
	Switch-Case Statemnt: it allows you to select one option out of many based on the value of single
	expresion.
*/
// Switch-Case Statement: you must provide acase for the input you are providing 
import java.util.Scanner;

public class SwitchCaseStatement{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int score;
		String name;
		String subject;
		
		System.out.print("Enter your name: ");
		name = input.nextLine();
		
		System.out.print("Enter your subject: ");
		subject = input.nextLine();
		
		System.out.print("Enter your score: ");
		score = input.nextInt();
		
		System.out.println("");
		System.out.println("=======================");
		
		if (score > 100){
			System.out.println("Score can not be greater than 100");
		}
		else{
		
		switch(score/10){
			case 0: 
			case 1:
			case 2:
				System.out.printf("Full name: %s%n",name);
				System.out.printf("Subject: %s%n",subject);
				System.out.printf("Score: %d%n",score);
				System.out.printf("Grade: F");
			break;
			case 3:
				System.out.printf("Full name: %s%n",name);
				System.out.printf("Subject: %s%n",subject);
				System.out.printf("Score: %d%n",score);
				System.out.printf("Grade: E");
			break;
			case 4:
				System.out.printf("Full name: %s%n",name);
				System.out.printf("Subject: %s%n",subject);
				System.out.printf("Score: %d%n",score);
				System.out.printf("Grade: D");
			break;
			case 5:
				System.out.printf("Full name: %s%n",name);
				System.out.printf("Subject: %s%n",subject);
				System.out.printf("Score: %d%n",score);
				System.out.printf("Grade: C");
			break;
			case 6:
				System.out.printf("Full name: %s%n",name);
				System.out.printf("Subject: %s%n",subject);
				System.out.printf("Score: %d%n",score);
				System.out.printf("Grade: B");
			break;
			case 7:
			case 8:
			case 9:
			case 10:
				System.out.printf("Full name: %s%n",name);
				System.out.printf("Subject: %s%n",subject);
				System.out.printf("Score: %d%n",score);
				System.out.printf("Grade: A");
			break;
			default:
				System.out.println("Invalid input");
		}
		
		}
	}
}