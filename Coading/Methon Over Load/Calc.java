public class Calc{
    public int add ( int x, int y){
        return x+y;
    }

    public int add(int x, int y, int z){
        return x+y+z;
    }

    public double add(double x, double y){
        return x+y;
    }

    public static void main(String[] args) {
        
        Calc c = new Calc();

        int sum1 = c.add(2, 3);
        int sum2 = c.add(2, 3, 5);

        double sum = c.add(2.5, 5.4);

        System.out.println(sum1);
        System.out.println(sum2);

        System.out.println(sum);

    }
}

