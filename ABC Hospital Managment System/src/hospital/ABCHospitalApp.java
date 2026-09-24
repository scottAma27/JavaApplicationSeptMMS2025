package hospital;

import abchospitalsystem.DBConnection; // FIXED - This is your real connection class
import hospital.model.*;
import hospital.services.*;
import hospital.userview.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.sql.*;
import java.util.Scanner;

public class ABCHospitalApp {

    private static final Scanner scanner = new Scanner(System.in);
    private static final AuthService authService = new AuthService();
    private static User loggedInUser = null;

    private static final PatientService patientService = new PatientService();
    private static final PatientView patientView = new PatientView();
    private static final DoctorService doctorService = new DoctorService();
    private static final DoctorView doctorView = new DoctorView();
    private static final NurseService nurseService = new NurseService();
    private static final NurseView nurseView = new NurseView();
    private static final AppointmentService appointmentService = new AppointmentService();
    private static final AppointmentView appointmentView = new AppointmentView();
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static void main(String[] args) {
        if (!login()) return;
        while (true) {
            displayMainMenu();
            int choice = readInt("Enter your choice: ");
            switch (choice) {
                case 1: dashboard(); break;
                case 2: patientManagementMenu(); break;
                case 3: staffManagementMenu(); break;
                case 4: appointmentManagementMenu(); break;
                case 5: admissionManagementMenu(); break;
                case 6: clinicalManagementMenu(); break;
                case 7: laboratoryServicesMenu(); break;
                case 8: pharmacyServicesMenu(); break;
                case 9: billingPaymentMenu(); break;
                case 10: hospitalAdministrationMenu(); break;
                case 11: userAccountMenu(); break;
                case 0: System.out.println("Logout... Bye " + loggedInUser.getFullName()); return;
                default: System.out.println("Invalid choice.");
            }
        }
    }

    private static boolean login() {
        System.out.println("\n========================================\n ABC HOSPITAL LOGIN\n========================================");
        for (int i = 0; i < 3; i++) {
            System.out.print("\nUsername: "); String u = scanner.nextLine();
            System.out.print("Password: "); String p = scanner.nextLine();
            User user = authService.login(u, p);
            if (user!= null) { loggedInUser = user; System.out.println("LOGIN SUCCESSFUL - " + user.getFullName() + " [" + user.getRole() + "]"); return true; }
            System.out.println("Invalid! Left: " + (2-i));
        }
        return false;
    }

    private static void displayMainMenu() {
        System.out.println("\n========================================\n ABC HOSPITAL MAIN MENU\n========================================");
        System.out.println("1. Dashboard\n2. Patient Management\n3. Staff Management\n4. Appointment Management\n5. Admission & Bed Management\n6. Clinical Management\n7. Laboratory Services\n8. Pharmacy Services\n9. Billing & Payment\n10. Hospital Administration\n11. User Account\n0. Logout\n========================================");
    }
    private static void dashboard() {
        System.out.println("\n--- DASHBOARD ---\nUser: " + loggedInUser.getUsername() + " | Role: " + loggedInUser.getRole() + " | ACTIVE | ONLINE\nPress Enter..."); scanner.nextLine();
    }

    private static void patientManagementMenu() {
        while (true) {
            System.out.println("\n========== PATIENT MANAGEMENT ==========\n1. Register Patient\n2. View All Patients\n3. Find Patient\n4. Update Patient\n5. Delete Patient\n6. View Patient Profile\n7. View Medical History\n8. View Patient Appointments\n9. View Patient Admissions\n10. View Patient Prescriptions\n11. View Patient Billing History\n0. Back\n========================================");
            int c = readInt("Enter your choice: ");
            switch (c) {
                case 1: registerPatient(); break;
                case 2: patientView.displayPatients(patientService.getAllPatients()); break;
                case 3: findPatient(); break;
                case 4: updatePatient(); break;
                case 5: deletePatient(); break;
                case 6: viewPatientProfile(); break;
                case 7: viewMedicalHistory(); break;
                case 8: viewPatientAppointments(); break;
                case 9: viewPatientAdmissions(); break;
                case 10: viewPatientPrescriptions(); break;
                case 11: viewPatientBillingHistory(); break;
                case 0: return;
            }
        }
    }

