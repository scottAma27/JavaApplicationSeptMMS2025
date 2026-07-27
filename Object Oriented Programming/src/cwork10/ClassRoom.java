package cwork10;

public class ClassRoom {
   
    private String roomNo; 
    private int capacity;
    public ClassRoom(String roomNo, int capacity){ 
        this.roomNo=roomNo; 
        this.capacity=capacity; 
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}   

