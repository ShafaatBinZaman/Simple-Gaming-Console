package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Achievements {

    public static void main(String[] args) {
        Achievement tf = new Achievement();
    }
}

class Achievement extends JFrame {

    private JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
    private JButton back;
    private Container c;
    private Font f;
    private Font g;

    public Achievement() {

        setVisible(true);
        setSize(600, 600);
        setTitle("Achivement");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);

        f = new Font("Times New Roman", Font.BOLD, 17);
        g = new Font("Times New Roman", Font.BOLD, 14);

        l7 = new JLabel("!! ACHIEVEMENTS YOU CAN EARN !!");
        l7.setBounds(150, 5, 400, 100);
        l7.setForeground(Color.BLUE);
        l7.setFont(f);

        c.add(l7);

        l1 = new JLabel("  \\*** Rock Paper Scissors***/ ");
        l1.setBounds(0, 50, 400, 100);
        l1.setFont(f);
        c.add(l1);

        l2 = new JLabel("• Win 10times to achieve Master Key***>>> || || <<<***");
        l2.setBounds(150, 100, 500, 100);
        l2.setFont(g);

        c.add(l2);

        l3 = new JLabel("• Win 20times and you will be called a Legend !!!!");
        l3.setBounds(150, 150, 500, 100);
        l3.setFont(g);
        c.add(l3);

        l9 = new JLabel("• Win 10times in a row ,you will be one in {Million}");
        l9.setBounds(150, 200, 500, 100);
        l9.setFont(g);
        c.add(l9);

        l8 = new JLabel(" \\*** Number Guessing Game  ***/");
        l8.setBounds(0, 250, 400, 100);
        l8.setFont(f);
        c.add(l8);

        l4 = new JLabel("• Guess right answer in first 5 try get ..Rookie Card..");
        l4.setBounds(150, 300, 500, 100);
        l4.setFont(g);

        c.add(l4);

        l5 = new JLabel("• Guess right in the first 3 try to be {Master Guardian}  ");
        l5.setBounds(150, 350, 500, 100);
        l5.setFont(g);

        c.add(l5);

        l6 = new JLabel("• Guess in the first try to be the --Ultimate Champion--");
        l6.setBounds(150, 400, 500, 100);
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
