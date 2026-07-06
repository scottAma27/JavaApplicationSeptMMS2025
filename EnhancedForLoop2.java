/*
	Enhanced for loop: also know as "for-each loop." provides simplified and more readable way to 
	iterate over elements n arrays and collections.
*/

public class EnhancedForLoop2{
	public static void main (String [] args){
		int[] marks = {10,20,30,40,50,60,70,80,90,100};
		
		System.out.println("Student Marks are: ");
		for(int mark : marks){
			System.out.printf("%d%n",mark);
		}
	}
}