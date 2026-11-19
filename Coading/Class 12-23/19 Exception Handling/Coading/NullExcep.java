//19.4: Null Pointer Exception


public class NullExcep {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.charAt(0));
        }
        catch (NullPointerException e) {
            System.out.println("No String object is initialized.");
        }
    }
}
