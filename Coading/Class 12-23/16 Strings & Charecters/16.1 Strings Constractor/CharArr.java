//String constructor to Character Arry 
//Character Array থেকে String তৈরি
public class CharArr {
    public static void main(String[] args) {

        // String Constructor: Character Array

        char[] char_array = {'X', 'X', 'J', 'a', 'v', 'a', 'X'};

        // Starting Index = 2, Count = 4
        String s1 = new String(char_array, 2, 4);

        System.out.println(s1);
    }
}
