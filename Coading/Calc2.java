public class Calc2 {
    public int add (int x, int y){
        int z = x+y;
        return z;
    }

    public static void main(String[] args) {
        Calc2 c = new Calc2();
        int sum = c.add(2,3);
        System.out.println(sum);
    }
}
