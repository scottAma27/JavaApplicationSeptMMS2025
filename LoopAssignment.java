import java.util.*;

public class LoopAssignment{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		int nctr = 1;
		int partA = 0;
		int partB = 0;
		int partC = 0;
		int finalResult = 0;
		int multiplication = 0;
		
		
		while(nctr <= 10){
			
			System.out.print("Enter a number: ");
			int number = sc.nextInt();
			
			
			if(nctr == 10){
				
				if(finalResult >= 100){
					System.out.println("Hurrayyy I did it.........");
				}
				
				else{
					System.out.println("I still need to learn more in java");
				}
				
			}
			
			else if(nctr == 1 || nctr == 5 || nctr == 10){
					if(nctr == 10){
						System.out.println(partA);
					}
					partA += number;
			}
			else if(nctr == 3 || nctr == 8 || nctr == 2){
				partB += number;
			}
			
			
			else if(nctr == 4 || nctr == 7 || nctr == 9){
				partC += number;
			}
			
			
			
			nctr++;
			
		}
		
	}
}