   //class-07: Constructor

public class MainC {
    int x;
    MainC (int x){
        this.x = x;
    }

    public static void main(String[] args) {
        
        MainC m = new MainC(5);
        System.out.println(m.x);

    }
}
