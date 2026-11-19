// Interface
interface Vehicle {

    // Abstract Method
    void start();

    void stop();
}

// Abstract Class
abstract class Car implements Vehicle {

    // Non Abstract Method
    public void display() {
        System.out.println("This is a Car");
    }
}

// Concrete Class
class Toyota extends Car {

    // Implementing start() method
    public void start() {
        System.out.println("Toyota :: Start");
    }

    // Implementing stop() method
    public void stop() {
        System.out.println("Toyota :: Stop");
    }
}

// Main Class
public class Main2 {

    public static void main(String[] args) {

        // Creating Object
        Toyota t = new Toyota();

        // Calling Methods
        t.start();
        t.stop();
        t.display();
    }
}