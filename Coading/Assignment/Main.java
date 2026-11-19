package Assignment;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int lives = 3;
        int points = 0;
        int level = 1;

        System.out.println("================================");
        System.out.println("     LUCKY NUMBER GAME");
        System.out.println("================================");
        System.out.println("Starting Lives : " + lives);
        System.out.println("Starting Points: " + points);

        // Game continues while lives are greater than zero
        while (lives > 0) {

            // Hidden outcomes for the five choices
            String[] options = {
                "Life +1",
                "Life -1",
                "Nothing",
                "Nothing",
                "Nothing"
            };

            // Shuffle the hidden outcomes
            for (int i = options.length - 1; i > 0; i--) {
                int j = random.nextInt(i + 1);

                String temp = options[i];
                options[i] = options[j];
                options[j] = temp;
            }

            System.out.println("\n---------- Level " + level + " ----------");
            System.out.println("Lives : " + lives);
            System.out.println("Points: " + points);

            System.out.println("Choose a number from 1 to 5:");

            for (int i = 1; i <= 5; i++) {
                System.out.print(i + " ");
            }

            System.out.println();

            int choice;

            // Validate user input
            while (true) {
                System.out.print("Your choice: ");

                if (sc.hasNextInt()) {
                    choice = sc.nextInt();

                    if (choice >= 1 && choice <= 5) {
                        break;
                    }
                } else {
                    sc.next();
                }

                System.out.println(
                    "Invalid choice! Enter a number from 1 to 5."
                );
            }

            // Reveal the selected hidden outcome
            String result = options[choice - 1];

            System.out.println("You got: " + result);

            if (result.equals("Life +1")) {
                lives++;
            } else if (result.equals("Life -1")) {
                lives--;
            }

            // Award a point if the player survives the level
            if (lives > 0) {
                points++;
                System.out.println("Level completed!");
            }

            System.out.println("Lives left : " + lives);
            System.out.println("Total points: " + points);

            level++;
        }

        System.out.println("\n================================");
        System.out.println("          GAME OVER");
        System.out.println("================================");
        System.out.println("Final Points: " + points);
        System.out.println("Thank you for playing!");

        sc.close();
    }
}
