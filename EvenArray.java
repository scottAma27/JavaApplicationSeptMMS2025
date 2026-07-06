/*
	Write a java program to transvers through this arrays 
	called numbers {6,9,5,12,4,8,5,2,16,14} display the even numbers 
*/

public class EvenArray{
	public static void main (String [] args){
		
		int[] numbers = {6,9,5,12,4,8,5,2,16,14};
		
		int totalEven = 0;
		
		System.out.println("======================================");
		for(int i = 0; i < 10; i++){
			 if(numbers[i] % 2 == 0){
				 totalEven++;
			 }
		}
		System.out.printf("The count of even number is %d%n",totalEven);
		// if(number % 2 == 0){
			// System.out.printf("%d%n",numbers[i]);
			// number++;
		// }
	}
}	