//Write a Java program to print odd numbers in an increasing order within each row, while the number of elements decreases by 2 in each subsequent row, starting from the ending range and continuing up to the initial range.

import java.util.Scanner;

public class Code1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Enter the number of initial range: ");
        int initial = a.nextInt();

        System.out.print("Enter the number of ending range: ");
        int ending = a.nextInt();

        for (int i = ending; i >= initial; i = i - 2) {
            for (int j = 1; j <= i; j = j + 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        a.close();
    }
}





