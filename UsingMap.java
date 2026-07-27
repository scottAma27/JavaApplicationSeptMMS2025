import java.util.HashMap;
import java.util.map;
import java.util.Set;

public class UsingMap{
	public static void main(String [] args){
		List <Integer, String> cars = new HashMap<>();
		
		map.put(101, "Frank John");
		map.put(102, "Henry Cliton");
		map.put(103, "Kate Benson");
		map.put(104, "Lucy Gerry");
		map.put(105, "Jonny Victoria");
		map.put(106, "Kate Benson");
		map.put(107, "Nathan Zoe");
		
		//get (Object key)- Return the value associated with they key
		String value = map.get(102);
		System.out.println("Value for 102: " + value);
		
		//remove(Object key)- Remoave the key-value pair for the specific key
		map.remove(106);
				
		// ContainsKey(Object key)- Checks if the map conatins thee specifickey
		boolean hasApple = map.conatinsKey(106);
		System.out.println("Contains 106: " + hasApple);
		
		// Keyset()- Returns a set view of the keys contained in the map
		Set<Integer> keys = map.keySet();
		System.out.println("Keys in map: " + keys);
	}
}