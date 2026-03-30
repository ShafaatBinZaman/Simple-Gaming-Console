package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Info {

    public static void main(String[] args) {
        Information tf = new Information();
    }
}

class Information extends JFrame {

    private JLabel l1, l2, l3, l4, l5, l6, l7, l8,l9;
    private JButton back;
    private Container c;
    private Font f,g,h;

    public Information() {

        setVisible(true);
        setSize(600, 600);
        setTitle("How to Play");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);

        f = new Font("Times New Roman", Font.ITALIC, 19);
        g = new Font("Times New Roman", Font.PLAIN, 14);
        h = new Font("Times New Roman", Font.BOLD, 22);

        l7 = new JLabel("HOW TO PLAY");
        l7.setBounds(220, 0, 400, 100);
        l7.setFont(h);
        l7.setForeground(Color.blue);
        c.add(l7);

        l1 = new JLabel("  \\*** ROCK PAPER SCISSORS ***//");
        l1.setBounds(150, 40, 400, 100);
        l1.setFont(f);
        c.add(l1);

        l2 = new JLabel("⦾ Logics -  ");
        l2.setBounds(0, 80, 500, 100);
        l2.setFont(g);
        c.add(l2);
        
        l9 = new JLabel("Rock beats Scissors , Scissors beats Paper , Paper beats Rock  ");
        l9.setBounds(0, 120, 500, 100);
        l9.setFont(g);
        c.add(l9);

        l3 = new JLabel("When a button is clicked, the game logic is executed and the result is displayed ");
        l3.setBounds(0, 160, 500, 100);
        l3.setFont(g);
        c.add(l3);

        l8 = new JLabel(" \\*** NUMBER GUESSING GAME  ***//");
        l8.setBounds(150, 210, 400, 100);
        l8.setFont(f);
        c.add(l8);

        l4 = new JLabel("⦾ Logics - .");
        l4.setBounds(0, 240, 500, 100);
        l4.setFont(g);
        c.add(l4);

        l5 = new JLabel(" The Game generates a random number between 1 - 100");
        l5.setBounds(0, 280, 500, 100);
        l5.setFont(g);
        c.add(l5);

        l6 = new JLabel("Player has to guess the exact correct number");
        l6.setBounds(0, 320, 450, 100);
        l6.setFont(g);
        c.add(l6);

        back = new JButton("Back");
        back.setBounds(200, 500, 200, 40);
        back.setForeground(Color.BLACK);
        back.setBackground(Color.GRAY);
        c.add(back);

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new Options();
                dispose();
            }
        });
    }

    }

