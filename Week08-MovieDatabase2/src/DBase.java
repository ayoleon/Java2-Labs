import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.*;

public class DBase implements ActionListener {

    public String dbname = "C://users//lamva//Movie.accdb";
    public String url = "jdbc:ucanaccess://" + dbname;
    //initialize connection as blank
    public Connection conn;

    JFrame frame = new JFrame("Movie Database");
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel mainPanel = new JPanel(new GridLayout(1, 2)); //FOR SPLITTING PANELS
    JButton display = new JButton("Click to Display 4 Customer Records");
    JButton insert = new JButton("Click to Add New Customer Data Entry");
    JButton create = new JButton("Click to Create Table");
    JButton insert2 = new JButton("Click to Add to New Table");
    JButton display2 = new JButton("Click to Display Tax info");
    JButton checkout = new JButton("CHECKOUT");
    JTextField d1 = new JTextField();
    JTextField d2 = new JTextField();
    JTextField d3 = new JTextField();
    JTextField d4 = new JTextField();
    JTextField d5 = new JTextField();
    JTextField d6 = new JTextField();
    JTextField d7 = new JTextField();
    JTextField d8 = new JTextField();

    JMenuBar bar = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenuItem exit = new JMenuItem("Exit");

    String table = "Customers";
    public String tablename;


    DBase() throws ClassNotFoundException, SQLException {
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        frame.setSize(600,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());
        frame.add(mainPanel, BorderLayout.CENTER);
        mainPanel.add(p1);
        mainPanel.add(p2);
        p1.setBackground(Color.GRAY);
        p2.setBackground(Color.LIGHT_GRAY);
        p1.setLayout(new GridLayout(0,1,5,20));
        p2.setLayout(new GridLayout(0,1,5,20));





        d1.setEditable(false);
        d2.setEditable(false);
        d3.setEditable(false);
        d4.setEditable(false);
        d5.setEditable(false);
        d6.setEditable(false);
        d7.setEditable(false);
        d8.setEditable(false);


        frame.setJMenuBar(bar);
        //p1.add(new JLabel(""));
        p1.add(new JLabel("CUSTOMER PANEL"));
        p1.add(display);
        display.addActionListener(this);

        p1.add(d1);
        p1.add(d2);
        p1.add(d3);
        p1.add(d4);


        bar.setLayout(new FlowLayout(FlowLayout.LEFT)); //left to right
        bar.add(file);
        file.setMnemonic(KeyEvent.VK_F);
        file.add(exit);
        exit.setMnemonic(KeyEvent.VK_E);

        exit.addActionListener(this);


        p1.add(insert);
        p1.add(new JLabel(""));
        insert.addActionListener(this);
        p2.add(new JLabel("PAYMENT PANEL"));
        p2.add(create);
        create.addActionListener(this);
        p2.add(insert2);
        insert2.addActionListener(this);
        p2.add(d5);
        p2.add(d6);
        p2.add(d7);
        p2.add(d8);
        p2.add(display2);
        display2.addActionListener(this);
        p2.add(checkout);
        checkout.addActionListener(this);

        frame.setVisible(true);

    }

    void View() throws SQLException {
        //always strings
        conn = DriverManager.getConnection(url);
        String query = "SELECT * FROM " + table; //SQL, name of table
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        int count = 0; //counter for inputting into 3 JTextfields..

        while (rs.next()) { // .next() - as long as there is a next feild. on lab, put it in TEXTFEILD to display and input
            String data = rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3);
            count++;

            // Display each row in a separate text field
            if (count == 1) {
                d1.setText(data);
            } else if (count == 2) {
                d2.setText(data);
            } else if (count == 3) {
                d3.setText(data);
            } else if (count == 4){
                d4.setText(data);
            } else {
                //stop after 3 rows
                break;
            }
        }
        conn.commit();
        Close();
    }

    void Close() throws SQLException {
        if (conn != null && !conn.isClosed()) {
            conn.close();
        }
    }

    void Add(int id, String lastname, String firstname) throws SQLException {
        conn = DriverManager.getConnection(url);
        Statement stmt = conn.createStatement();
        // (CustomerID, Lastname, Firstname) needed in the query for it to work for some reason...
        String query = "INSERT INTO " + table + "(CustomerID, Lastname, Firstname) VALUES(" +id + ", '" + lastname + "', '" + firstname + "')"; //SINGLE QUOTE NEEDED FOR STRINGS
        stmt.execute(query);
        conn.commit();
        Close();
    }

    void Create() throws SQLException {
        conn = DriverManager.getConnection(url);
        Statement stmt = conn.createStatement();
        tablename = JOptionPane.showInputDialog("Enter Table Name");
        String query = "CREATE TABLE " + tablename + " (Method char(10), Tax int)";
        stmt.execute(query);

        conn.commit();
        Close();
    }

    void Add2() throws SQLException {
        conn = DriverManager.getConnection(url);
        Statement stmt = conn.createStatement();

        while(true) {
            String method = JOptionPane.showInputDialog("Enter Payment Method (Cancel/Blank to Stop");

            if (method == null || method.isEmpty()) {
                JOptionPane.showMessageDialog(null, "All Inputs Entered");
                break;
            }

            int tax = Integer.parseInt(JOptionPane.showInputDialog("Enter Tax Percent"));
            String addrecord = "INSERT INTO " + tablename + " VALUES('" + method + "', " + tax + ")";
            stmt.execute(addrecord);
        }
        conn.commit();
        Close();
    }

    void Display() throws SQLException {
        conn = DriverManager.getConnection(url);
        String query = "SELECT * FROM " + tablename; //SQL, name of table
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        int count = 0; //counter for inputting into 3 JTextfields..

        while (rs.next()) { // .next() - as long as there is a next feild. on lab, put it in TEXTFEILD to display and input
            String data = rs.getString(1) + " -- " + rs.getString(2) + "%";
            count++;

            // Display each row in a separate text field
            if (count == 1) {
                d5.setText(data);
            } else if (count == 2) {
                d6.setText(data);
            } else if (count == 3) {
                d7.setText(data);
            } else if (count == 4) {
                d8.setText(data);
            }
            else {
                //stop after 3 rows
                break;
            }
        }
        conn.commit();
        Close();

    }

    void Checkout() throws SQLException {
        new Payment(url, table, tablename);
    }




    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        new DBase();


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == display){
            try {
                View();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
        else if(e.getSource() == exit){
            try {
                Close();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            System.exit(0);
        }
        else if(e.getSource() == insert){
            int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Customer ID number"));
            String lastname = JOptionPane.showInputDialog("Enter Customer's Last Name");
            String firstname = JOptionPane.showInputDialog("Enter Customer's First Name");

            try {
                Add(id, lastname, firstname);
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }

        }
        else if(e.getSource() == create){
            try {
                Create();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
        else if(e.getSource() == insert2){
            try {
                Add2();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }

        }
        else if(e.getSource() == display2){
            try {
                Display();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
        else if(e.getSource() == checkout){
            try {
                Checkout();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }

    }

}