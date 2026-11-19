//19.5: Null Pointer Exception

public class NullExcep2 {
    public static void main(String[] args) {
        String s = null;

        try {
            if (s == null) {
                throw new NullPointerException();
            }
            System.out.println(s.charAt(0));
        }
        catch (NullPointerException e) {
            System.out.println("No String object is initialized.");
        }
    }
}