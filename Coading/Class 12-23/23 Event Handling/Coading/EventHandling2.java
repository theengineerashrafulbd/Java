//23.2: Event Handling (Button)

import java.awt.*;
import java.awt.event.*;

class EventHandling2 extends Frame implements ActionListener
{
    TextField textField;
    Button button;

    EventHandling2 ()
    {
        textField = new TextField ();
        textField.setBounds (60, 50, 170, 20);

        button = new Button ("Show");
        button.setBounds (90, 140, 75, 40);

        button.addActionListener (this);

        add (button);
        add (textField);

        setSize (250, 250);
        setLayout (null);
        setVisible (true);
    }

    public void actionPerformed (ActionEvent e)
    {
        if (button.getLabel().equals("Show"))
        {
            textField.setText ("Hello World");
            button.setLabel ("Hide");
        }
        else
        {
            textField.setText ("");
            button.setLabel ("Show");
        }
    }

    public static void main (String args[])
    {
        new EventHandling2 ();
    }
}