import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.*;

public class MovieBackup extends JFrame {

    MovieBackup(){
        super("MoviePlex"); //sets name to frame..

        setSize(800,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //Panels???

        JMenuBar bar = new JMenuBar();
        bar.setLayout(new FlowLayout(FlowLayout.LEFT)); //left to right


        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);//shortcut key

        JMenuItem open = new JMenuItem("Open Movies");
        open.setMnemonic(KeyEvent.VK_O);
        JMenuItem backup = new JMenuItem("Backup Movies");
        backup.setMnemonic(KeyEvent.VK_B);
        JMenuItem exit = new JMenuItem("Exit");
        exit.setMnemonic(KeyEvent.VK_E);

        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Streaming();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        backup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Streaming2();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        add(bar);
        bar.add(file);
        file.add(open);
        file.add(backup);
        file.add(exit);



        setVisible(true);

    }

    void Streaming() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\lamva\\Movies\\Movie.txt");


        int c; //integer because binary/ASCII...
        while((c = fis.read()) != -1)   //another way while (!fr.canRead( ) ) //-1 is end of file... read() reads 1 byte, returns as integer
            JOptionPane.showMessageDialog(null,(char)c); //TYPECASTING c AS CHARACTER

        fis.close(); //ALWAYS CLOSE THE FILES


    }

    void Streaming2() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\lamva\\Movies\\Movie.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\lamva\\Movies\\MovieBackup.txt") ;

        byte[] buffer = new byte[2048];


        int length;
        //fis.read(buffer) returns number of bytes actually read, stores into variable length. keeps looping if read more than 0 bytes
        while ((length = fis.read(buffer)) > 0){ //read(buffer) reads up to buffer.length bytes from input
            fos.write(buffer, 0, length); //write first "length" bytes from buffr into output
            // (buffer, 0, length) - byte array, starting index in array to begin writing, number of bytes to write
        }

        fis.close();
        fos.close();
    }
    public static void main(String[] args) {
        new MovieBackup();

    }
}