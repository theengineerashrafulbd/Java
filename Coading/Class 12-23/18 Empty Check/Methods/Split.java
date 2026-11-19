// 24 Strings Split Method
//split() হলো Java String-এর একটি Method, যা নির্দিষ্ট Delimiter বা Separator অনুযায়ী একটি String-কে একাধিক অংশে ভাগ করে Array তৈরি করে।

public class Split {
    public static void main(String[] args) {

        String s = "Java,Python,C++";

        // Comma অনুযায়ী String ভাগ করা
        String[] arr = s.split(",");

        // Array-এর প্রতিটি Element Print করা
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }
    }
}