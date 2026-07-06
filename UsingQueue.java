import java.util.Queue;
import java.util.LinkedList;

public class UsingQueue{
	public static void main(String [] args){
		Queue<String> names = new LinkedList<>();
		
		names.add("Henry");
		names.add("Young");
		names.add("John");
		names.offer("Peter");
		
		System.out.println(names);
		
		// poll: is used to remove a value/element from the queue from the first value
		System.out.println(names.poll());
		System.out.println(names);
		/* peek: it used to return the element/value that was reoved from the queue from the frist value. 
				 opposite of poll
		*/
		System.out.println(names.peek());
		System.out.println(names);
		System.out.printf("Is my queue empty? %b%n",names.isEmpty());
		
		names.clear();
		System.out.println(names);
		System.out.println("================================");
		
		
		names.add("Henry");
		names.add("Young");
		names.add("John");
		names.offer("Peter");
		
		System.out.println(names);

	}
}