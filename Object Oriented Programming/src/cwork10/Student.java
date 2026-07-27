package cwork10;

import java.util.ArrayList;

public class Student {
    
    private String id; 
    private String name; 
    private ArrayList<Course> courses = new ArrayList<>();
    
    public Student(String id, String name){ 
        this.id=id; 
        this.name=name; 
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
    
    public void enroll(Course c){ 
        courses.add(c); 
        c.addStudent(this); 
    }
    public String getName(){ 
        return name; 
    }
    
}

