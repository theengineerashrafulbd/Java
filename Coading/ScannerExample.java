import java.util.Scanner;               // scanner er class

public class ScannerExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);      // user input

        String name;
        name = sc.nextLine();                   // scanner method

        System.out.println(name);

        sc.close();
    }
}
