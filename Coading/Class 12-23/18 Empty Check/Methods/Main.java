// 22 Strings Substring Method
//substring() হলো Java String-এর একটি Method, যা কোনো String-এর নির্দিষ্ট অবস্থান থেকে নির্দিষ্ট অংশ বের করে নতুন String তৈরি করে।

public class Main {
    public static void main(String[] args) {

        String s = "Programming";

        // Index 0 থেকে Index 3-এর আগ পর্যন্ত
        System.out.println(s.substring(0, 3));

        // Index 3 থেকে Index 7-এর আগ পর্যন্ত
        System.out.println(s.substring(3, 7));

        // Index 7 থেকে শেষ পর্যন্ত
        System.out.println(s.substring(7));
    }
}