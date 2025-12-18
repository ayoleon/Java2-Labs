import javax.swing.*;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BrowserThread implements Runnable {
    public void run(){
        String browserPath = "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe";
        ProcessBuilder processBuilder = new ProcessBuilder(browserPath);
        try {
            processBuilder.start();
        } catch (IOException e) {
            Logger.getLogger(CalcThread.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
