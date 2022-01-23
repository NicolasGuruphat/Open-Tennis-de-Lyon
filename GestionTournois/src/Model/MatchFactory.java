/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.sql.*;
import Controller.*;
import Exceptions.*;

/**
 *
 * @author elartic
 */
public class MatchFactory {
    private static Connection connection;
    
    private static Terrain setMatchCourt(int courtId) 
            throws NoCourtException {
        ObjectFactory.createCourt();
        Terrain matchCourt = null;
        for (Terrain court : Terrain.getListeTerrain()) {
            if (court.getId() == courtId) {
                matchCourt = court;
            }
        }
        
        if (matchCourt == null) {
            throw new NoCourtException("No Court object with id " + 
                    Integer.toString(courtId));
        }
        
        return matchCourt;
    }
    
    private static Horaire setMatchSchedule(int scheduleId) 
            throws NoScheduleException {
        ObjectFactory.createSchedule();
        Horaire matchSchedule = null;
        
        for (Horaire schedule : Horaire.getListeHoraire()) {
            if (schedule.getId() == scheduleId) {
                matchSchedule = schedule;
            }
        }
        
        if (matchSchedule == null) {
            throw new NoScheduleException("no Schedule object with id " +
                    Integer.toString(scheduleId));
        }
        
        return matchSchedule;
    }
    
//    public static Match setFollowingMatch(int matchId, Connection connection) {
//        String query = "select * from `Match` where idMatchSuivant = ?";
//        Match match = null;
//        try {
//            PreparedStatement stmt = connection.prepareStatement(query);
//            stmt.setInt(1, matchId);
//            ResultSet rs = stmt.executeQuery();
//            
//        } catch (SQLException e) {
//            System.err.println("ERROR!\n" + e);
//        }
//    }
    
    private static void setMatchPlayers(Match match, Connection connection) {
        ObjectFactory.createPlayers();
        
        String query = "select * from ListeJoueurs where idMatch = " +
                Integer.toString(match.getId());
        
        int playerId1 = -1;
        int playerId2 = -1;
        
        Player player1 = null;
        Player player2 = null;
        
        ArrayList<Integer> setsPlayer1 = new ArrayList<>();
        ArrayList<Integer> setsPlayer2 = new ArrayList<>();
        
        Map<Player, ArrayList<Integer>> score = new HashMap<>();
        
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                if (playerId1 == -1 && playerId2 == -1) {
                    playerId1 = rs.getInt("idJoueur");
                    setsPlayer1.add(rs.getInt("set1"));
                    setsPlayer1.add(rs.getInt("set2"));
                    setsPlayer1.add(rs.getInt("set3"));
                    setsPlayer1.add(rs.getInt("set4"));
                    setsPlayer1.add(rs.getInt("set5"));
                } else if (playerId1 != -1 && playerId2 == -1) {
                    playerId2 = rs.getInt("idJoueur");
                    setsPlayer2.add(rs.getInt("set1"));
                    setsPlayer2.add(rs.getInt("set2"));
                    setsPlayer2.add(rs.getInt("set3"));
                    setsPlayer2.add(rs.getInt("set4"));
                    setsPlayer2.add(rs.getInt("set5"));
                } else {
                    System.err.println("ERROR!\n");
                }
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("ERROR!\n" + e);
        }
        
        for (Player player : Player.getPlayerList()) {
            if (player1 == null && 
                    player2 == null &&
                    player.getId() == playerId1) {
                player1 = player;
            } else if (player1 != null &&
                    player2 == null &&
                    player.getId() == playerId2) {
                player2 = player;
            }
        }
        
        score.put(player1, setsPlayer1);
        score.put(player2, setsPlayer2);
        
        match.setScore(score);
    }
    
    private static void setMatchReferees(Match match, Connection connection) {
        ObjectFactory.createReferee();
        
        String query = "select * from ListeArbitre where idMatch = " +
                Integer.toString(match.getId());
        
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                int id = rs.getInt("idArbitre");
                for (Referee referee : Referee.getRefereeList()) {
                    if (id == referee.getId()) {
                        match.getArbitre().add(referee);
                    }
                }
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("ERROR!\n" + e);
        }
    }
    
    public static void setMatchBallPickers(Match match, Connection connection) {
        ObjectFactory.createBallPicker();
        
        String query = "select * from ListeRamasseurs where idMatch = " +
                Integer.toString(match.getId());
        
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                int id = rs.getInt("idRamasseur");
                for (RamasseurBalle ballPicker : RamasseurBalle.getBallPickerList()) {
                    if (id == ballPicker.getId()) {
                        match.getBallPickerTeam().add(ballPicker);
                    }
                }
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("ERROR!\n" + e);
        }
    }
    
    public static void setFollowingMatch(Connection connection) {
        ArrayList<Match> matchList = Match.getListeMatch();
        try {
            for (Match m : Match.getListeMatch()) {
                int i = 0;
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(
                        "select idMatchSuivant from `Match` where idMatch = "
                                + Integer.toString(m.getId()));
                rs.next();
                Match match = null;
                do {
                    match = matchList.get(i);
                    if (rs.getInt("idMatchSuivant") == match.getId()) {
                        m.setFils(match);
                    }
                    i++;
                } while (rs.getInt("idMatchSuivant") != match.getId() &&
                        i != matchList.size());
            }
        } catch (SQLException e) {
            System.err.println("ERROR!\n" + e);
        }
        
    }
    
    public static void createMatch() {
        connection = ConnectionFactory.createConnection();
        Match.initListeMatch();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from `Match`");
            while (rs.next()) {
                // We get all attributes from Match table
                int matchId = rs.getInt("idMatch");
                int round = rs.getInt("tour");
                int scheduleId = rs.getInt("idHoraire");
                int courtId = rs.getInt("idTerrain");
                int following = rs.getInt("idMatchSuivant");
                
                /*
                We now need to get the schedule and court to create the Match
                object that we'll use to get the other informations.
                */
                Terrain court = setMatchCourt(courtId);
                Horaire schedule = setMatchSchedule(scheduleId);
                
                // Creating Match object
                Match match = new Match(matchId, round, schedule, court);
                
                /*
                We now get the players linked to 
                the Match in the ListeJoueur table
                */
                setMatchPlayers(match, connection);
                
                /*
                We now add the referees to the match
                */
                setMatchReferees(match, connection);
                
                /*
                Finally we get the ball pickers
                */
                setMatchBallPickers(match, connection);
            }
            setFollowingMatch(connection);
            stmt.close();
            rs.close();
            connection.close();
        } catch (SQLException | NoCourtException | NoScheduleException e) {
            System.err.println("ERROR!\n" + e);
        }
        
    }
}