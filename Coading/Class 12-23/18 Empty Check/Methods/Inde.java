// 21 Strings IndexOf Method
//indexOf() হলো Java String-এর একটি Method, যা কোনো String-এর মধ্যে নির্দিষ্ট Character বা শব্দের প্রথম অবস্থান (Index Number) খুঁজে বের করে।

public class Inde {
    public static void main(String[] args) {

        String s = "Programming";

        // নির্দিষ্ট Character-এর Index বের করা
        System.out.println(s.indexOf('g'));

        // নির্দিষ্ট শব্দের Index বের করা
        System.out.println(s.indexOf("gram"));

        // Character না থাকলে
        System.out.println(s.indexOf('z'));
    }
}