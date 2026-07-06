/*	Topic: java collection framework 
	four types of interface 
	1. list: it's an interface meaning, it does not work on it own 
		add: it is used to add element to the list 
		get: it is used to get an element or value from the list by usng the index or the name.
		set: helps to change any element/value at any point of in the list 
		remove: it's used to reomove or delet an element or a value in a list 
	2. set:
	3. map
	4. queue
	5. Contains: it is used to check if an element or value exist and retures a tru or false message.
	6.isEmtpy: used to check the if the valuse inside the list is empty or not and displays a true or false message.
	Note: we have a class called array list and link list.
	Null: it's used to clear everthing int the arraylis class. same with clear
		
	
	assignment wrapper classes 
*/
import java.util.List;
import java.util.ArrayList;

public class UsingList{
	public static void main(String [] args){
		List <String> cars = new ArrayList<>();
		
		cars.add("Toyota");
		cars.add("BMW");
		cars.add("Merceds Benz");
		cars.add("Toyota");
		cars.add(1,"Ford");
		System.out.println(cars.size());
		
		//set the value of an element
		cars.set(1,"Dodge");
		
		//removing an elementfrom a list 
		cars.remove(0);
		
		System.out.printf("The size of the car list is %d%n",cars.size());
		
		//get element using the indexing 
		System.out.printf ("%s%n",cars.get(1));
		
		for(String car : cars){
			System.out.println(car);
		}
		// System.out.println(car);
	}
}