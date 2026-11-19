// 20 Strings EndsWith Method
//endsWith() হলো Java String-এর একটি Method, যা কোনো String নির্দিষ্ট শব্দ বা Character Sequence দিয়ে শেষ হয়েছে কি না তা পরীক্ষা করে।

public class End{
    public static void main(String[] args) {

        String s = "Welcome to Java";

        // Java দিয়ে শেষ হয়েছে কি না
        System.out.println(s.endsWith("Java"));

        // Python দিয়ে শেষ হয়েছে কি না
        System.out.println(s.endsWith("Python"));

        // ছোট হাতের java দিয়ে শেষ হয়েছে কি না
        System.out.println(s.endsWith("java"));
    }
}