import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainFrame extends JFrame implements ActionListener {

    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JButton b1 = new JButton("Calulator Thread");
    JButton b2 = new JButton("Calc Runnable Thread");
    JButton b3 = new JButton("Open Internet Browser");
    JButton b4 = new JButton("Open Notepad and Calulator");
    JButton b5 = new JButton("Compute Interest");

    MainFrame(){
        super("Leon Lam - Week 12 Lab");
        setSize(800,300);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(1,3));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        p1.setBackground(Color.gray);
        p2.setBackground(Color.lightGray);
        p3.setBackground(Color.darkGray);
        add(p1);
        add(p2);
        add(p3);
        p1.add(b1);
        p1.add(b2);
        p2.add(b3);
        p2.add(b4);
        p3.add(b5);

        setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

    }

    public static void main(String[] args) {
        new MainFrame();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            CalcThread c1 = new CalcThread();
            c1.setName("Thread1");
            c1.start();
        }
        else if(e.getSource() == b2){
            CalcThread2 c2 = new CalcThread2();
            Thread thread1 = new Thread(c2);
            thread1.setName("Thread 2");
            thread1.start();
        }
        else if(e.getSource() == b3) {
            BrowserThread br1 = new BrowserThread();
            Thread thread2 = new Thread(br1);
            thread2.setName("Thread 3");
            thread2.start();
        }
        else if(e.getSource() == b4){
            twoAppThread t1 = new twoAppThread();
            Thread thread3 = new Thread(t1);
            thread3.setName("Thread 4");
            thread3.start();
        }
        else if(e.getSource() == b5){
            Banking.Interest inter = new Banking.Interest();
            inter.InterestUtil();
        }
    }
}

