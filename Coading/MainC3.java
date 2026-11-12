       // Class: 08.....Parameter Constructor
public class MainC3 {
    String pLan;
    int year;

    public MainC3(String pLan, int year){    // Constructor 
        this.pLan = pLan;
        this.year = year;
    }

    public static void main(String[] args) {
        MainC3 m = new MainC3("Java", 1995);
        System.out.println(m.pLan);
        System.out.println(m.year);
    }
}

