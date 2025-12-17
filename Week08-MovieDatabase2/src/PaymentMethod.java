import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class PaymentMethod extends JFrame implements ActionListener {

    JLabel lbl = new JLabel("Select Payment Method");
    JButton cash = new JButton("CASH");
    JButton card = new JButton("CARD");
    JButton mobile = new JButton("MOBILE");
    JButton check = new JButton("CHECK");

    Connection conn;
    String url, tablename, data;
    double price;


    PaymentMethod(double price, String tablename, String url, String data){
        this.price = price;
        this.tablename = tablename;
        this.url = url;
        this.data = data;
        setSize(300,300);
        setLocation(600, 0);
        setLayout(new GridLayout(0,1));
        add(lbl);
        add(cash);
        cash.addActionListener(this);
        add(card);
        card.addActionListener(this);
        add(mobile);
        mobile.addActionListener(this);
        add(check);
        check.addActionListener(this);

        setVisible(true);
    }

    void cashPay() throws SQLException {
        conn = DriverManager.getConnection(url);
        String query = "SELECT Tax FROM " + tablename + " WHERE Method =  'Cash'";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while(rs.next()){
            double tax = rs.getInt(1) / 100.0;
            int totalmovies = Integer.parseInt(JOptionPane.showInputDialog("Enter total number of movies"));
            double total = totalmovies * price + (totalmovies * price * tax);
            String message = String.format("Customer: "+ data + "\n Total : " + totalmovies + " x $" + price + " + $%.2f (tax) = $%.2f", (totalmovies * price * tax),total);
            JOptionPane.showMessageDialog(null, message);
        }
    }

    void cardPay() throws SQLException {
        conn = DriverManager.getConnection(url);
        String query = "SELECT Tax FROM " + tablename + " WHERE Method =  'Card'";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while(rs.next()){
            double tax = rs.getInt(1) / 100.0;
            int totalmovies = Integer.parseInt(JOptionPane.showInputDialog("Enter total number of movies"));
            double total = totalmovies * price + (totalmovies * price * tax);
            String message = String.format("Customer: "+ data + "\n Total : " + totalmovies + " x $" + price + " + $%.2f (tax) = $%.2f", (totalmovies * price * tax),total);
            JOptionPane.showMessageDialog(null, message);
        }
    }
    void mobilePay() throws SQLException {
        conn = DriverManager.getConnection(url);
        String query = "SELECT Tax FROM " + tablename + " WHERE Method =  'Mobile'";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while(rs.next()){
            double tax = rs.getInt(1) / 100.0;
            int totalmovies = Integer.parseInt(JOptionPane.showInputDialog("Enter total number of movies"));
            double total = totalmovies * price + (totalmovies * price * tax);
            String message = String.format("Customer: "+ data + "\n Total : " + totalmovies + " x $" + price + " + $%.2f (tax) = $%.2f", (totalmovies * price * tax),total);
            JOptionPane.showMessageDialog(null, message);
        }
    }
    void checkPay() throws SQLException {
        conn = DriverManager.getConnection(url);
        String query = "SELECT Tax FROM " + tablename + " WHERE Method =  'Check'";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while(rs.next()){
            double tax = rs.getInt(1) / 100.0;
            int totalmovies = Integer.parseInt(JOptionPane.showInputDialog("Enter total number of movies"));
            double total = totalmovies * price + (totalmovies * price * tax);
            String message = String.format("Customer: "+ data + "\n Total : " + totalmovies + " x $" + price + " + $%.2f (tax) = $%.2f", (totalmovies * price * tax),total);
            JOptionPane.showMessageDialog(null, message);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == cash){
            try {
                cashPay();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        } else if(e.getSource() == card){
            try {
                cardPay();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        } else if(e.getSource() == mobile){
            try {
                mobilePay();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        } else if(e.getSource() == check){
            try {
                checkPay();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
