      // Class: 12 = Encapsulation

class Car {
    private String name;

    // Setter method: name-এর value assign করবে
    public void setName(String name) {
        this.name = name;
    }

    // Getter method: name-এর value return করবে
    public String getName() {
        return name;
    }
}

public class MainE {
    public static void main(String[] args) {

        // Car class-এর object তৈরি
        Car c = new Car();

        // Setter method দিয়ে value পাঠানো
        c.setName("Toyota");

        // Getter method দিয়ে value নিয়ে print করা
        System.out.println(c.getName());
    }
}