// import java.time.LocalTime;
// import java.time.LocalDate;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class UsingDateTimeFormatter{
	public static void main (String [] args){
		LocalDate today = LocalDate.now();
		
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd.MM. yYYY");

		System.out.println (today. format (formatter1));
		System.out.println (today. format (formatter2));
		
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println("dd    : " +
				now.format(DateTimeFormatter. ofPattern ("dd")));
		
		System.out.println("MM    : " +
				now.format(DateTimeFormatter.ofPattern ("MM")));
				
		System.out.println("MMM   : " +
				now.format(DateTimeFormatter.ofPattern ("MMM")));

		System.out.println("MMMM  : " +
				now.format(DateTimeFormatter.ofPattern ("MMMM")));	
				
		System.out.println("YY    : " +
				now.format(DateTimeFormatter.ofPattern ("YY")));
				
		System.out.println("YYYY  : " +
				now.format(DateTimeFormatter.ofPattern ("YYYY")));
				
		System.out.println("HH    : " +
				now.format(DateTimeFormatter.ofPattern ("HH")));
				
		System.out.println("hh    : " +
				now.format(DateTimeFormatter.ofPattern ("hh")));
				
		System.out.println("mm    : " +
				now.format(DateTimeFormatter.ofPattern ("mm")));
				
		System.out.println("ss    : " +
				now.format(DateTimeFormatter.ofPattern ("ss")));
				
		System.out.println("a     : " +
				now.format(DateTimeFormatter.ofPattern ("a")));		
		
	}
}

		// LocalDateTime now = LocalDateTime.now();
		
		// LocalDate myBirthDate = LocalDate.of(2000,09,23);
		
		// DateTimeFormatter formatter = DateTimeFormatter.parse("dd/mm/yyyy");