    private static void registerPatient() {
        try {
            System.out.println("\n--- REGISTER PATIENT ---");
            System.out.print("First Name: "); String fn = scanner.nextLine();
            System.out.print("Last Name: "); String ln = scanner.nextLine();
            System.out.print("Gender M/F: "); char g = scanner.nextLine().charAt(0);
            System.out.print("DOB yyyy-MM-dd: "); LocalDate dob = LocalDate.parse(scanner.nextLine(), DATE_FORMATTER);
            System.out.print("Phone: "); String ph = scanner.nextLine();
            System.out.print("Email: "); String em = scanner.nextLine();
            System.out.print("Street: "); String st = scanner.nextLine();
            System.out.print("City: "); String city = scanner.nextLine();
            System.out.print("Country: "); String country = scanner.nextLine();
            System.out.print("Blood Group: "); String bg = scanner.nextLine();
            System.out.print("Genotype: "); String gt = scanner.nextLine();
            System.out.print("Allergies: "); String al = scanner.nextLine();
            System.out.print("Emergency Contact: "); String ec = scanner.nextLine();
            System.out.print("Emergency Phone: "); String ep = scanner.nextLine();
            Patient p = new Patient(bg, gt, al, ec, ep, fn, ln, g, dob, ph, em, st, city, country);
            boolean ok = patientService.registerPatient(p);
            System.out.println(ok? "Patient registered!" : "Failed!");
        } catch (Exception e) { System.out.println("Error: " + e.getMessage()); }
    }
    private static void findPatient() { int id = readInt("Patient ID: "); patientView.displayPatient(patientService.getPatientById(id)); }
    private static void updatePatient() {
        int id = readInt("Patient ID to update: "); Patient p = patientService.getPatientById(id);
        if (p == null) { System.out.println("Not found"); return; }
        patientView.displayPatient(p);
        System.out.print("New First Name (leave blank to keep): "); String fn = scanner.nextLine(); if(!fn.isEmpty()) p.setFirstName(fn);
        System.out.print("New Phone: "); String ph = scanner.nextLine(); if(!ph.isEmpty()) p.setPhone(ph);
        System.out.println(patientService.updatePatient(p)? "Updated!" : "Failed");
    }
    private static void deletePatient() { int id = readInt("Patient ID to delete: "); patientView.displayPatient(patientService.getPatientById(id)); System.out.print("Confirm Y/N: "); if(scanner.nextLine().equalsIgnoreCase("Y")) System.out.println(patientService.deletePatient(id)? "Deleted" : "Failed"); }
    private static void viewPatientProfile() { int id = readInt("Patient ID: "); patientView.displayPatient(patientService.getPatientById(id)); }
    private static void viewMedicalHistory() { int id = readInt("Patient ID: "); queryAndPrint("SELECT d.DiagnoseId, d.Diagnosis, t.Description FROM Diagnose d LEFT JOIN Treatment t ON d.DiagnoseId=t.DiagnoseId WHERE d.MedicalRecordId IN (SELECT MedicalRecordId FROM MedicalRecord WHERE PatientId=?)", id); }
    private static void viewPatientAppointments() { int id = readInt("Patient ID: "); appointmentView.displayAppointments(appointmentService.getAppointmentsByPatient(id)); }
    private static void viewPatientAdmissions() { int id = readInt("Patient ID: "); queryAndPrint("SELECT * FROM Admission WHERE PatientId=?", id); }
    private static void viewPatientPrescriptions() { int id = readInt("Patient ID: "); queryAndPrint("SELECT * FROM Prescription WHERE MedicalRecordId IN (SELECT MedicalRecordId FROM MedicalRecord WHERE PatientId=?)", id); }
    private static void viewPatientBillingHistory() { int id = readInt("Patient ID: "); queryAndPrint("SELECT i.InvoiceId, i.TotalAmount, i.Status, p.Amount FROM Invoice i LEFT JOIN Payment p ON i.InvoiceId=p.InvoiceId WHERE i.PatientId=?", id); }

