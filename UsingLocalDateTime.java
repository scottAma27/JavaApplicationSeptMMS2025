import java.time.LocalDateTime;

public class UsingLocalDateTime{
	public static void main(String [] args){
		
		LocalDateTime todaysDateTime = LocalDateTime.now();
		LocalDateTime meetingDateTime = LocalDateTime.of(2021,05,15,06,30,45);
		LocalDateTime resumeDateTime = LocalDateTime.parse("2026-10-15");
		
		System.out.printf("The current local date and time is %s%n",todaysDateTime);
		System.out.printf("The current meeting date and time is %s%n",meetingDateTime);
		System.out.printf("The current resume date and time is %s%n",resumeDateTime);
	}
}