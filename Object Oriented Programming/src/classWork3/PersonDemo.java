package classWork3;

public class PersonDemo {
  
    public static void main(String[] args) {
       
        Person teacher = new Teacher("Sir. Akpan", 45);
        Person student = new Student("John Emus", 21);

        System.out.println("--- Teacher Details ---");
        teacher.displayDetails();
        teacher.performDuty();    
        
        System.out.println("\n--- Student Details ---");
        student.displayDetails();
        student.performDuty();
    }
} 

