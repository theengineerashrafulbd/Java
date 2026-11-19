public class ReplaceCase {
    public static void main(String[] args) {
        String s = "hello";

        System.out.println(s.replace('l', 'p'));
 
        System.out.println(s.toUpperCase());

        // সব Letter Lowercase
        System.out.println(s.toLowerCase());

        // মাঝখানের ২টি Letter Uppercase
        String result = s.substring(0, 1)
                + s.substring(1, 3).toUpperCase()
                + s.substring(3);

        System.out.println(result);
    }
}
