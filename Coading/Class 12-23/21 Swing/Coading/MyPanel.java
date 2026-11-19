//21.8: Java Swing = JPanel

import javax.swing.*; // Import Swing package for JFrame, JPanel and JButton
import java.awt.*; // Import AWT package for Color

public class MyPanel {
    public static void main(String[] args) {

        // Create a JFrame window with title "JPanel Example"
        JFrame f = new JFrame("JPanel Example");

        // Create a JPanel container
        JPanel p = new JPanel();

        // Set panel position (x=50, y=50) and size (width=280, height=150)
        p.setBounds(50, 50, 280, 150);

        // Set panel background color to CYAN
        p.setBackground(Color.CYAN);

        // Create a JButton with text "Click Me"
        JButton b = new JButton("Click Me");

        // Add the button to the JPanel
        p.add(b);

        // Add the JPanel to the JFrame
        f.add(p);

        // Set JFrame width to 400 and height to 300
        f.setSize(400, 300);

        // Disable the default layout manager
        f.setLayout(null);

        // Close the application when the window is closed
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display the window at the center of the screen
        f.setLocationRelativeTo(null);

        // Make the JFrame visible
        f.setVisible(true);
    }
}