    private static void staffManagementMenu() {
        while (true) {
            System.out.println("\n========== STAFF MANAGEMENT ==========\n1. Doctor Management\n2. Nurse Management\n3. Pharmacist Management\n4. Laboratory Technician Management\n5. View All Staff\n6. Find Staff\n7. View Staff by Department\n8. Staff Account Management\n0. Back\n========================================");
            int c = readInt("Enter your choice: ");
            switch (c) {
                case 1: doctorManagementMenu(); break;
                case 2: nurseManagementMenu(); break;
                case 3: pharmacistManagementMenu(); break;
                case 4: labTechManagementMenu(); break;
                case 5: viewAllStaff(); break;
                case 6: findStaff(); break;
                case 7: viewStaffByDepartment(); break;
                case 8: userAccountMenu(); break;
                case 0: return;
            }
        }
    }
    private static void viewAllStaff() { queryAndPrint("SELECT s.StaffId, p.FirstName+' '+p.LastName AS Name, d.DepartmentName, s.Salary FROM Staff s JOIN Person p ON s.PersonId=p.PersonId JOIN Department d ON s.DepartmentId=d.DepartmentId"); }
    private static void findStaff() { int id = readInt("Staff ID: "); queryAndPrint("SELECT s.StaffId, p.FirstName, p.LastName, p.Gender, p.Phone FROM Staff s JOIN Person p ON s.PersonId=p.PersonId WHERE s.StaffId=?", id); }
    private static void viewStaffByDepartment() { int deptId = readInt("Department ID: "); queryAndPrint("SELECT s.StaffId, p.FirstName+' '+p.LastName AS Name FROM Staff s JOIN Person p ON s.PersonId=p.PersonId WHERE s.DepartmentId=?", deptId); }

    private static void doctorManagementMenu() {
        while (true) {
            System.out.println("\n========== DOCTOR MANAGEMENT ==========\n1. Register Doctor\n2. View All Doctors\n3. Find Doctor (by DoctorId)\n4. Update Doctor\n5. Delete Doctor\n6. View Doctor Appointments\n0. Back\n========================================");
            int c = readInt("Enter your choice: ");
            switch (c) {
                case 1: registerDoctor(); break;
                case 2: doctorView.displayDoctors(doctorService.getAllDoctors()); break;
                case 3: int id=readInt("DoctorId: "); doctorView.displayDoctor(doctorService.getDoctorById(id)); break;
                case 4: updateDoctor(); break;
                case 5: int del=readInt("DoctorId to delete: "); System.out.println(doctorService.deleteDoctor(del)?"Deleted":"Failed"); break;
                case 6: int did=readInt("DoctorId: "); appointmentView.displayAppointments(appointmentService.getAppointmentsByDoctor(did)); break;
                case 0: return;
            }
        }
    }
    private static void registerDoctor() {
        try {
            System.out.print("First Name: "); String fn=scanner.nextLine();
            System.out.print("Last Name: "); String ln=scanner.nextLine();
            System.out.print("Gender M/F: "); char g=scanner.nextLine().charAt(0);
            System.out.print("DOB yyyy-MM-dd: "); LocalDate dob=LocalDate.parse(scanner.nextLine(), DATE_FORMATTER);
            System.out.print("Phone: "); String ph=scanner.nextLine();
            System.out.print("Email: "); String em=scanner.nextLine();
            System.out.print("Employment Date yyyy-MM-dd: "); LocalDate emp=LocalDate.parse(scanner.nextLine(), DATE_FORMATTER);
            System.out.print("Salary: "); double sal=Double.parseDouble(scanner.nextLine());
            int deptId=readInt("Department ID: "); Department dept=new Department(); dept.setId(deptId); dept.setName("Doctor Dept");
            System.out.print("Specialization: "); String spec=scanner.nextLine();
            System.out.print("License: "); String lic=scanner.nextLine();
            Doctor d=new Doctor(fn,ln,g,dob,ph,em,"",""
                    ,"",0,emp,sal,dept,spec,lic);
            System.out.println(doctorService.registerDoctor(d)?"Doctor registered! DoctorId="+d.getStaffId():"Failed");
        } catch(Exception e){ System.out.println("Error: "+e.getMessage()); e.printStackTrace(); }
    }
    private static void updateDoctor() { int id=readInt("DoctorId to update: ");
    Doctor d=doctorService.getDoctorById(id); if(d==null){
        
        System.out.println("Not found"); return;} 
    System.out.print("New Specialization: "); d.setSpecialization(scanner.nextLine()); 
    System.out.println(doctorService.updateDoctor(d)?"Updated":"Failed"); }

