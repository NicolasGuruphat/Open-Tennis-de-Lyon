package View;

import Model.ObjectFactory;
import Controller.Match;
import Controller.Player;
import Controller.Horaire;
import Controller.Terrain;
import Model.DBDataFactory;
import javax.swing.*;
import java.awt.*;
import Model.MatchFactory;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MatchsView {
    private JFrame tourSelect = new JFrame();
    private JFrame matchesList = new JFrame();
    private JFrame matchView = new JFrame();
    private JFrame matchModifying = new JFrame();
    private JLabel listTitle;
    private JButton test;

    public MatchsView() {
        initComponents();
    }

    private void initComponents() {
        // Initialising both frames
        tourSelectInit();
        tourSelect.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        // We first use the tourSelect
        tourSelect.setVisible(true);
        tourSelect.repaint();
        
        ObjectFactory.createPlayers();
        ObjectFactory.createReferee();
        ObjectFactory.createBallPicker();
        ObjectFactory.createSchedule();
        ObjectFactory.createCourt();
        MatchFactory.createMatch();        
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
        
        test = secondRound;
        
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
        matchesList.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        listTitle = new JLabel();
        JButton backButton = new JButton("Retour");
        backButton.addActionListener(actionEvent -> {
            matchesList.dispose();
            tourSelect.setVisible(true);
        });
        
        matchesList.add(listTitle);
        createMatchList(round, matchesList);
        matchesList.add(backButton);
        matchesList.setLayout(new FlowLayout());
    }
    
    private void createMatchList(int round, JFrame frame) {
        JList buttonList = new JList();
        
        for (Match m : Match.getListeMatch()) {
            String matchName = "";
            if (m.getTour() == round) {
                matchName = playerToString(m.getJoueur(0), m.getJoueur(1));
                JButton match = new JButton(matchName);
                match.addActionListener(actionEvent -> {
                    showMatch(m);
                });
                frame.add(match);
            }
        }
        frame.repaint();
    }
    
    private void showMatch(Match match) { // Le score, terrain
        frameInit(matchView, new Dimension(500, 200));
        matchView.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        matchesList.setVisible(false);
        matchView.setVisible(true);
        
        JLabel matchTitle = new JLabel();
        JLabel scheduleLabel = new JLabel();
        JLabel courtLabel = new JLabel();
        JLabel scoreLabel = new JLabel("À déterminer");
        
        Player player1 = match.getJoueur(0);
        Player player2 = match.getJoueur(1);
        Horaire schedule = match.getHoraire();
        Terrain court = match.getTerrain();
        
        String affichageP1 = "";
        String affichageP2 = "";
        
        ArrayList<Integer> scorePlayer1 = match.getScore().get(player1);
        ArrayList<Integer> scorePlayer2 = match.getScore().get(player2);
        
        System.out.println(scorePlayer1);
        System.out.println(scorePlayer2);
        
        // Players
        matchTitle.setText(playerToString(player1, player2));
        matchView.repaint();
        
        // Score
        for (Integer i1 : scorePlayer1) {
            if (i1 != null) {
                affichageP1 = affichageP1.concat(Integer.toString(i1) + " ");
            }
        }
        
        for (Integer i2 : scorePlayer2) {
            if (i2 != null) {
                affichageP2 = affichageP2.concat(Integer.toString(i2) + " ");
            }
        }
        
        if (!affichageP1.equals("") && !affichageP2.equals("")) {
            scoreLabel.setText(affichageP1 + " - " + affichageP2);
        }
        
        // Schedule
        scheduleLabel.setText("Début : " + schedule.getHeureDebut());
        
        // Court
        courtLabel.setText("Terrain : " + court.getNom());
        
        // Modify action
        JButton modify = new JButton("Modifier");
        modify.addActionListener(actionEvent -> {
            modifyMatch(match);
        });
        
        JButton exit = new JButton("Retour");
        exit.addActionListener(actionEvent -> {
            matchView.getContentPane().removeAll();
            matchView.dispose();
            matchesList.setVisible(true);
        });
        
        matchView.add(matchTitle);
        matchView.add(scoreLabel);
        matchView.add(scheduleLabel);
        matchView.add(courtLabel);
        matchView.add(modify);
        matchView.add(exit);
        matchView.setLayout(new FlowLayout());
    }
    
    private void modifyMatch(Match m) {
        Player player1 = m.getJoueur(0);
        Player player2 = m.getJoueur(1);
        String[] games = { null, "0", "1", "2", "3", "4", "5", "6", "7", "8", 
            "9", "10"};
        
        frameInit(matchModifying, new Dimension(500, 500));
        matchModifying.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        matchModifying.setVisible(true);
        matchModifying.getContentPane().removeAll();
        
        JLabel title = new JLabel(playerToString(player1, player2));
        ArrayList<JComboBox> cbList = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            JComboBox cb = new JComboBox(games);
            matchModifying.add(cb);
            cbList.add(cb);
        }
        
        System.out.println(cbList);
        
        JButton confirm = new JButton("Valider");
        confirm.addActionListener(actionEvent -> {
            setMatchScore(m, cbList);
        });
        
        matchModifying.setLayout(new FlowLayout());
        matchModifying.add(title);
        matchModifying.add(confirm);
    }
    
    private void setMatchScore(Match m, ArrayList<JComboBox> cbList) {
        int i = 0;
        int notNullPlayer1 = 0;
        int notNullPlayer2 = 0;
        
        boolean lock1 = false;
        boolean lock2 = false;
        boolean good = true;
        boolean isNull = false;
        
        ArrayList<Integer> scoreListPlayer1 = new ArrayList();
        ArrayList<Integer> scoreListPlayer2 = new ArrayList();
        Map<Player, ArrayList<Integer>> newScore = new HashMap();
        
        Player p1 = m.getJoueur(0);
        Player p2 = m.getJoueur(1);
        
        // pas valide : null -> valeur, nombre de valeurs non nulles égales
        for (i = 0; i < cbList.size(); i++) {
            System.out.println("a");
            JComboBox cb = cbList.get(i);
            System.out.println(cb.getSelectedItem());
            if (i <= 4 && cb.getSelectedItem() != null && !lock1) {
                notNullPlayer1++;
                scoreListPlayer1.add(Integer.parseInt(cb.getSelectedItem().toString()));
            } else if (i >= 5 && cb.getSelectedItem() != null && !lock2) {
                notNullPlayer2++;
                scoreListPlayer2.add(Integer.parseInt(cb.getSelectedItem().toString()));
            } else if (i <= 4 && cb.getSelectedItem() == null) {
                lock1 = true;
            } else if (i >= 5 && cb.getSelectedItem() == null) {
                lock2 = true;
            } else if (cb.getSelectedItem() != null && (lock1 || lock2)) {
                System.err.println("ERROR!\n");
                good = false;
            }
        }
        
        System.out.println(notNullPlayer1 + " " + notNullPlayer2);
        
        if (notNullPlayer1 != notNullPlayer2) {
            good = false;
        } else if (good) {
            System.out.println("je rentre");
            newScore.put(p1, scoreListPlayer1);
            newScore.put(p2, scoreListPlayer2);
            m.setScore(newScore);
            System.out.println(m.getScore());
            m.VerifierScoreMatch();
            DBDataFactory.updateScore(m);
        }
    }
    
    private String playerToString(Player p1, Player p2) {
        String matchName = p1.getFirstName() + " " + p1.getLastName() + " - " +
                p2.getFirstName() + " " + p2.getLastName();
        return matchName;
    }

    public static void main(String[] args) {
        MatchsView a1 = new MatchsView();
    }
}