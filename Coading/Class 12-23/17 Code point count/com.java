//17 Strings: Strings এর value compare করা 
//equals বুলিয়ান value return করে but compareTo return করে Function এর int value.

public class com {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "javaa";

        //case sensitive compare method
        /*  System.out.println(s1.compareTo(s2));  */

        //without case sensitive method
        System.out.println(s1.compareToIgnoreCase(s2));

        //Equals: value সমান হলে true otherwise False
        /*  System.out.println(s1.equals(s2)); */
        /*  System.out.println(s1.equalsIgnoreCase(s2));   */
    }
}
