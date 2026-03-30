package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Options extends JFrame {

    private Container c;
    private JLabel j1;
    private JButton b1, b2, b3, b4, b5;
    private Font f;

    public Options() {

        setVisible(true);
        setSize(600, 600);
        setTitle("Options");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        f = new Font("Times New Roman", Font.BOLD, 24);

        j1 = new JLabel("Choose an Option ");
        j1.setBounds(200, 40, 200, 100);
        j1.setFont(f);
        c.add(j1);

        b1 = new JButton("GAMES");
        b1.setBounds(150, 180, 300, 40);
        c.add(b1);

        b2 = new JButton("SCOREBOARD");
        b2.setBounds(150, 230, 300, 40);
        c.add(b2);

        b3 = new JButton("ACHIEVEMENT");
        b3.setBounds(150, 280, 300, 40);
        c.add(b3);

        b4 = new JButton("INFO");
        b4.setBounds(150, 330, 300, 40);
        c.add(b4);

        b5 = new JButton("EXIT");
        b5.setBounds(150, 380, 300, 40);
        b5.setForeground(Color.white);
        b5.setBackground(Color.red);
        c.add(b5);

        b1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                Games gms = new Games();
                gms.setVisible(true);
                dispose();
            }

        });

        b2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                Scoreboard sb = new Scoreboard();
                sb.setVisible(true);
                dispose();
            }
        });

        b3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                Achievement ac = new Achievement();
                ac.setVisible(true);
                dispose();
            }
        });

        b4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                Information i = new Information();
                i.setVisible(true);
                dispose();
            }

        });

        b5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                
                dispose();
                UserLogin user = new UserLogin();
                user.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        Options sp = new Options();
    }
}
