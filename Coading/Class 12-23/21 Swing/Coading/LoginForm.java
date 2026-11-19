// 21.1: Java Swing = Login Form

import javax.swing.*;  // Import Swing classes
import java.awt.*;     // Import AWT classes
import java.awt.event.*; // Import event handling classes

// Extend JFrame and implement ActionListener
public class LoginForm extends JFrame implements ActionListener {

    // Declare GUI components
    JLabel l1, l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1;

    // Constructor
    LoginForm() {

        // Set frame title
        setTitle("Login Form");

        // Set frame size
        setSize(350, 250);

        // Set null layout for manual positioning
        setLayout(null);

        // Create Username Label
        l1 = new JLabel("Username:");
        l1.setBounds(40, 40, 100, 30);
        add(l1);

        // Create Username TextField
        t1 = new JTextField();
        t1.setBounds(140, 40, 150, 30);
        add(t1);

        // Create Password Label
        l2 = new JLabel("Password:");
        l2.setBounds(40, 90, 100, 30);
        add(l2);

        // Create Password Field
        t2 = new JPasswordField();
        t2.setBounds(140, 90, 150, 30);
        add(t2);

        // Create Login Button
        b1 = new JButton("Login");
        b1.setBounds(110, 150, 100, 30);

        // Add ActionListener to Login Button
        b1.addActionListener(this);
        add(b1);

        // Close application when frame is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display frame at screen center
        setLocationRelativeTo(null);

        // Make frame visible
        setVisible(true);
    }

    // Handle button click event
    public void actionPerformed(ActionEvent e) {

        // Get username from TextField
        String username = t1.getText();

        // Get password from PasswordField
        String password = new String(t2.getPassword());

        // Check username and password
        if (username.equals("admin") &&
            password.equals("1234")) {

            // Show successful login message
            JOptionPane.showMessageDialog(this, "Login Successful!");

        } else {

            // Show invalid login message
            JOptionPane.showMessageDialog(this, "Invalid Login!");
        }
    }

    // Main method
    public static void main(String[] args) {

        // Create LoginForm object
        new LoginForm();
    }
}
