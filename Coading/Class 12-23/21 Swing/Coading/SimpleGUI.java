// 21.4: Simple Java Swing GUI

import javax.swing.*;     // Import Swing classes
import java.awt.event.*;  // Import event handling classes

// Extend JFrame and implement ActionListener
public class SimpleGUI extends JFrame implements ActionListener {

    // Declare GUI components
    JLabel l1, l2;
    JTextField t1;
    JButton b1;

    // Constructor
    SimpleGUI() {

        // Set frame title
        setTitle("Simple GUI");

        // Set frame size
        setSize(400, 250);

        // Set null layout for manual positioning
        setLayout(null);

        // Create Name Label
        l1 = new JLabel("Enter Your Name:");
        l1.setBounds(50, 50, 150, 30);
        add(l1);

        // Create TextField for name input
        t1 = new JTextField();
        t1.setBounds(180, 50, 150, 30);
        add(t1);

        // Create Button
        b1 = new JButton("Click Me");
        b1.setBounds(130, 110, 120, 35);

        // Add ActionListener to Button
        b1.addActionListener(this);
        add(b1);

        // Create empty Label for displaying output
        l2 = new JLabel("");
        l2.setBounds(100, 160, 250, 30);
        add(l2);

        // Close application when frame is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display frame at screen center
        setLocationRelativeTo(null);

        // Make frame visible
        setVisible(true);
    }

    // Handle button click event
    public void actionPerformed(ActionEvent e) {

        // Get name from TextField
        String name = t1.getText();

        // Display welcome message in Label
        l2.setText("Welcome, " + name);
    }

    // Main method
    public static void main(String[] args) {

        // Create SimpleGUI object
        new SimpleGUI();
    }
}