    private static void nurseManagementMenu() {
        while (true) {
            System.out.println("\n========== NURSE MANAGEMENT ==========\n1. Register Nurse\n2. View All Nurses\n3. Find Nurse\n4. Update Nurse\n5. Delete Nurse\n6. View Nurse Assignments\n0. Back\n========================================");
            int c=readInt("Enter your choice: ");
            switch(c){
                case 1: registerNurse(); break;
                case 2: nurseView.displayNurses(nurseService.getAllNurses()); break;
                case 3: int id=readInt("Nurse Staff ID: "); nurseView.displayNurse(nurseService.getNurseById(id)); break;
                case 4: updateNurse(); break;
                case 5: int del=readInt("Nurse Staff ID to delete: "); System.out.println(nurseService.deleteNurse(del)?"Deleted":"Failed"); break;
                case 6: int nid=readInt("Nurse Staff ID: "); queryAndPrint("SELECT * FROM NurseAssignment WHERE NurseId=?", nid); break;
                case 0: return;
            }
        }
    }
    private static void registerNurse() {
        try {
            System.out.print("First Name: "); String fn=scanner.nextLine();
            System.out.print("Last Name: "); String ln=scanner.nextLine();
            System.out.print("Gender M/F: "); char g=scanner.nextLine().charAt(0);
            System.out.print("DOB yyyy-MM-dd: "); LocalDate dob=LocalDate.parse(scanner.nextLine(), DATE_FORMATTER);
            System.out.print("Phone: "); String ph=scanner.nextLine();
            System.out.print("Employment Date yyyy-MM-dd: "); LocalDate emp=LocalDate.parse(scanner.nextLine(), DATE_FORMATTER);
            System.out.print("Salary: "); double sal=Double.parseDouble(scanner.nextLine());
            int deptId=readInt("Department ID: "); Department dept=new Department(); dept.setId(deptId); dept.setName("Nursing");
            System.out.print("License: "); String lic=scanner.nextLine();
            System.out.print("Qualification: "); String qual=scanner.nextLine();
            Nurse n=new Nurse(fn,ln,g,dob,ph,"","","","",0,emp,sal,dept,lic,qual);
            System.out.println(nurseService.registerNurse(n)?"Nurse registered!":"Failed");
        } catch(Exception e){ System.out.println("Error: "+e.getMessage()); }
    }
    private static void updateNurse() { int id=readInt("Nurse ID to update: "); Nurse n=nurseService.getNurseById(id); if(n==null){System.out.println("Not found"); return;} System.out.print("New Qualification: "); n.setQualification(scanner.nextLine()); System.out.println(nurseService.updateNurse(n)?"Updated":"Failed"); }

