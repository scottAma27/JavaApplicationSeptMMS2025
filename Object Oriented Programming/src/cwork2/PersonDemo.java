package cwork2;

public class PersonDemo {
   
    public static void main(String[] args) {
        Student s = new Student("Emma Johnsin", 20, "Computer Engineering", 300);
        Teacher t = new Teacher("Mr. David Welth", 45, "Engineering", 70000);
        s.display();
        t.display();
    }
}

