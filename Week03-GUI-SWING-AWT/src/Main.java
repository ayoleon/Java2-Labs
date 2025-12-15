import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.text.DecimalFormat;

import java.util.ArrayList;

interface Player{
    void salary();
}

public class Main {

    public static void main(String[] args) {
PlayerSalary p1 = new PlayerSalary();
p1.salary();
PlayerTitle pl1 = new PlayerTitle();

    }

}

class PlayerSalary implements Player{
    double[] weekSal = new double[4];
    DecimalFormat df = new DecimalFormat("0.00");
public void salary(){
    double total = 0;
for (int i = 0; i < weekSal.length; i++){
    //JOption pane uses string data type
    String input = JOptionPane.showInputDialog("Enter Salary for week " + (i + 1) +":");
    weekSal[i] = Double.parseDouble(input); //PARSING STRING TO DOUBLE
    total += weekSal[i];

}
JOptionPane.showMessageDialog(null, "Average weekly salary: $" + df.format(total / weekSal.length));
}
}

class PlayerTitle extends JFrame{

    PlayerTitle() {
        // JFrame frame1 = new JFrame("Player Info"); // NOT NEEDED BECAUSE EXTENDS JFRAME
        super("Player Info");
        setSize(400, 250);
        setLocationRelativeTo(null); //CENTERS ON SCREEN

        //frame1.setLayout(new FlowLayout());

        //DIFFFERENT LAYOUT USED,
        setLayout(new GridLayout(7, 2, 0, 5)); // 7 rows, 2 cols, spacing 5px

        JLabel firstname = new JLabel("Enter first name", JLabel.CENTER); //CREATES LABEL with TITLE, CENTERED
        JTextField txtfirst = new JTextField(30); //textfield object 25 characters long for user input

        JLabel lastname = new JLabel("Enter last name", JLabel.CENTER);
        JTextField txtlast = new JTextField(30);

        JLabel position = new JLabel("Enter position", JLabel.CENTER); //CREATES LABEL with TITLE, LEFT
        JTextField txtposition = new JTextField(30);

        //output textfields
        JTextField txtfirstOut = new JTextField(30);
        JTextField txtlastOut = new JTextField(30);
        JTextField txtpositionOut = new JTextField(30);

        JButton btnName = new JButton("ENTER");
        add(firstname);
        add(txtfirst);
        add(lastname);
        add(txtlast);
        add(position);
        add(txtposition);

        add(new JLabel(" ")); //EMPTY FEILD NEXT TO BUTTON in GRID LAYOUT
        add(btnName);

        //frame1.add(new JLabel("FIRST NAME:")); //frame1.NOT NEEDED BECAUSE CLASS EXTENDS JFRAME,frame1 not declared
        add(new JLabel("FIRST NAME:", JLabel.CENTER));
        add(txtfirstOut);
        add(new JLabel("LAST NAME:", JLabel.CENTER));
        add(txtlastOut);
        add(new JLabel("POSITION:", JLabel.CENTER));
        add(txtpositionOut);

        // Make output fields read-only
        txtfirstOut.setEditable(false);
        txtlastOut.setEditable(false);
        txtpositionOut.setEditable(false);

        btnName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtfirstOut.setText(txtfirst.getText());
                txtlastOut.setText(txtlast.getText());
                txtpositionOut.setText(txtposition.getText());
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //CLOSES THE WINDOW
        setVisible(true);  //MAKES WINDOW VISIBLE

    }
}

