public class Calc {
    public void add (int x, int y){
        int z = x+y;
        System.out.println("Sum:" + z);
    }
    public static void main(String[] args) {
        Calc c = new Calc();
        c.add(2,3);
    }
}
