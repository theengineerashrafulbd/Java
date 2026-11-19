
// 21.3: Java Swing = Student Information System

import javax.swing.*;                 // Import Swing classes
import javax.swing.table.DefaultTableModel; // Import table model
import java.awt.event.*;              // Import event handling classes

// Extend JFrame and implement ActionListener
public class StudentInfo extends JFrame implements ActionListener {

    // Declare GUI components
    JLabel l1, l2;
    JTextField t1, t2;
    JButton b1, b2;
    JTable table;
    DefaultTableModel model;

    // Constructor
    StudentInfo() {

        // Set frame title
        setTitle("Student Information System");

        // Set frame size
        setSize(600, 400);

        // Set null layout for manual positioning
        setLayout(null);

        // Create Student Name Label
        l1 = new JLabel("Student Name:");
        l1.setBounds(30, 30, 120, 30);
        add(l1);

        // Create Student Name TextField
        t1 = new JTextField();
        t1.setBounds(150, 30, 150, 30);
        add(t1);

        // Create Student ID Label
        l2 = new JLabel("Student ID:");
        l2.setBounds(30, 80, 120, 30);
        add(l2);

        // Create Student ID TextField
        t2 = new JTextField();
        t2.setBounds(150, 80, 150, 30);
        add(t2);

        // Create Add Button
        b1 = new JButton("Add");
        b1.setBounds(350, 30, 100, 30);
        b1.addActionListener(this);
        add(b1);

        // Create Delete Button
        b2 = new JButton("Delete");
        b2.setBounds(350, 80, 100, 30);
        b2.addActionListener(this);
        add(b2);

        // Create DefaultTableModel
        model = new DefaultTableModel();

        // Add table columns
        model.addColumn("Name");
        model.addColumn("Student ID");

        // Create JTable using the model
        table = new JTable(model);

        // Add JTable inside JScrollPane
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(30, 140, 520, 180);
        add(sp);

        // Close application when frame is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display frame at screen center
        setLocationRelativeTo(null);

        // Make frame visible
        setVisible(true);
    }

    // Handle button click events
    public void actionPerformed(ActionEvent e) {

        // Check if Add Button is clicked
        if (e.getSource() == b1) {

            // Get Student Name
            String name = t1.getText();

            // Get Student ID
            String id = t2.getText();

            // Check whether fields are empty
            if (name.isEmpty() || id.isEmpty()) {

                // Show warning message
                JOptionPane.showMessageDialog(this,
                    "Please fill all fields!");

            } else {

                // Add student information to table
                model.addRow(new Object[]{name, id});

                // Clear Name TextField
                t1.setText("");

                // Clear ID TextField
                t2.setText("");
            }
        }

        // Check if Delete Button is clicked
        if (e.getSource() == b2) {

            // Get selected row index
            int row = table.getSelectedRow();

            // Check whether a row is selected
            if (row >= 0) {

                // Remove selected row from table
                model.removeRow(row);

            } else {

                // Show warning message
                JOptionPane.showMessageDialog(this,
                    "Select a student first!");
            }
        }
    }

    // Main method
    public static void main(String[] args) {

        // Create StudentInfo object
        new StudentInfo();
    }
}
