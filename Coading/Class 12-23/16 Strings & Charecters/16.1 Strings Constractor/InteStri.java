//String Constructor – Unicode Code Points
//Integer Array থেকে String তৈরি
public class InteStri {
    public static void main(String[] args) {

        // String Constructor: Unicode Code Points

        int[] uni_code_points = {
            72, 101, 108, 108, 111, 32, 74, 97, 118, 97
        };

        // Offset = 6, Count = 4
        String s1 = new String(uni_code_points, 6, 4);

        System.out.println(s1);
    }
}
