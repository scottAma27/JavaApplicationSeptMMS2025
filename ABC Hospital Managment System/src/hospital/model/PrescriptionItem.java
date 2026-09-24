package hospital.model;

public class PrescriptionItem {
    private int Id;
    private Prescription preciption;
    private Medication medication;
    private String dosage;
    
    private String frequency;
    private int duration;
    private String durationUnit; 
    private String instruction;
    
    public PrescriptionItem(){
        
    }

    public int getId() {
        return Id;
    }

    public Prescription getPreciption() {
        return preciption;
    }

    public void setPreciption(Prescription preciption) {
        this.preciption = preciption;
    }

    public Medication getMedication() {
        return medication;
    }

    public void setMedication(Medication medication) {
        this.medication = medication;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDurationUnit() {
        return durationUnit;
    }

    public void setDurationUnit(String durationUnit) {
        this.durationUnit = durationUnit;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }
    
}
