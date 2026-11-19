package Assignment;

import java.util.Scanner;

public class Num5 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.print("Enter the number of initial number: ");
        int initial = a.nextInt();

        System.out.print("Enter the number of ending number: ");
        int ending = a.nextInt();

        for(int i = initial; i<=ending; i++)
        {
            if(i == ending)
            {
                System.out.print(i);
                break;
            }
            System.out.print(i + " ");
        }
        a.close();
    }
}

