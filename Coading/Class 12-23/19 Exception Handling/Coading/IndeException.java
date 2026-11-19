// 19.1: Exception Handling.Coading;

public class IndeException {
    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3, 4, 5 };
            System.out.println(numbers[10]);
        } 
        
        catch (Exception e) {
            System.out.println("Something Went Wrong");
        }

        //try and catch block finished here but its not related with try and catch block
        finally{
            System.out.println("Try and Catch block finished here");
        }
    }
}
