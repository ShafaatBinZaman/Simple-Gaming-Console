package project;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Scoreboard extends JFrame {

    private JTextArea resultsArea;
    private JButton backButton;

    public Scoreboard() {

        setTitle("SCOREBOARD");
        setSize(300, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        resultsArea = new JTextArea();
        resultsArea.setEditable(false);

        add(new JScrollPane(resultsArea), BorderLayout.CENTER);

        loadResultsFromFile();

    }

    private void loadResultsFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("game_results.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                resultsArea.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            resultsArea.append("Error reading results from file.");
        }
    }

    public static void main(String[] args) {

        Scoreboard view = new Scoreboard();
        view.setVisible(true);

    }
}
