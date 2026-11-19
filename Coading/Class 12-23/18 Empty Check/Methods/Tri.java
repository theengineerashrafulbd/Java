// 23 Strings Trim Method
//trim() হলো Java String-এর একটি Method, যা কোনো String-এর শুরুতে এবং শেষে থাকা অতিরিক্ত Space (Whitespace) সরিয়ে দেয়।

public class Tri {
    public static void main(String[] args) {

        String s = "   Hello Java   ";

        // Original String
        System.out.println("Before Trim: " + s);

        // Starting এবং Ending Space সরানো
        System.out.println("After Trim: " + s.trim());

        // Original String অপরিবর্তিত
        System.out.println("Original String: " + s);
    }
}