package Assignment;

public class Car {

    String name;
    String color;
    int year;
    int top_speed;
    String body_type;
    String features;
    int mileage;

    public Car(int mileage) {
        this.mileage = mileage;
    }

    public Car(String features) {
        this.features = features;
    }

    public Car(int top_speed, String body_type) {
        this.top_speed = top_speed;
        this.body_type = body_type;
    }

    public Car(String name, String color, int year) {
        this.name = name;
        this.color = color;
        this.year = year;
    }

    public static void main(String[] args) {

        Car axio = new Car(35);
        Car premio = new Car("Hybrid");
        Car corolla = new Car(400, "Sedan");
        Car harrier = new Car("Toyota Harrier", "black", 2025);

        System.out.println("Axio");
        System.out.println("Mileage: " + axio.mileage);
        System.out.println();

        System.out.println("Premio");
        System.out.println("Features: " + premio.features);
        System.out.println();

        System.out.println("Corolla");
        System.out.println("Top Speed: " + corolla.top_speed);
        System.out.println("Body Type: " + corolla.body_type);
        System.out.println();

        System.out.println("Harrier");
        System.out.println("Name: " + harrier.name);
        System.out.println("Color: " + harrier.color);
        System.out.println("Year: " + harrier.year);
    }
}