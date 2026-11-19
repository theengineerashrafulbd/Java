public class CharValue {
    public static void main(String[] args) {
        String s = "Computer";

        /*  ////codePointAt() method
            int univalue = s.codePointAt(0);
            System.out.println("C" + " = " + univalue);
            System.out.println("u" + " = " + s.codePointAt(4));     */


        // codePointBefore() method
        int univalue = s.codePointBefore(1);
        System.out.println("C" + " = " + univalue);
        System.out.println("u" + " = " + s.codePointBefore(5));
    }
}
