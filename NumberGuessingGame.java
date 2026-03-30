package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class NumberGuessingGame {

    public static void main(String[] args) {
        GuessNumber guess = new GuessNumber();
    }
}

class GuessNumber extends JFrame {

    private JTextField t1;
    private JLabel l1, l2,l4;
    private JButton b1, b2;
    private Container c;
    private Font f;

    int count = 0;
    int gg = 10;
    int high = 0;
    int low = 0;

    int m = (int) (Math.random() * 100);
    //int m = 5;

    public GuessNumber() {

        setVisible(true);
        setSize(600, 600);
        setTitle("Number Guessing Game");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);

        f = new Font("Times New Roman", Font.BOLD, 17);

        l1 = new JLabel("The Range is between 0-100 ");
        l1.setBounds(210, 10, 600, 100);
        l1.setFont(f);
        c.add(l1);
        
        l4 = new JLabel("  Total Number of Tries: 10");
        l4.setBounds(210, 80, 600, 20);
        l4.setFont(f);
        c.add(l4);
        

        t1 = new JTextField(20);
        t1.setBounds(250, 150, 100, 30);
        c.add(t1);

        b1 = new JButton("SUBMIT");
        b1.setBounds(200, 190, 200, 40);
        c.add(b1);

        l2 = new JLabel("Answer");
        l2.setBounds(150, 240, 600, 100);
        l2.setFont(f);
        c.add(l2);

        b2 = new JButton("EXIT GAME");
        b2.setBounds(200, 410, 200, 40);
        b2.setForeground(Color.white);
        b2.setBackground(Color.red);
        c.add(b2);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                try{
                
               int num = Integer.parseInt(t1.getText());

                if ((num == m && gg > 0) && (num == m && gg <5)) {
                    gg--;
                    JOptionPane.showMessageDialog(null, "Hurray !! You guessed the right number");
                    GuessNumber gm = new GuessNumber();
                    gm.setVisible(true);
                    dispose();

                } else if((num == m && gg > 4) && (num == m && gg <7)){
                    gg--;
                    JOptionPane.showMessageDialog(null, "!!Congrats!! You earned Rookie TITLE !");
                    GuessNumber gm = new GuessNumber();
                    gm.setVisible(true);
                    dispose();
                    
                } else if((num == m && gg > 6) && (num == m && gg <9)){
                    gg--;
                    JOptionPane.showMessageDialog(null, "!!Congrats!! You earned MASTER GUARDIAN TITLE !");
                    GuessNumber gm = new GuessNumber();
                    gm.setVisible(true);
                    dispose();
                    
                } else if(num == m & gg>=9) {
                    gg--;
                    JOptionPane.showMessageDialog(null, "!!HATS OFF !! YOU are the ULTIMATE CHAMPION");
                    GuessNumber gm = new GuessNumber();
                    gm.setVisible(true);
                    dispose();
 
                } else if (num < m && gg > 1 && num<100) {
                    //high++;
                    gg--;
                    l2.setText("Oops..Guess Higher!"+" You have "+gg+" tries left");

                } else if (num > m && gg > 1 && num <100) {
                   // low++;
                    gg--;
                    l2.setText("Oops..Guess Lower!"+" You have "+gg+" tries left.");

                } else if (num >= 100) {
                    l2.setText("Please Guess Between 0 to 100!"+" You still have "+gg+" tries left.");
                } else {
                    JOptionPane.showMessageDialog(null, "Sorry You lost! Please Try again");
                    GuessNumber gm = new GuessNumber();
                    gm.setVisible(true);
                    dispose();

                }
                }catch(Exception e) {
                    System.out.println(e);
                    
                }
            }
        });

        b2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                Games gms = new Games();
                gms.setVisible(true);
                dispose();
            }
        });

        
    }
    
}