    private static void pharmacistManagementMenu() {
        while (true) {
            System.out.println("\n========== PHARMACIST MANAGEMENT ==========\n1. Register Pharmacist\n2. View All Pharmacists\n3. Find Pharmacist\n0. Back\n========================================");
            int c=readInt("Enter your choice: "); if(c==0) return;
            if(c==2) queryAndPrint("SELECT ph.PharmacistId, p.FirstName+' '+p.LastName AS Name FROM Pharmacist ph JOIN Staff s ON ph.StaffId=s.StaffId JOIN Person p ON s.PersonId=p.PersonId");
            if(c==1) { int staffId=readInt("Existing Staff ID to make Pharmacist: "); System.out.print("License: "); String lic=scanner.nextLine(); queryAndPrintUpdate("INSERT INTO Pharmacist(StaffId, LicenseNumber) VALUES(?,?)", staffId, lic); }
        }
    }
    private static void labTechManagementMenu() {
        while (true) {
            System.out.println("\n========== LABORATORY TECHNICIAN MANAGEMENT ==========\n1. Register Lab Tech\n2. View All Lab Techs\n0. Back\n========================================");
            int c=readInt("Enter your choice: "); if(c==0) return;
            if(c==2) queryAndPrint("SELECT lt.TechnicianId, p.FirstName+' '+p.LastName AS Name FROM LaboratoryTechnician lt JOIN Staff s ON lt.StaffId=s.StaffId JOIN Person p ON s.PersonId=p.PersonId");
            if(c==1) { int staffId=readInt("Staff ID: "); System.out.print("Lab License: "); String lic=scanner.nextLine(); queryAndPrintUpdate("INSERT INTO LaboratoryTechnician(StaffId, LabLicense) VALUES(?,?)", staffId, lic); }
        }
    }

    // ================= 4. APPOINTMENT - FIXED FK ERROR =================
    private static void appointmentManagementMenu() {
        while (true) {
            System.out.println("\n========== APPOINTMENT MANAGEMENT ==========\n1. Create Appointment\n2. View All Appointments\n3. Find Appointment\n4. Update Appointment\n5. Delete Appointment\n6. View Patient Appointments\n7. View Doctor Appointments\n0. Back\n========================================");
            int c=readInt("Enter your choice: ");
            switch(c){
                case 1: createAppointment(); break;
                case 2: appointmentView.displayAppointments(appointmentService.getAllAppointments()); break;
                case 3: int aid=readInt("Appointment ID: "); appointmentView.displayAppointment(appointmentService.getAppointmentById(aid)); break;
                case 4: updateAppointment(); break;
                case 5: int del=readInt("Appointment ID to delete: "); System.out.println(appointmentService.deleteAppointment(del)?"Deleted":"Failed"); break;
                case 6: viewPatientAppointments(); break;
                case 7: int did=readInt("DoctorId: "); appointmentView.displayAppointments(appointmentService.getAppointmentsByDoctor(did)); break;
                case 0: return;
            }
        }
    }

    // *** FIXED METHOD - Uses DoctorId NOT StaffId ***
    private static void createAppointment() {
        try {
            // Show valid IDs first to avoid FK error
            System.out.println("\n--- Valid Patients ---");
            queryAndPrint("SELECT TOP 5 PatientId, PatientId FROM Patient");
            System.out.println("\n--- Valid Doctors (Use DoctorId) ---");
            queryAndPrint("SELECT TOP 5 DoctorId, StaffId FROM Doctor");

            int patId=readInt("\nEnter Patient ID: ");
            Patient pat=patientService.getPatientById(patId);
            if(pat==null){System.out.println("Patient ID "+patId+" not found! Check SELECT above."); return;}

            int docId=readInt("Enter DoctorId (NOT StaffId): ");
            Doctor doc=doctorService.getDoctorById(docId);
            if(doc==null){System.out.println("DoctorId "+docId+" not found! Must exist in Doctor table."); return;}

            System.out.print("Date yyyy-MM-dd HH:mm (e.g. 2026-05-15 10:30): ");
            LocalDateTime dt=LocalDateTime.parse(scanner.nextLine(), DATE_TIME_FORMATTER);
            System.out.print("Reason: "); String reason=scanner.nextLine();
            System.out.print("Notes: "); String notes=scanner.nextLine();

            Appointment ap=new Appointment();
            ap.setPatient(pat);
            ap.setDoctor(doc); // Doctor object must have DoctorId set
            ap.setAppointmentDate(dt);
            ap.setReason(reason);
            ap.setStatus("Scheduled");
            ap.setNotes(notes);

            boolean success = appointmentService.addAppointment(ap);
            System.out.println(success? "SUCCESS! Created Appointment ID: "+ap.getId() : "Failed - Check FK");
        } catch(Exception e){ System.out.println("Error: "+e.getMessage()); e.printStackTrace(); }
    }

