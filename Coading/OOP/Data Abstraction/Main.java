    // Class: 12 = Data Abstraction

abstract class Car{        // abstract class, stop method using
    abstract void stop();
}

class Toyota extends Car{        // stop method এর body, Toyota class, Toyota Car কে extends করেছে
    void stop(){
        System.out.println("Toyota : stop");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Toyota();    // car class এর object 
        c.stop();
    }
}

