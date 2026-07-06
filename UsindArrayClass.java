/*
	Topic: Array class:
			The arrays class in java provides static methods for manipulating arrays, such as sorting, searching,
			and comparing arrays. this type of arrays are static methods. inside the Arra class, we have:
			1. sorting arrays 
			2. Searching arrays:
				1. binary search methods
			3. Equal and comparison:
				1. equals method: checks if the two arrays are equal
				2. compare method: if the first array is bigger,it displays 1 but when the first array is bigger, it displays 0
						it is used to compare two arrays lexicographically
			4. filling arrays: it fills all elements of an array with a specific value.
			5. Copying arrays: copies an array, possibly resizing it (also know as "copyOfMethod")
			6. converting arrays to strings 
*/

import java.util.Arrays;

public class UsindArrayClass{
	public static void main (String [] args){
		int[] numbers = {5,8,2,3,9,4,1,6,7,10};
		int[] a = {7,9,6};
		int[] b = {8,9,6};
		
		int[] c = {5,9,9};
		int[] d = {7,9,9};
		int[] myFillArr = new int[10];
		Arrays.fill(myFillArr,5);
		
		int[][] multi ={
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
		
		Arrays.sort(numbers);
		System.out.println("The elements of the array are");
		
		for(int number : numbers){
			System.out.printf("%d%n",number);
		}
		System.out.println("=================================");
		System.out.println("Binary search");
		int index = Arrays.binarySearch(numbers,9);
		System.out.printf("Theindex number of 9 is %d%n",index); 
		
		System.out.println("================================");
		boolean isEquals = Arrays.equals(a,b);
		System.out.printf("The result is %b%n",isEquals);
		
		System.out.println("=================================");
		int iscompare = Arrays.compare(d,c);
		System.out.printf("The result is %d%n",iscompare);
		
		System.out.println("=================================");
		System.out.println("My fill array are");
		for(int number : myFillArr){
			System.out.printf("%d%n",number);
		}
	
	System.out.println("=================================");
	int[] evenNumbers = {2,4,6,8,10,12,14,16,18,20};
	int[] copyArr = Arrays.copyOf(evenNumbers,10); //you can put any number and it will stop at the exact amount inside. 
	System.out.println("The elements of the array are");
	for(int arr : copyArr){
		System.out.printf("%d%n",arr);
	}
	
	System.out.println("=================================");
	System.out.println(Arrays.toString(evenNumbers));
		
	}
	System.out.println(Arrays.toString(multi));
	
	System.out.println(Arrays.deepToString(multi));	
        
}

// creat a two dimenstinal array and do dept to string method