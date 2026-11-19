// 21.2: Java Swing = Registration Form

import javax.swing.*;     // Import Swing classes
import java.awt.event.*;  // Import event handling classes

// Extend JFrame and implement ActionListener
public class RegistrationForm extends JFrame implements ActionListener {

    // Declare GUI components
    JLabel l1, l2, l3;
    JTextField t1, t2;
    JRadioButton r1, r2;
    JButton b1;
    ButtonGroup bg;

    // Constructor
    RegistrationForm() {

        // Set frame title
        setTitle("Registration Form");

        // Set frame size
        setSize(400, 350);

        // Set null layout for manual positioning
        setLayout(null);

        // Create Name Label
        l1 = new JLabel("Name:");
        l1.setBounds(40, 40, 100, 30);
        add(l1);

        // Create Name TextField
        t1 = new JTextField();
        t1.setBounds(150, 40, 180, 30);
        add(t1);

        // Create Email Label
        l2 = new JLabel("Email:");
        l2.setBounds(40, 90, 100, 30);
        add(l2);

        // Create Email TextField
        t2 = new JTextField();
        t2.setBounds(150, 90, 180, 30);
        add(t2);

        // Create Gender Label
        l3 = new JLabel("Gender:");
        l3.setBounds(40, 140, 100, 30);
        add(l3);

        // Create Male RadioButton
        r1 = new JRadioButton("Male");
        r1.setBounds(150, 140, 70, 30);
        add(r1);

        // Create Female RadioButton
        r2 = new JRadioButton("Female");
        r2.setBounds(230, 140, 90, 30);
        add(r2);

        // Create ButtonGroup
        bg = new ButtonGroup();

        // Add RadioButtons to ButtonGroup
        bg.add(r1);
        bg.add(r2);

        // Create Register Button
        b1 = new JButton("Register");
        b1.setBounds(130, 210, 120, 35);

        // Add ActionListener to Register Button
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

        // Get Name from TextField
        String name = t1.getText();

        // Get Email from TextField
        String email = t2.getText();

        // Get selected Gender
        String gender = r1.isSelected() ? "Male" : "Female";

        // Display registration information
        JOptionPane.showMessageDialog(this,
            "Registration Successful!\nName: " + name +
            "\nEmail: " + email +
            "\nGender: " + gender);
    }

    // Main method
    public static void main(String[] args) {

        // Create RegistrationForm object
        new RegistrationForm();
    }
}
