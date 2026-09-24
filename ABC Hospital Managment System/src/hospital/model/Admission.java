package hospital.model;

import java.time.LocalDate;

public class Admission {
    private int Id;
    private Patient patient;
    private Bed bed;
    private LocalDate addmissionDate;
    private LocalDate dischargeDate;
    private String reason;
    private String satuse;
    
  public Admission(){
      
  }  

    public int getId() {
        return Id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public LocalDate getAddmissionDate() {
        return addmissionDate;
    }

    public void setAddmissionDate(LocalDate addmissionDate) {
        this.addmissionDate = addmissionDate;
    }

    public LocalDate getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(LocalDate dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getSatuse() {
        return satuse;
    }

    public void setSatuse(String satuse) {
        this.satuse = satuse;
    }
    
}
