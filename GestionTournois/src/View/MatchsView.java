package View;

import javax.swing.*;
import java.awt.*;

public class MatchsView {
    private JFrame tourSelect = new JFrame();
    private JFrame matchesList = new JFrame();
    private JLabel listTitle;

    public MatchsView() {
        initComponents();
    }

    private void initComponents() {
        // Initialising both frames
        tourSelectInit();
        matchesListInit();
        
        // We first use the tourSelect
        tourSelect.setVisible(true);
        tourSelect.repaint();
        
        
    }

    private void newWindow() {
        tourSelect.setVisible(false);
        matchesList.setVisible(true);
        matchesList.repaint();
    }

    private void frameInit(JFrame frame, Dimension dimension) {
        frame.setTitle("Outil de gestion des plannings");
        frame.setSize(dimension);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    private void tourSelectInit() {
        frameInit(tourSelect, new Dimension(650, 150));
        
        JButton firstRound = new JButton("Premier Tour");
        firstRound.addActionListener(actionEvent -> {
            listTitle.setText("Matchs du premier tour");
            newWindow();
        });
        JButton secondRound = new JButton("Second Tour");
        secondRound.addActionListener(actionEvent -> {
            listTitle.setText("Matchs du second tour");
            newWindow();
        });
        JButton quarterFinal = new JButton("Quart de Finale");
        quarterFinal.addActionListener(actionEvent -> {
            listTitle.setText("Matchs de quart de finale");
            newWindow();
        });
        JButton semiFinal = new JButton("Demi-finale");
        semiFinal.addActionListener(actionEvent -> {
            listTitle.setText("Matchs du demi-finale");
            newWindow();
        });
        JButton finalRound = new JButton("Finale");
        finalRound.addActionListener(actionEvent -> {
            listTitle.setText("Match de finale");
            newWindow();
        });
        
        tourSelect.add(firstRound);
        tourSelect.add(secondRound);
        tourSelect.add(quarterFinal);
        tourSelect.add(semiFinal);
        tourSelect.add(finalRound);
        tourSelect.setLayout(new FlowLayout());
    }
    
    private void matchesListInit() {
        frameInit(matchesList, new Dimension(600, 800));
        listTitle = new JLabel();
        JButton backButton = new JButton("Retour");
        backButton.addActionListener(actionEvent -> {
            matchesList.setVisible(false);
            tourSelect.setVisible(true);
        });
        
        matchesList.add(listTitle);
        matchesList.add(backButton);
        matchesList.setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        MatchsView a1 = new MatchsView();
    }
}
