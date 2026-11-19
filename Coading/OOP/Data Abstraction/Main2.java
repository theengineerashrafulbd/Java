abstract class Vehicle {
    abstract void start();
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike Started");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car Started");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();

        v = new Car();
        v.start();
    }
}