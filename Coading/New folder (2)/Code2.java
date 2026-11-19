import java.util.Scanner;

public class Code2 {

    public static void main(String[] args) {

        Scanner b = new Scanner(System.in);

        System.out.print("Enter the number of initial range: ");
        int initial = b.nextInt();

        System.out.print("Enter the number of ending range: ");
        int ending = b.nextInt();

        for(int i = ending; i>=initial; i=i-2)
        {
            for(int j=i; j>=1; j=j-2)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        b.close();
    }
}
