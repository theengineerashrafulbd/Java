// 16 Strings এর Diffrent Constractor
// String এর Value changeable না হলেও String Buffer এর Value Changeable.

public class StriBuff {
    public static void main(String[] args) {
        /*  StringBuffer sb = new StringBuffer("Java");
            String s = new String(sb);
            System.out.println(s);   */

        StringBuilder sbd = new StringBuilder("Python");
        String s = new String(sbd);
        System.out.println(s);
    }
}