    private static void updateAppointment() {
        int id=readInt("Appointment ID to update: "); Appointment ap=appointmentService.getAppointmentById(id); if(ap==null){System.out.println("Not found"); return;}
        try{ System.out.print("New Date yyyy-MM-dd HH:mm: "); ap.setAppointmentDate(LocalDateTime.parse(scanner.nextLine(), DATE_TIME_FORMATTER)); System.out.print("New Reason: "); ap.setReason(scanner.nextLine()); System.out.println(appointmentService.updateAppointment(ap)?"Updated":"Failed"); } catch(Exception e){ System.out.println("Bad date"); }
    }

    private static void admissionManagementMenu() { queryAndPrint("SELECT TOP 10 * FROM Admission"); }
    private static void clinicalManagementMenu() { queryAndPrint("SELECT TOP 10 * FROM Diagnose"); }
    private static void laboratoryServicesMenu() { queryAndPrint("SELECT TOP 10 * FROM LaboratoryTest"); }
    private static void pharmacyServicesMenu() { queryAndPrint("SELECT TOP 10 * FROM Medication"); }
    private static void billingPaymentMenu() { queryAndPrint("SELECT TOP 10 * FROM Invoice"); }
    private static void hospitalAdministrationMenu() { queryAndPrint("SELECT * FROM Department"); }
    private static void userAccountMenu() { queryAndPrint("SELECT u.UserId, u.Username, u.Role, u.IsActive, p.FirstName+' '+p.LastName AS StaffName FROM Users u JOIN Staff s ON u.StaffId=s.StaffId JOIN Person p ON s.PersonId=p.PersonId"); }

    private static void queryAndPrint(String sql, Object... params) {
        try(Connection con=DBConnection.getConnection(); PreparedStatement pst=con.prepareStatement(sql)){
            for(int i=0;i<params.length;i++) pst.setObject(i+1, params[i]);
            ResultSet rs=pst.executeQuery(); ResultSetMetaData md=rs.getMetaData(); int cols=md.getColumnCount();
            boolean hasData = false;
            while(rs.next()){ hasData = true; for(int i=1;i<=cols;i++) System.out.print(md.getColumnName(i)+": "+rs.getString(i)+" | "); System.out.println(); }
            if(!hasData) System.out.println("(No data)");
        } catch(Exception e){ System.out.println("Query Error: "+e.getMessage()); }
    }
    private static void queryAndPrintUpdate(String sql, Object... params) {
        try(Connection con=DBConnection.getConnection(); PreparedStatement pst=con.prepareStatement(sql)){
            for(int i=0;i<params.length;i++) pst.setObject(i+1, params[i]);
            int r=pst.executeUpdate(); System.out.println(r>0?"Success!":"Failed");
        } catch(Exception e){ System.out.println("Update Error: "+e.getMessage()); }
    }
    private static int readInt(String msg) { while(true){ try{ System.out.print(msg); return Integer.parseInt(scanner.nextLine()); } catch(Exception e){ System.out.println("Enter number"); } } }
}