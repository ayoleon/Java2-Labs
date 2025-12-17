import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Payment extends JFrame implements ActionListener {
    JButton rent = new JButton("Click to Rent");
    JButton buy = new JButton("Click to Purchase");
    Connection conn;
    String url, table, tablename, data;


    Payment(String url, String table, String tablename) throws SQLException {
        this.url = url;
        this.table = table;
        this.tablename = tablename;
        setSize(300,300);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0,1));
        add(rent);
        add(buy);
        rent.addActionListener(this);
        buy.addActionListener(this);

        String name = JOptionPane.showInputDialog("Enter Customer's Last Name");
        conn = DriverManager.getConnection(url);
        String query = "SELECT * FROM " + table + " WHERE Lastname =  '" + name + "'";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);



        while (rs.next()){
            data = rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3);
            JOptionPane.showMessageDialog(null, data);
        }
        setLocation(600, 0);
        setVisible(true);





    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == rent){
        double price = 3.99;
        new PaymentMethod(price, tablename, url, data);
        } else if (e.getSource() == buy){
        double price = 24.99;
        new PaymentMethod(price, tablename, url, data);
        }
    }
}
