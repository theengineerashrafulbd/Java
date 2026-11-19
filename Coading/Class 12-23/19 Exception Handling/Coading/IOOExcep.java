//19.6: String Index Out of Bounds Exception 

public class IOOExcep {
    public static void main(String[] args) {
        try {
            String s = "We love Bangladesh.";
            System.out.println(s.charAt(25));
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("String Index Out Of Bounds Exception");
        }
    }
}