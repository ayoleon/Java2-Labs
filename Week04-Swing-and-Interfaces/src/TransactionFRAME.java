import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class TransactionFRAME extends JFrame implements Checkout, MouseListener {
    //creating variables at CLASS LEVEL(NOT IN CONSTRUCTOR) SO I CAN ACCESS/modify TEXTFIELDS in methods...
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();

    //
    JLabel id = new JLabel("Membership ID#");
    JLabel lastN = new JLabel("Last Name");
    JLabel firstN = new JLabel("First Name");
    JLabel phone = new JLabel("Phone Number");
    JLabel age = new JLabel("Age");
    JLabel movie = new JLabel("Choosen Movie");

    JTextField idtext = new JTextField(10);
    JTextField lastNtext = new JTextField(25);
    JTextField firstNtext = new JTextField(25);
    JTextField phonetext = new JTextField(15);
    JTextField agetext = new JTextField(3);
    JTextField movietext = new JTextField(50);

    JTextField idOUT = new JTextField(10);
    JTextField nameOUT = new JTextField(50);
    JTextField ageOUT = new JTextField(10);
    JTextField phoneOUT = new JTextField(15);
    JTextField moviesOUT = new JTextField();

    //SECOND PANEL
    JLabel totalmovies = new JLabel("Total Videos");
    JTextField totalmoviesOUT = new JTextField(3);

    JLabel subtotalDisplay = new JLabel("SUBTOTAL:");
    JTextField subtotaltxt = new JTextField(8);
    JLabel latefeeDisplay = new JLabel("LATE FEE:");
    JTextField latefeetxt = new JTextField(6);
    JLabel totalDisplay = new JLabel("TOTAL:");
    JTextField totaltext = new JTextField(8);
    //JTextField latefeeOUT = new JTextField(6);
    JTextField cardfeetxt = new JTextField(6);

    JButton btnrent = new JButton("CLICK TO CALCULATE RENT");
    JButton btnbuy = new JButton("Click to CALCULATE PURCHASE");
    JButton btncard = new JButton("CLICK to pay with CARD");
    JButton btncash = new JButton("CLICK to pay with CASH");

    //FOR LATE FEE
    Boolean late = true;
    //Boolean late = true;

//CONSTRUCTOR
    TransactionFRAME(){
        //BUILD FRAME
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //MAKES PROGRAM CLOSE OUT WHEN PRESSING X
        setSize(600,800);


        //SET SIZE TO PANELS
        p1.setPreferredSize(new Dimension(300,600));
        p2.setPreferredSize(new Dimension(300,600));
        //SET COLOR TO PANELS, LAYOUT TO PANEL1
        p1.setBackground(Color.lightGray);
        p1.setLayout(new GridLayout(0,1)); //UNLIMETED ROWS, 1 column (Vertical list)
        p2.setBackground(Color.GRAY);

        //BORDER LAYOUT OF FRAME FOR EAST AND WEST PLACEMENT
        setLayout(new BorderLayout());

        //ADDING PANELS TO FRAME
        add(p1, BorderLayout.WEST);
        add(p2, BorderLayout.EAST);

        JButton btnSubmit = new JButton("SUBMIT");

        //ADDING OBJECTS TO THE FIRST(LEFT PANE)
        p1.add(id);
        p1.add(idtext);
        p1.add(lastN);
        p1.add(lastNtext);
        p1.add(firstN);
        p1.add(firstNtext);
        p1.add(phone);
        p1.add(phonetext);
        p1.add(age);
        p1.add(agetext);
        p1.add(movie);
        p1.add(movietext);
        p1.add(btnSubmit);
        p1.add(new JLabel("")); //SPACING
        p1.add(idOUT);
        p1.add(nameOUT);
        p1.add(phoneOUT);
        p1.add(ageOUT);
        p1.add(moviesOUT);

        // Make output fields not editable
        idOUT.setEditable(false);
        nameOUT.setEditable(false);
        phoneOUT.setEditable(false);
        ageOUT.setEditable(false);
        moviesOUT.setEditable(false);

        //ADD ACTION TO SUBMIT BUTTON, DISPLAYS INPUT
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String memberid = idtext.getText();
                String fullname = firstNtext.getText() + " " + lastNtext.getText();
                String phonenum = phonetext.getText();
                String age = agetext.getText();
                String movies = movietext.getText();
                idOUT.setText("ID: " + memberid);
                nameOUT.setText("NAME: " + fullname);
                phoneOUT.setText("TEL#: " + phonenum);
                ageOUT.setText("Age: " + age);
                moviesOUT.setText(movies);
            }
        });


        //SECOND PANEL, GRID LAYOUT - 0 rows means unlimited rows
        p2.setLayout(new GridLayout(0,1));

        // Make output fields not editable
        totalmoviesOUT.setEditable(false);
        subtotaltxt.setEditable(false);
        latefeetxt.setEditable(false);
        cardfeetxt.setEditable(false);
        totaltext.setEditable(false);

        JButton btnstartcheck = new JButton("Click Here to Begin checkout");
        //ADD FUNCTION TO BUTTON, takes total as string , sets total to OUTPUT TEXTFIELD
        btnstartcheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {double subtotal;
                String totalvideo;
                totalvideo = (JOptionPane.showInputDialog(null, "Number of Videos:"));
                totalmoviesOUT.setText(totalvideo);

                //IF LATE, ADD $1.00
                if (late == true){
                    latefeetxt.setText("1.00");
                }
                else {
                    latefeetxt.setText("0.00");
                }
            }
        });

        //USE MOUSE LISTENER FOR RENT BUTTON TASKS
        btnrent.addMouseListener(this);

        //ADD ACTION LISTENER FOR PURCHASE BUTTON TASKS (totalmovies*buy prive
        btnbuy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double buyprice = 29.95;
                int moviecount;
                moviecount = Integer.parseInt(totalmoviesOUT.getText());
                double latefee = Double.parseDouble(latefeetxt.getText());
                subtotaltxt.setText(String.format("%.2f", (buyprice * moviecount) + latefee)); //sets subtotal to string format, 2 decimal places
            }
        });

        //ADD ACTION LISTENER FOR CART BUTTON TAKS (subtotal + late fee + cardfee, dsiplays with JOptionPane)
        btncard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double subtotal =Double.parseDouble(subtotaltxt.getText());
                double lateFee = Double.parseDouble(latefeetxt.getText()); //JUST TO PRINT
                double cardfee = 5.00;
                cardfeetxt.setText(String.format("%.2f",cardfee));
                double total = subtotal + cardfee;
                String cardnum = JOptionPane.showInputDialog("Enter Card Number");
                totaltext.setText(String.format("%.2f", total));

                // Build the receipt message
                String message = String.format(
                        "Subtotal Total - $%.2f\nLate Fee - $%.2f\nCard Fee - $%.2f\nCREDIT TOTAL - $%.2f",
                        subtotal, lateFee, cardfee, total
                );

                // Show the message in a popup dialog
                //OVERRIDED METHOD FROM CHECKOUT INTERFACE
                Payment(message);
                //JOptionPane.showMessageDialog(null, message);

            }
        });

        //ACTION LISTENER FOR CASH PROCESS (
        btncash.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double subtotal =Double.parseDouble(subtotaltxt.getText());
                double cardfee = 0.00;
                double latefee = Double.parseDouble(latefeetxt.getText()); //to printq
                double total = subtotal + cardfee;
                cardfeetxt.setText(String.format("%.2f",cardfee));
                totaltext.setText(String.format("%.2f", total));

                String message = String.format(
                        "Subtotal Total - $%.2f\nLate Fee - $%.2f\nCASH TOTAL - $%.2f",
                        subtotal, latefee, total
                );

                // Show the message in a popup dialog
                Payment(message);
                //JOptionPane.showMessageDialog(null, message);

            }
        });

        //ADDING OBJECT TO SECOND PANE
        p2.add(btnstartcheck);
        p2.add(totalmovies);
        p2.add(totalmoviesOUT);
        p2.add(latefeeDisplay);
        p2.add(latefeetxt);
        p2.add(btnrent);
        p2.add(btnbuy);
        p2.add(subtotalDisplay);
        p2.add(subtotaltxt);
        p2.add(btncard);
        p2.add(btncash);
        p2.add(new JLabel("Card Fee: $5.00"));
        p2.add(cardfeetxt);
        p2.add(totalDisplay);
        p2.add(totaltext);

        //SET VISIBLE
        setVisible(true);

    }

    //EVENT FOR RENT BUTTON , subtotal for moviecount * rentprice
    @Override
    public void mouseClicked(MouseEvent e) {
        double rentprice = 3.99;
        int moviecount;
        double latefee = Double.parseDouble(latefeetxt.getText());
        moviecount = Integer.parseInt(totalmoviesOUT.getText());
        subtotaltxt.setText(String.format("%.2f", (rentprice * moviecount) + latefee)); //sets subtotal to string format, 2 decimal places
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    //OVERRIDDEN METHOD FROM IMPLEMENTED CHECKOUT CLASS
    @Override
    public void Payment(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
