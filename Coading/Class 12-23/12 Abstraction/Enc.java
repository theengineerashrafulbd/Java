class MyCar {

    private String name;

    // Setter Method
    public void setName(String name) {
        this.name = name;
    }

    // Getter Method
    public String getName() {
        return name;
    }
}

// Main class
public class Enc {

    public static void main(String[] args) {

        // Creating Object
        MyCar c = new MyCar();

        // Setting value
        c.setName("Toyota");

        // Printing value
        System.out.println(c.getName());
    }
}