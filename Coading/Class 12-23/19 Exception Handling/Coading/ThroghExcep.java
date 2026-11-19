//19.2: Throw Error (Arithmetic Exception) ধরে এবং কি ধরনের, কোথায় error টা সেটা বলে দেয় 

public class ThroghExcep {
    static void checkAge(int Age){
        if(Age<18){
            throw new ArithmeticException("Access Denied");
        }

        else{
            System.out.println("Access Granted.");
        }
    }
    public static void main(String[] args) {
        checkAge(15);
    }
}
