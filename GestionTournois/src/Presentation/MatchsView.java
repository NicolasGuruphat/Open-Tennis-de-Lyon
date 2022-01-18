package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatchsView {
    private JFrame choixTour = new JFrame();
    private JFrame listeMatchs = new JFrame();
    private JLabel listTitle;

    public MatchsView() {
        initComponents();
    }

    private void initComponents() {
        JPanel mainPanel = new JPanel();

        frameInit(choixTour, new Dimension(700, 200));
        choixTour.setContentPane(mainPanel);
        choixTour.setVisible(true);

        JButton firstRound = new JButton("1er Tour");
        firstRound.addActionListener(actionEvent -> {
            listTitle = new JLabel("Matchs du premier tour");
            newWindow();
        });
        JButton secondRound = new JButton("2ème Tour");
        secondRound.addActionListener(actionEvent -> {
            listTitle = new JLabel("Matchs du second tour");
            newWindow();
        });
        JButton quarterFinal = new JButton("Quarts de finale");
        secondRound.addActionListener(actionEvent -> {
            listTitle = new JLabel("Matchs des quarts de finale");
            newWindow();
        });
        JButton semiFinal = new JButton("Demi-finale");
        semiFinal.addActionListener(actionEvent -> {
            listTitle = new JLabel("Matchs de demi-finale");
            newWindow();
        });
        JButton finalRound = new JButton("Finale");
        finalRound.addActionListener(actionEvent -> {
            listTitle = new JLabel("Finale");
            newWindow();
        });

        mainPanel.add(firstRound);
        mainPanel.add(secondRound);
        mainPanel.add(quarterFinal);
        mainPanel.add(semiFinal);
        mainPanel.add(finalRound);
    }

    private void newWindow() {
        frameInit(listeMatchs, new Dimension(600, 800));
        listeMatchs.setVisible(true);
        choixTour.setVisible(false);

        listeMatchs.add(listTitle);
        JButton back = new JButton("Retour");
        back.addActionListener(actionEvent -> {
            listeMatchs.setVisible(false);
            choixTour.setVisible(true);
        });

        listeMatchs.add(back);

        listeMatchs.setLayout(new BoxLayout(listeMatchs.getContentPane(), BoxLayout.PAGE_AXIS));
    }

    private void frameInit(JFrame frame, Dimension dimension) {
        frame.setTitle("Outil de gestion des plannings");
        frame.setSize(dimension);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MatchsView a1 = new MatchsView();
    }
}
