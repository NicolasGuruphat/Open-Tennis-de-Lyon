/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.*;
import Controller.*;

/**
 *
 * @author elartic
 */
public class ObjectFactory {
    private static Connection connection;
    
    public static void createPlayers() {
        try {
            connection = ConnectionFactory.createConnection();
            try (Statement stmt = connection.createStatement()) {
                ResultSet rs = stmt.executeQuery("select * from Joueur");
                while (rs.next()) {
                    int id = rs.getInt("idJoueur");
                    String lastName = rs.getString("nom");
                    String firstName = rs.getString("prenom");
                    Date birthDate = rs.getDate("dateNaissance");
                    String nationality = rs.getString("nationalite");
                    new Player(id, lastName, firstName, birthDate,
                            nationality);
                }
                rs.close();
            }
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error!\n" + e);
        }
    }
    
    public static void createReferee() {
        try {
            connection = ConnectionFactory.createConnection();
            try (Statement stmt = connection.createStatement()) {
                ResultSet rs = stmt.executeQuery("select * from Arbitre");
                while (rs.next()) {
                    int id = rs.getInt("idArbitre");
                    String lastName = rs.getString("nom");
                    String firstName = rs.getString("prenom");
                    Date birthDate = rs.getDate("dateNaissance");
                    String nationality = rs.getString("nationalite");
                    String refereeType = rs.getString("typeArbitre");
                    new Referee(id, lastName, firstName, birthDate,
                            nationality, refereeType);
                }
                rs.close();
            }
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error!\n" + e);
        }
    }
    
    public static void createBallPicker() {
        try {
            connection = ConnectionFactory.createConnection();
            try (Statement stmt = connection.createStatement()) {
                ResultSet rs = stmt.executeQuery("select * from Arbitre");
                while (rs.next()) {
                    int id = rs.getInt("idRamasseur");
                    String lastName = rs.getString("nom");
                    String firstName = rs.getString("prenom");
                    Date birthDate = rs.getDate("dateNaissance");
                    String nationality = rs.getString("nationalite");
                    String club = rs.getString("club");
                    int team = rs.getInt("equipe");
                    new RamasseurBalle(id, lastName, firstName, birthDate, nationality, club, team, null);
                }
                rs.close();
            }
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error!\n" + e);
        }
    }
    
    public static void createSchedule() {
        try {
            connection = ConnectionFactory.createConnection();
            try (Statement stmt = connection.createStatement()) {
                ResultSet rs = stmt.executeQuery("select * from Horaire");
                while (rs.next()) {
                    int id = rs.getInt("idHoraire");
                    Date date = rs.getDate("date");
                    Time start = rs.getTime("heureDebut");
                    Time end = rs.getTime("heureFin");
                    new Horaire(id, date, start, end);
                }
                rs.close();
            }
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error!\n" + e);
        }
    }
    
    public static void createCourt() {
        try {
            connection = ConnectionFactory.createConnection();
            try (Statement stmt = connection.createStatement()) {
                ResultSet rs = stmt.executeQuery("select * from Terrain");
                while (rs.next()) {
                    int id = rs.getInt("idTerrain");
                    String name = rs.getString("nom");
                    String courtType = rs.getString("typeTerrain");
                    new Terrain(id, name, courtType);
                }
                rs.close();
            }
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error!\n" + e);
        }
    }
}
