  //Encaptulation: Data hiding but সে পাবে যারে amra Access দেবো 
class Car {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Encap {
    public static void main(String[] args) {
        Car c = new Car();
        c.setName("Toyota");

        //String name = c.getName();
        //System.out.println(name);

        System.out.println(c.getName());
    }
}