package hospital.model;

public class Department {
    private int Id;
    private String name;
    private int description;
    private int location;
    
    public Department(){
        
    }

    public Department(String name, int description, int location) {
        
        this.name = name;
        this.description = description;
        this.location = location;
    }

    public int getId() {
        return Id;
    }
    
    public void setId(int Id){
        this.Id = Id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    } 
}
