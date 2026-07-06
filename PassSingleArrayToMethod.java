/*
	Topic: passing arrays to Methods
	
	static: runs by the class name. It belongs to the object of the class
	instance: runs with the object of the class. 
	transvers: it means to loop through an arrary.
*/

public class PassSingleArrayToMethod{
	public static int sumTotal(int[] numbers){
			int sum = 0;
			for(int i = 0; i < numbers.length; i++){
				sum += numbers[i];
			}
			return sum;
		}
	public static void main (String [] args){
		
		int[] arr = {7,8,4,3,2,9,0,1,6,8};
		
		int totalNumber = sumTotal(arr);
		System.out.printf("The total number is %d%n",totalNumber);
	}
}
