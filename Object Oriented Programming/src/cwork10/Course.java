package cwork10;

import java.util.ArrayList;

public class Course {

    private String id; 
    private String name; 
    private Teacher teacher; 
    private ArrayList<Student> students = new ArrayList<>(); 
    private ClassRoom room;
    public Course(String id, String name, ClassRoom room){ 
        this.id=id; 
        this.name=name; 
        this.room=room; 
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ClassRoom getRoom() {
        return room;
    }

    public void setRoom(ClassRoom room) {
        this.room = room;
    }
    
    public void setTeacher(Teacher t){ 
        teacher = t; 
    }
    public void addStudent(Student s){ 
        students.add(s); 
    }
    public String getName(){ 
        return name; 
    }
    public void displayStudents(){ 
        System.out.println("Students in "+name+":"); 
        for(Student s: students) 
            System.out.println(s.getName()); 
    }

    void displayStudent() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void displayStudent() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

