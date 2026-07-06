/*
	Enhanced for loop: also know as "for-each loop." provides simplified and more readable way to 
	iterate over elements n arrays and collections.
*/

public class EnhancedForLoop{
	public static void main (String [] args){
		String[] names = {"John", "Jack", "Mary", "James", "Lucy"};
		
		System.out.println("Student Names are: ");
		for(String name : names){
			System.out.printf("%s%n",name);
		}
	}
}