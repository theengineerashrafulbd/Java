// 19 Strings Contains Method
//contains() হলো Java String-এর একটি Method, যা কোনো String-এর মধ্যে নির্দিষ্ট Character Sequence বা শব্দ আছে কি না তা পরীক্ষা করে।

public class Contains2 {
    public static void main(String[] args) {

        String s = "I Love Java Programming";

        // নির্দিষ্ট শব্দ আছে কি না পরীক্ষা
        System.out.println(s.contains("Java"));

        // নির্দিষ্ট শব্দ নেই কি না পরীক্ষা
        System.out.println(s.contains("Python"));

        // Case-Sensitive পরীক্ষা
        System.out.println(s.contains("java"));
    }
}