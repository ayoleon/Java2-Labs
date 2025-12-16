import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuKeyEvent;
import javax.swing.event.MenuKeyListener;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MenuFrame {

    boolean filecreated = false;

    MenuFrame(){

        //CREATE FRAME
    JFrame frame1 = new JFrame("Menu Lab");
    frame1.setSize(300,200);
    frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //WINDOWS CONSTANTS

    JMenuBar mb1 = new JMenuBar();

    JMenu file = new JMenu("File");
    JMenu payment = new JMenu("Payment");
    file.setMnemonic(KeyEvent.VK_F);//CAPITAL F KEY as shortcut for FILE menu ON WINDOWS
        // mac ignores this^^^^^^^
    payment.setMnemonic(KeyEvent.VK_P);
    JMenuItem rent = new JMenuItem("Rent");
    JMenuItem buy = new JMenuItem("Buy");
    JMenuItem writeFile = new JMenuItem("Write to File");
    JMenuItem readFile = new JMenuItem("Read from File");
    JMenuItem quit = new JMenuItem("Quit");


        //SET CROSS PLATFORM KEY -- CMD W on mac and CTRL W on windows
    writeFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
    readFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
    rent.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
    buy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
    quit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));

    quit.addActionListener(e -> System.exit(0));
    writeFile.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                new WriteFile();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            filecreated = true;
        }
    });

    readFile.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                new ReadFile();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    });

    rent.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            new rentPay();
        }
    });

    buy.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            new buyPay();
        }
    });


        // Add MenuListener to dynamically enable READ FROM FILE in menu
    file.addMenuListener(new MenuListener() {
        @Override
        public void menuSelected(MenuEvent e) {
            //enable READ FROM FILE only if file is opened..
            readFile.setEnabled(filecreated);
        }

        @Override
        public void menuDeselected(MenuEvent e) {

        }

        @Override
        public void menuCanceled(MenuEvent e) {

        }
    });
    frame1.setJMenuBar(mb1);
    mb1.add(file);
    mb1.add(payment);
    file.add(writeFile);
    file.add(readFile);
    file.add(quit);
    payment.add(rent);
    payment.add(buy);
    //payment.add(quit); //JMenuItem can only be added to one JMenu, unless done with a method that returns the same JMenuItem
    frame1.setVisible(true);
    }


}
