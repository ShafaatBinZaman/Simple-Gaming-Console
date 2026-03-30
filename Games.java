package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Games extends JFrame {

    public Container c;
    public JLabel j1;
    public JButton b1, b2, b3;
    public Font f;

    public Games() {

        setVisible(true);
        setSize(500, 400);
        setTitle("GAMES");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.DARK_GRAY);

        f = new Font("Times New Roman", Font.BOLD, 20);

        j1 = new JLabel("CHOOSE A GAME ");
        j1.setForeground(Color.WHITE);
        j1.setBounds(170, 40, 200, 100);
        j1.setFont(f);
        c.add(j1);

        b1 = new JButton("ROCK PAPER SCISSORS");
        b1.setBounds(100, 140, 300, 40);
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.white);
        c.add(b1);

        b2 = new JButton("NUMBER GUESSING GAME");
        b2.setBounds(100, 190, 300, 40);
        b2.setForeground(Color.BLACK);
        b2.setBackground(Color.white);
        c.add(b2);

        b3 = new JButton("BACK");
        b3.setBounds(100, 240, 300, 40);
        b3.setForeground(Color.BLACK);
        b3.setBackground(Color.LIGHT_GRAY);
        c.add(b3);

        b1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                RockPaperScissorsGame rps = new RockPaperScissorsGame();
                rps.setVisible(true);
                dispose();
            }

        });

        b2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                GuessNumber gm = new GuessNumber();
                gm.setVisible(true);
                dispose();
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new Options();
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        Games gms = new Games();
    }
}
