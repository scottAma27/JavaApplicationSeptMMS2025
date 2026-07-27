package cwork4;

public class VehicleDemo {
    public static void main(String[] args) {
         Vehicle [] vehicleObject ={
             new Car(),
             new Bicycle(),
             new Airplane()
    };
       for(Vehicle vehicle : vehicleObject){
            vehicle.move();
        }
    }
}

