import java.util.Scanner;

public class MethodOverLoading{
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("======Calculate perimeter of shapes======");
		System.out.println("Enter 1. for square");
		System.out.println("Enter 2. for Rectangle");
		System.out.println("Enter 3. for Triangle");
		System.out.println("Enter 4. Exit program");
		
		System.out.print("Enter your choice");
		
		int choice = scan.nextInt();
		
		switch(choice){
			case 1:
					System.out.print("Enter the length of square: ");
					int lenOfSquare = scan.nextInt();
					
					perimeter(lenOfSquare);
			break;
			
			case 2:
					System.out.print("Enter the length of rectangle: ");
					int lenOfRect = scan.nextInt();
					
					System.out.print("Enter the width of rectangle");
					int widthOfRect = scan.nextInt();
					
					perimeter(lenOfRect,widthOfRect);
			break;
			
			case 3:
					System.out.print("Enter sideA: ");
					int sideA = scan.nextInt();
					
					System.out.print("Enter sideB: ");
					int sideB = scan.nextInt();
					
					System.out.print("Enter sideC: ");
					int sideC = scan.nextInt();
					
					perimeter(sideA, sideB, sideC);
			break;
			default:
					System.out.println("Program Exited, Good Bye.........");
			
		}
		
		
	}
	public static void perimeter(int LenOfSquare){
		int perimeterOfSquare = 4 * LenOfSquare;
		
		System.out.printf("The perimeter of the square is %d%n",perimeterOfSquare);
	}
	public static void perimeter(int lenOfRect, int widthOfRect){
		int perimeterOfRect = 2 * (lenOfRect + widthOfRect);
		
		System.out.printf("The perimeter of the rctangule is %d%n",perimeterOfRect);
	}
	public static void perimeter(int sideA, int sideB, int sideC){
		int perimeterOfTriangle = sideA + sideB + sideC;
		
		System.out.printf("The perimeter of the triangle is %d%n",perimeterOfTriangle);
	}
}