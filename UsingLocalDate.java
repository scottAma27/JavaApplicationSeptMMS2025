/*
	Topic: java date and time
		localDate: represents date only. it deals with only date.(no time, no timezone)
		it contains year, month and day. e.g 2026/06/25
		the pass method 
		
		plus day will add a day from a month.
		minus day will remove a day from the month 
		lip year
*/
import java.time.LocalDate;

public class UsingLocalDate{
	public static void main(String [] args){
		LocalDate todaysDate = LocalDate.now();
		LocalDate myBirthDate = LocalDate.of(2000,5,25);
		LocalDate resumtionDate = LocalDate.parse("2026-10-15");
		
		boolean isLeepYear = resumtionDate.isLeepYear();
		boolean isEqual = resumtionDate.equals(myBirthDate);
		
		System.out.printf("Today's date is %s%n",todaysDate);
		System.out.printf("My birth dadatis %s%n",myBirthDate);
		System.out.printf("The resumtion date is %s%n",resumtionDate);
		System.out.printf("Resuption year is %s%n",resumtionDate.getYear());
		System.out.printf("Resuption Month is %s%n",resumtionDate.getMonth());
		System.out.printf("Resuption day is %s%n",resumtionDate.getDayOfMonth());
		System.out.printf("The meeting date is %s%n",resumtionDate.plusDays(10));
		System.out.printf("The party date will be %s%n",resumtionDate.plusMonths(5));
		System.out.printf("Resumtion date a leap year %b%n",resumtionDate.isLeepYear);
		System.out.printf("is %s the same as %s? %b%n",resumtionDate,myBirthDate,isEqual);
		
	}
}