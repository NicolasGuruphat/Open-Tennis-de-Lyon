package View;

import Model.ObjectFactory;
import Controller.Match;
import Controller.Player;
import javax.swing.*;
import java.awt.*;
import Model.MatchFactory;

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
        
        // We first use the tourSelect
        tourSelect.setVisible(true);
        tourSelect.repaint();
        
        
    }

    private void newWindow(int round) {
        tourSelect.setVisible(false);
        matchesList.getContentPane().removeAll();
        matchesListInit(round);
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
            newWindow(1);
            listTitle.setText("Matchs du premier tour");
        });
        JButton secondRound = new JButton("Second Tour");
        secondRound.addActionListener(actionEvent -> {
            newWindow(2);
            listTitle.setText("Matchs du second tour");
        });
        JButton quarterFinal = new JButton("Quart de Finale");
        quarterFinal.addActionListener(actionEvent -> {
            newWindow(3);
            listTitle.setText("Matchs de quart de finale");
        });
        JButton semiFinal = new JButton("Demi-finale");
        semiFinal.addActionListener(actionEvent -> {
            newWindow(4);
            listTitle.setText("Matchs du demi-finale");
        });
        JButton finalRound = new JButton("Finale");
        finalRound.addActionListener(actionEvent -> {
            newWindow(5);
            listTitle.setText("Match de finale");
        });
        
        tourSelect.add(firstRound);
        tourSelect.add(secondRound);
        tourSelect.add(quarterFinal);
        tourSelect.add(semiFinal);
        tourSelect.add(finalRound);
        tourSelect.setLayout(new FlowLayout());
    }
    
    private void matchesListInit(int round) {
        frameInit(matchesList, new Dimension(600, 800));
        listTitle = new JLabel();
        JButton backButton = new JButton("Retour");
        backButton.addActionListener(actionEvent -> {
            matchesList.setVisible(false);
            tourSelect.setVisible(true);
        });
        
        matchesList.add(listTitle);
        createMatchList(round, matchesList);
        matchesList.add(backButton);
        matchesList.setLayout(new FlowLayout());
    }
    
    private void createMatchList(int round, JFrame frame) {
        ObjectFactory.createPlayers();
        ObjectFactory.createReferee();
        ObjectFactory.createBallPicker();
        ObjectFactory.createSchedule();
        ObjectFactory.createCourt();
        MatchFactory.createMatch();
        
        for (Match m : Match.getListeMatch()) {
            String player1 = "";
            String player2 = "";
            if (m.getTour() == round) {
                for (Player p : m.getScore().keySet()) {
                    if (player1.isEmpty()) {
                        player1 = p.getLastName() + " " + p.getFirstName();
                    } else {
                        player2 = p.getLastName() + " " + p.getFirstName();
                    }
                }
                JButton match = new JButton(player1 + " - " + player2);
                frame.add(match); 
            }
        }
        frame.repaint();
    }

    public static void main(String[] args) {
        MatchsView a1 = new MatchsView();
    }
}
