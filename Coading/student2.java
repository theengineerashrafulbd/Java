import java.util.Scanner;

class Student2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id;
        String name;

        id = sc.nextInt();
        sc.nextLine(); // ID, Name কে new Line এ আনার জন্য
        name = sc.nextLine();

        System.out.println(id);
        System.out.println(name);

        sc.close();
    }
}



            /* বিকল্প 

import java.util.Scanner;

class Student2 {

      int id;
      String name;

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        Student s = new Student();   // Student er jonno class
        s.id = sc1.nextInt();
        sc.nextLine(); // ID, Name কে new Line এ আনার জন্য
        s.name = sc2.nextLine();

        System.out.println(s.id);
        System.out.println(s.name);

        sc.close();
   }
}     */

