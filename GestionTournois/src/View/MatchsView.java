package View;

import Model.ObjectFactory;
import Controller.Match;
import Controller.Player;
import Controller.Horaire;
import Controller.Terrain;
import javax.swing.*;
import java.awt.*;
import Model.MatchFactory;
import java.util.ArrayList;
import java.util.HashSet;

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
        matchesList.repaint();
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
        JButton exit = new JButton("Quitter");
        exit.addActionListener(actionEvent -> {
            System.exit(0);
        });
        
        tourSelect.add(firstRound);
        tourSelect.add(secondRound);
        tourSelect.add(quarterFinal);
        tourSelect.add(semiFinal);
        tourSelect.add(finalRound);
        tourSelect.add(exit);
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
        JList buttonList = new JList();        
        
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
                    if (player1.isEmpty() && player2.isEmpty()) {
                        player1 = p.getFirstName() + " " + p.getLastName();
                    } else if (!player1.isEmpty() && player2.isEmpty()) {
                        player2 = p.getFirstName() + " " + p.getLastName();
                    }
                }
                JButton match = new JButton(player1 + " - " + player2);
                match.addActionListener(actionEvent -> {
                    testMethod(m);
                });
                frame.add(match);
            }
        }
        frame.repaint();
    }
    
    private void testMethod(Match match) { // Le score, terrain
        JFrame frame = new JFrame();
        JLabel title = new JLabel();
        JLabel scheduleLabel = new JLabel();
        JLabel courtLabel = new JLabel();
        JLabel scoreLabel = new JLabel("À déterminer");
        
        Player player1 = null;
        Player player2 = null;
        Horaire schedule = match.getHoraire();
        Terrain court = match.getTerrain();
        
        
        frame.setSize(new Dimension(500, 200));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        
        
        for (Player p : match.getScore().keySet()) {
            if (player1 == null && player2 == null) {
                player1 = p;
            } else if (player1 != null && player2 == null) {
                player2 = p;
            }
        }
        ArrayList<Integer> scoreP1 = match.getScore().get(player1);
        ArrayList<Integer> scoreP2 = match.getScore().get(player2);
        
        Integer setP1 = scoreP1.get(0);
        Integer setP2 = scoreP2.get(0);
        
        String affichageScoreP1 = "";
        String affichageScoreP2 = "";
                
        title.setText(player1.getFirstName() + " " + player1.getLastName() +
                " - " + player2.getFirstName() + " " + player2.getLastName());
        
        int i = 0;
        int j = 0;
        
        while (setP1 != null && i < scoreP1.size()) {
            affichageScoreP1 = affichageScoreP1.concat(Integer.toString(setP1) 
                    + " ");
            i++;
            setP1 = scoreP1.get(i);
        }
        
        while (setP2 != null && j < scoreP2.size()) {
            affichageScoreP2 = affichageScoreP2.concat(Integer.toString(setP2) 
                    + " ");
            j++;
            setP2 = scoreP2.get(j);
        }
        
        if (!affichageScoreP1.equals("") || !affichageScoreP2.equals("")) {
            scoreLabel.setText(affichageScoreP1 + " - " + affichageScoreP2);
        }
        frame.repaint();
        
        JButton exit = new JButton("Retour");
        exit.addActionListener(actionEvent -> {
            frame.getContentPane().removeAll();
            frame.dispose();
        });
        
        frame.add(title);
        frame.add(exit);
        frame.add(scoreLabel);
        frame.setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        MatchsView a1 = new MatchsView();
    }
}
