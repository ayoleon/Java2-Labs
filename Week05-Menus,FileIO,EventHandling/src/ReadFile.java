import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    ReadFile() throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("CustomerData.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            JOptionPane.showMessageDialog(null, line);
        }
        br.close();
    }
}
