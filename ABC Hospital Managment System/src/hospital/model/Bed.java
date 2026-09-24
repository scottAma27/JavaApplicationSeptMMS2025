package hospital.model;

public class Bed {
    private int Id;
    private String bedNumber;
    private Room room;
    private boolean occupied;
    
    public Bed(){
        
    }

    public int getId() {
        return Id;
    }

    public String getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(String bedNumber) {
        this.bedNumber = bedNumber;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
    
}
