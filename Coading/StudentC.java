
class StudentC {
    int id;
    String name;

    StudentC(int i, String n) {
        id = i;
        name = n;
    }

    public static void main(String[] args) {
        StudentC s = new StudentC(101, "Ashraful");

        System.out.println(s.id);
        System.out.println(s.name);
    }
}
