//19.7: String Index Out of Bounds Exception

public class IOOExcep2 {
    public static void main(String[] args) {
        String s = "We Love Bangladesh";

        try {
            System.out.println(s.charAt(20));
        }

        catch(StringIndexOutOfBoundsException e) {
            System.out.println("Index Out of Bounds Exception Error");
        }
    }
}