package cwork2;

public class Student extends Person  {
    
    private String course;
    private int level;
    public Student(String name, int age, String course, int level) {
        super(name, age);
        this.course = course;
        this.level = level;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Course: " + course);
        System.out.println("Level: " + level);
    }
}

