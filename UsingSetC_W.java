// 	creat a class that will store group of 10 emails. insted of using LinkedHashSet, used HashSet 

import java.util.Set;
import java.util.HashSet;

public class UsingSetC_W{
	public static void main (String [] args){
		Set<String> emails = new HashSet<>();
		
		emails.add("sam@gmail.com");
		emails.add("ds@gmail.com");
		emails.add("aa@gmail.com");
		emails.add("ww@gmail.com");
		emails.add("nn@gmail.com");
		emails.add("mm@gmail.com");
		emails.add("ee@gmail.com");
		emails.add("duble@gmail.com");
		emails.add("emma@gmail.com");
		emails.add("dav@gmail.com");
		
		System.out.println(emails);
		System.out.println("=============================");
		
		for(String email : emails){
			System.out.println(email);
		}
	}
}