package cwork7;

public class EngineDemo {

    public static void main(String[] args) {
        Engine eng = new Engine("V8", 450);
        Car car = new Car("Mustang", eng);
        car.display();
    }
}
