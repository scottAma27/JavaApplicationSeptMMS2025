// Array is the collection of elements f the sae data type.
// for loop is the best to used when using an Array but other loops still works.
public class SingleDimentionalArrary{
	public static void main (String [] args){
		
		int[] numbers = {2,4,6,8,12,15,20,25,26,30};
		
		System.out.printf("The element at index number 5 is %d%n",numbers[5]);
		System.out.printf("The element at index number 5 is %d%n",numbers[9]);
		
		System.out.println("Transversing through the element of the array");
		System.out.println("======================================");
		for(int i = 0; i < 10; i++){
			System.out.printf("%d%n",numbers[i]);
		}
	}	
}
/*
	Write a java program to transvers through this arrays 
	called numbers {6,9,5,12,4,8,5,2,16,14} display the even numbers 
*/