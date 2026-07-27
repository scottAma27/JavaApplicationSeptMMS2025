
package cwork10;

import java.util.ArrayList;

public class Teacher {
    
    private String id; 
    private String name; 
    
    private ArrayList<Course> courses = new ArrayList<>();
    public Teacher(String id, String name){ 
        this.id=id; 
        this.name=name; 
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
    
    public void assignCourse(Course c){ 
        courses.add(c); 
        c.setTeacher(this); 
    }
    public void displayCourses(){ 
        System.out.println("Courses by "+name+":"); 
        for(Course c: courses) 
            System.out.println(c.getName()); 
    }
}

