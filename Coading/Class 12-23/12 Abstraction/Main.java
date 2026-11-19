// Abstract Class
abstract class Car {

    // Abstract Method
    public abstract void stop();

    // Non Abstract Method
    public void display() {
        System.out.println("Something...");
    }
}

// Concrete Class
class Toyota extends Car {

    // Implementing Abstract Method
    public void stop() {
        System.out.println("Toyota : Stop");
    }
}

public class Main {
    public static void main(String[] args) {

        Car c = new Toyota();

        c.stop();    // stop method call করা হয়েছে
        c.display(); // display method call করা হয়েছে
    }
}