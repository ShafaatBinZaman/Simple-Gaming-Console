package project;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class RockPaperScissorsGame extends JFrame implements ActionListener {

    public JButton rockButton, paperButton, scissorsButton,exitButton;
    public JLabel resultLabel;
    public int totalGames = 0;
    public int playerWins = 0;
    public int computerWins = 0;
    public int tiedGames = 0;

    public RockPaperScissorsGame() {
        setTitle("Rock Paper Scissors Game");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        rockButton = new JButton("Rock");
        paperButton = new JButton("Paper");
        scissorsButton = new JButton("Scissors");
        exitButton = new JButton("Exit Game");
        exitButton.setForeground(Color.white);
        exitButton.setBackground(Color.red);
        
        
        exitButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                Games gms = new Games();
                gms.setVisible(true);
                dispose();
            }
        });
        

        resultLabel = new JLabel("Result: ");

        rockButton.addActionListener(this);
        paperButton.addActionListener(this);
        scissorsButton.addActionListener(this);

        setLayout(new GridLayout(5, 1));

        add(rockButton);
        add(paperButton);
        add(scissorsButton);
        add(resultLabel);
        add(exitButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String playerChoice = "";
        String computerChoice = "";

        if (e.getSource() == rockButton) {
            playerChoice = "Rock";
        } else if (e.getSource() == paperButton) {
            playerChoice = "Paper";
        } else if (e.getSource() == scissorsButton) {
            playerChoice = "Scissors";
        }

        String[] choices = {"Rock", "Paper", "Scissors"};
        int computerChoiceIndex = (int) (Math.random() * choices.length);
        computerChoice = choices[computerChoiceIndex];

        String result = determineWinner(playerChoice, computerChoice);

        resultLabel.setText("Result: " + result);

        updateCounts(result);
        achievementPop();

        saveResultToFile(result);
    }

    public String determineWinner(String playerChoice, String computerChoice) {
        totalGames++;
        if (playerChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else if ((playerChoice.equals("Rock") && computerChoice.equals("Scissors")) || (playerChoice.equals("Paper") && computerChoice.equals("Rock")) || (playerChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }

    public void updateCounts(String result) {
        if (result.equals("It's a tie!")) {
            tiedGames++;
        } else if (result.equals("You win!")) {
            playerWins++;
        } else if (result.equals("Computer wins!")) {
            computerWins++;
        }
    }

    public void saveResultToFile(String result) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("game_results.txt", true))) {

            writer.write("Total Games Played: " + totalGames);
            writer.newLine();
            writer.write("Result: " + result);
            writer.newLine();
            writer.write("User Wins: " + playerWins);
            writer.newLine();
            writer.write("Computer Wins: " + computerWins);
            writer.newLine();
            writer.write("Tied Games: " + tiedGames);
            writer.newLine();
            writer.newLine();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void achievementPop() {
        if(playerWins == 10) {
            JOptionPane.showMessageDialog(null, "!!Congrats!! You earned Master Key");
            RockPaperScissorsGame rps = new RockPaperScissorsGame();
                rps.setVisible(true);
                dispose();
        } else if(playerWins == 20) {
            JOptionPane.showMessageDialog(null, "!!Congrats!! You earned the Legend Title");
            RockPaperScissorsGame rps = new RockPaperScissorsGame();
                rps.setVisible(true);
                dispose();
        }
    }

    public static void main(String[] args) {
        RockPaperScissorsGame game = new RockPaperScissorsGame();
        game.setVisible(true);
    }
}
