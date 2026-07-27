
package main;

import java.time.LocalDate;
import java.util.Scanner;
import school.Student;
import school.GraduateStudent; 
import school.UnderGraduateStudent; 


public class SchoolManagementSystemApp {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 1 for Graduate Student");
        System.out.println("Enter 2 for Under Graduate Student");
        
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt(); 
        
        switch(choice){
            case 1:{ 
                System.out.print("Enter your student ID: ");
                int studentID = scan.nextInt(); 
                scan.nextLine();
                
                System.out.print("Enter First Name ");
                String firstName = scan.nextLine();
                
                System.out.print("Enter Last Name ");
                String lastName = scan.nextLine();
                
                System.out.print("Enter gender:  ");
                char gender = scan.next().charAt(0);
                scan.nextLine();
                
                System.out.print("Enter Date of Birth(YYYY-MM-DD) ");
                String dateOfBirth = scan.nextLine();
                
                System.out.print("Enter Phone Number ");
                String phoneNumber = scan.nextLine();
                
                System.out.print("Enter Final Year Project");
                String finalYearProject = scan.nextLine();
                
                GraduateStudent gStudent = new GraduateStudent(studentID,firstName,lastName,gender,LocalDate.parse(dateOfBirth),phoneNumber,finalYearProject);
                
                System.out.println(""); 
                System.out.println("=============================");
                gStudent.displayInfo();
                break; 
        }
            case 2: {
                System.out.print("Enter your student ID: ");
                int studentID = scan.nextInt(); 
                scan.nextLine();
                
                System.out.print("Enter First Name ");
                String firstName = scan.nextLine();
                
                System.out.print("Enter Last Name ");
                String lastName = scan.nextLine();
                
                System.out.print("Enter gender:  ");
                char gender = scan.next().charAt(0);
                scan.nextLine();
                
                System.out.print("Enter Date of Birth(YYYY-MM-DD): ");
                String dateOfBirth = scan.nextLine();
                
                System.out.print("Enter Phone Number: ");
                String phoneNumber = scan.nextLine();
                
                System.out.print("Enter Final Year Project");
                int level = scan.nextInt();
                
                UnderGraduateStudent uGStudent = new UnderGraduateStudent(studentID,firstName,lastName,gender,LocalDate.parse(dateOfBirth),phoneNumber,level);
                
                System.out.println(""); 
                System.out.println("=============================");
                uGStudent.displayInfo();
                break; 
            }
        }
        
      
    }
}
