
package project;


import static java.awt.Color.green;
import static java.awt.Color.pink;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UserLogin extends JFrame {
    
    public static void main(String[] args) {
        UserLogin a = new UserLogin();

        a.setBounds(600, 200, 400, 350);
        a.setSize(600,600);
        a.setVisible(true);
        a.setTitle("Login Panel");
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private Container c;
    private JLabel l1, l2, l3;
    private JTextField t;
    private JPasswordField pf;
    private JButton loginButton;
    private Font f1, f2;

    UserLogin() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 50, 600, 600);
        this.setTitle("Login Panel");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(pink);

        f1 = new Font("Times New Roman", Font.BOLD, 40);
        f2 = new Font("Times New Roman", Font.BOLD, 17);

        l1 = new JLabel("GAMER LOGIN");
        l1.setBounds(170, 50, 400, 100);
        l1.setFont(f1);
        c.add(l1);

        l2 = new JLabel("Username:");
        l2.setBounds(100, 200, 100, 30);
        l2.setFont(f2);
        c.add(l2);

        t = new JTextField();
        t.setBounds(205, 200, 200, 30);
        c.add(t);

        l3 = new JLabel("Password:");
        l3.setBounds(100, 250, 100, 30);
        l3.setFont(f2);
        c.add(l3);

        pf = new JPasswordField();
        pf.setBounds(205, 250, 200, 30);
        c.add(pf);

        loginButton = new JButton("Login");
        loginButton.setBounds(245, 350, 100, 30);
        loginButton.setFont(f2);
        loginButton.setBackground(green);
        c.add(loginButton);

        loginButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

                String userName = t.getText();
                String pass = pf.getText();

                if (userName.equals("Meow") && pass.equals("1234")) {
                    JOptionPane.showMessageDialog(null, "You're successfully logged in!");
                    
                    Options ap = new Options();
                    ap.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                    t.setText("");
                    pf.setText("");
                }
            }

        });

    }
}
