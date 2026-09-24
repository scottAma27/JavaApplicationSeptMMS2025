package hospital.model;

import java.time.LocalDate;

public class Pharmacist extends Staff{
    private String qualifiation;
    private String licenseNumber;
    
    public Pharmacist(){
        
    }

    public Pharmacist( String firstName, String lastName, char gender,
            
            LocalDate dOB, String phonenumber, String email,
            
            String street, String city, String country,
            
            int staffID, LocalDate employeeDate,String qualifiation, String licenseNumber, 
            double salary, Department department) {
        
        super(firstName, lastName, gender,
                dOB, phonenumber, email,
                street, city, country, 
                staffID, employeeDate, 
                salary, department);
        this.qualifiation = qualifiation;
        this.licenseNumber = licenseNumber;
    }
    
    public String getQualifiation() {
        return qualifiation;
    }

    public void setQualifiation(String qualifiation) {
        this.qualifiation = qualifiation;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
    
}