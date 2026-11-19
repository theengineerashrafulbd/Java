// 21.6: Java Swing = JButton

import javax.swing.*;  // Import Swing classes
import java.awt.event.*;  // Import event handling classes

public class MyButton {
    public static void main(String[] args) {

        // Create a JFrame
        JFrame f = new JFrame("JButton Example");

        // Create a JButton with text
        JButton b = new JButton("Click Me");

        // Set button position and size
        // x = 120, y = 100, width = 120, height = 40
        b.setBounds(120, 100, 120, 40);

        // Add ActionListener to handle button click event
        b.addActionListener(new ActionListener() {

            // This method executes when the button is clicked
            public void actionPerformed(ActionEvent e) {

                // Display a message dialog box
                JOptionPane.showMessageDialog(f, "Button Clicked!");
            }
        });

        // Add button to JFrame
        f.add(b);

        // Set frame size
        f.setSize(400, 300);

        // Set null layout for manual positioning
        f.setLayout(null);

        // Close the application when the frame is closed
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display frame at the center of the screen
        f.setLocationRelativeTo(null);

        // Make frame visible
        f.setVisible(true);
    }
}
