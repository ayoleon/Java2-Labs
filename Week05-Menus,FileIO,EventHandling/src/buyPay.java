import javax.swing.*;

public class buyPay {
    buyPay(){
        double buyprice = 29.95;
        String moviecount = "";
        while(moviecount == null || moviecount.isEmpty()){
            moviecount = JOptionPane.showInputDialog("Enter total movie count");
            moviecount = moviecount.trim();
            if(moviecount == null || moviecount.isEmpty()){
                JOptionPane.showMessageDialog(null, "No value entered. Please try again.");
            }
        }
        int totalmovie = Integer.parseInt(moviecount);
        JOptionPane.showMessageDialog(null, String.format("Subtotal for purchase of %d movie(s) at $%.2f is $%.2f", totalmovie, buyprice, totalmovie * buyprice));


    }
}
