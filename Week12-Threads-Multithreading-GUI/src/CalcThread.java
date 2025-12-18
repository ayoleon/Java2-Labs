import javax.swing.*;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalcThread extends Thread{
    public void run(){
        String command1 = "C:\\Windows\\System32\\calc.exe";
        Runtime run1 = Runtime.getRuntime(); //sets up JVM
        try {
            Process proc1 = run1.exec(command1);
        } catch (IOException e) {
            Logger.getLogger(CalcThread.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Logger.getLogger(CalcThread.class.getName()).log(Level.SEVERE, null, e);
        }
        JOptionPane.showMessageDialog(null, "Calculator Program was Opened");
    }

}
