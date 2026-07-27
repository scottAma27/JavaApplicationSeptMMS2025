
package school;

import java.time.LocalDate;

/**
 *
 * @author Chris
 */
public class GraduateStudent extends Student {
    
    private String finalYearProject; 
    
    public GraduateStudent(int studentID, String firstName, String lastName, char gender, LocalDate dOB, String phoneNumber,String finalYearProject) {
        super(studentID, firstName, lastName, gender, dOB, phoneNumber);
        
        this.finalYearProject = finalYearProject;
    }
    
 
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Final year project " + finalYearProject);
    }
}
