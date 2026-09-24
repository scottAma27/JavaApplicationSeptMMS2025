package Aggregation;

import Composition.Payment;
import java.time.LocalDate;

public class Student {
    private int studentID;
    private String firstName;
    private String lastName;
    private char gender;
    private Payment payment;
    
    public Student(int studentID, String firstName, String lastName, char gender){
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.payment = null;
    }
    
    public void makePayment(double amount, LocalDate paymentDate, String paymentMethod, String paymentType){
        
        this.payment = new Payment(amount, paymentDate, paymentMethod, paymentType);
    }
    
    public boolean hasPaid(){
        return payment != null;
    }
    
    public void displayStudentDetails(){
        System.out.println();
        System.out.println("===================STUDENT INFORMATION======================");
        
        System.out.println("StudentID: "+ studentID);
        System.out.println("FirstName: "+ firstName);
        System.out.println("LastName: "+ lastName);
        System.out.println("Gender: "+ gender);
        
        if (payment != null){
            System.out.println("Payment Status: PAID");
            
            payment.displaymentDeails();
        }
        else{
            System.out.println("Payment Status: NOT PAID");
        }
                
    }
    
}
