package cwork10;

public class MainDemo {
   
    public static void main(String[] args) {
        ClassRoom room = new ClassRoom("A1", 40);
        Teacher t = new Teacher("T1", "Mr. Smith");
        Student s1 = new Student("S1", "Ada");
        Course c1 = new Course("C1", "Math", room);
        t.assignCourse(c1); 
        s1.enroll(c1); 
        c1.displayStudent(); 
        t.displayCourses();
    }
}
