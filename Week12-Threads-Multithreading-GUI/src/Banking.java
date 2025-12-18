import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class Banking {
    static class Interest{
        public void InterestUtil(){
            DecimalFormat df = new DecimalFormat("0.00");
            double initAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter dollar amount to compute interest"));
            double interest = initAmount * .15;
            double total = initAmount + interest;
            JOptionPane.showMessageDialog(null, "Initial Amount: $" +df.format(initAmount) +"\n Interest (15%): $" + df.format(interest) + "\nTotal Amount: $" + df.format(total));
        }
    }
}
