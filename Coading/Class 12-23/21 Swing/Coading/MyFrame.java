
// 21.5: Java Swing = JFrame

import javax.swing.*;  // Import all Swing classes

public class MyFrame {
    public static void main(String[] args) {

        // Create a JFrame object with title
        JFrame f = new JFrame("My First Frame");

        // Set the frame width to 400 and height to 300 pixels
        f.setSize(400, 300);

        // Close the application when the frame is closed
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display the frame at the center of the screen
        f.setLocationRelativeTo(null);

        // Make the frame visible on the screen
        f.setVisible(true);
    }
}
