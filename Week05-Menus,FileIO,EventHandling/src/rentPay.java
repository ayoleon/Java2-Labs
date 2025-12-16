import javax.swing.*;

public class rentPay {
    rentPay(){

        double rentprice = 3.99;
        String moviecount = "";
        while(moviecount == null || moviecount.isEmpty()){
            moviecount = JOptionPane.showInputDialog("Enter total movie count");
            if(moviecount == null || moviecount.isEmpty()){
                JOptionPane.showMessageDialog(null, "No value entered. Please try again.");
            }
        }
        int totalmovie = Integer.parseInt(moviecount);
        JOptionPane.showMessageDialog(null, String.format("Subtotal for renting %d movie(s) at $%.2f is $%.2f", totalmovie, rentprice, totalmovie * rentprice));


    }
}
