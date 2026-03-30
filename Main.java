package project;

import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.green;
import static java.awt.Color.white;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {

    private Container c;
    private JLabel welcomeMessage,j1;
    private Font f1, f2,f3;
    private JButton admin, player;

    Main() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);

        f1 = new Font("Times New Roman", Font.BOLD, 60);
        f2 = new Font("Times New Roman", Font.BOLD, 15);
        f3 = new Font("Times New Roman", Font.BOLD, 20);

        welcomeMessage = new JLabel("WELCOME");
        welcomeMessage.setBounds(135, 50, 600, 100);
        welcomeMessage.setFont(f1);
        c.add(welcomeMessage);
        
        j1 = new JLabel("SIMPLE GAMING CONSOLE ");
        j1.setBounds(150, 140, 300, 100);
        j1.setFont(f3);
        c.add(j1);

        admin = new JButton("ADMIN");
        admin.setBounds(215, 250, 150, 50);
        admin.setFont(f2);
        admin.setBackground(green);
        c.add(admin);

        player = new JButton("PLAYER");
        player.setBounds(215, 320, 150, 50);
        player.setFont(f2);
        player.setBackground(white);
        player.setForeground(black);
        c.add(player);

        admin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                AdminLogin admin = new AdminLogin();
                admin.setVisible(true);
            }
        });
        player.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                UserLogin siuu = new UserLogin();
                siuu.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        Main frame = new Main();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300, 50, 600, 600);
        frame.setTitle("Simple Gaming Console");

    }

}
