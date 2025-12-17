import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.*;

public class DBase {

    String dbname = "C://users//lamva//Movie.accdb";
    String url = "jdbc:ucanaccess://" + dbname;
    //initialize connection as blank
    Connection conn;

    JFrame frame = new JFrame("Movie Database");
    JButton display = new JButton("Click to Display 3 Data Records");
    JButton insert = new JButton("Click to Add New Data Entry");
    JTextField d1 = new JTextField();
    JTextField d2 = new JTextField();
    JTextField d3 = new JTextField();

    JMenuBar bar = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenuItem exit = new JMenuItem("Exit");

    String table = "Customers";


    DBase() throws ClassNotFoundException, SQLException {
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        frame.setSize(300,300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(0,1,5,20));



        d1.setEditable(false);
        d2.setEditable(false);
        d3.setEditable(false);


        frame.add(bar);
        frame.add(display);
        display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    View();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        frame.add(d1);
        frame.add(d2);
        frame.add(d3);
        bar.setLayout(new FlowLayout(FlowLayout.LEFT)); //left to right
        bar.add(file);
        file.setMnemonic(KeyEvent.VK_F);
        file.add(exit);
        exit.setMnemonic(KeyEvent.VK_E);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Close();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
                System.exit(0);
            }
        });

        frame.add(insert);
        insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Customer ID number"));
                String lastname = JOptionPane.showInputDialog("Enter Customer's Last Name");
                String firstname = JOptionPane.showInputDialog("Enter Customer's First Name");

                try {
                    Add(id, lastname, firstname);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }


            }
        });

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




    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        new DBase();


    }
}