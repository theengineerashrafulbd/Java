//19.3: Arithmetic Exception 

public class AriExcep {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int ans = a / b;
            System.out.println("Answer = " + ans);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
