package Assignment;

import java.util.Scanner;

public class Num4 {

    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);

        System.out.print("Enter the width or rows: ");
        int width = a.nextInt();

        System.out.print("Enter the length or number of elements per row: ");
        int length = a.nextInt();

        for(int i = 1; i<=width; i++)
        {
            for(int j = 1; j<=length; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        a.close();
    }
}
