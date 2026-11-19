//String Constructor – Byte Array
//Byte Array থেকে String তৈরি

import java.nio.charset.StandardCharsets;
import java.io.UnsupportedEncodingException;

public class BytArr {
    public static void main(String[] args) throws UnsupportedEncodingException {

        // 16 Strings & Characters
        // String Constructor: Byte Array

        byte[] byte_arr = "Java, Python".getBytes(StandardCharsets.UTF_8);


        // 1. Byte Array with Charset
        String s1 = new String(byte_arr, StandardCharsets.UTF_8);
        System.out.println("Charset: " + s1);


        // 2. Byte Array with String Charset Name
        String s2 = new String(byte_arr, "UTF-8");
        System.out.println("Charset Name: " + s2);


        // 3. Byte Array with Start Index and Length
        String s3 = new String(byte_arr, 3, 6);
        System.out.println("Start Index & Length: " + s3);


        // 4. Byte Array with Start Index, Length and Charset
        String s4 = new String(byte_arr, 3, 6, StandardCharsets.UTF_8);
        System.out.println("Charset with Index: " + s4);


        // 5. Byte Array with Start Index, Length and Charset Name
        String s5 = new String(byte_arr, 4, 5, "UTF-8");
        System.out.println("Charset Name with Index: " + s5);


        // 6. Changing Length
        String s6 = new String(byte_arr, 3, 7, StandardCharsets.UTF_8);
        System.out.println("Length 7: " + s6);

    }
}
