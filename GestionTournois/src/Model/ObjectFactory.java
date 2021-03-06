/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.*;

import java.sql.*;
import java.time.LocalTime;

/**
 *
 * @author elartic
 */
public class ObjectFactory {
    private static Connection connection;
    
    public static void createPlayers() {
        connection = ConnectionFactory.createConnection();
        Player.initializePlayerList();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Joueur");
            while (rs.next()) {
                int id = rs.getInt("idJoueur");
                String lastName = rs.getString("nom");
                String firstName = rs.getString("prenom");
                Date birthDate = rs.getDate("dateNaissance");
                String nationality = rs.getString("nationalite");
                Player player = new Player(id, lastName, firstName, birthDate,
                            nationality);
                Player.addPlayer(player);
            }
            rs.close();
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error!\n" + e);
        }
    }
    
    public static void createReferee() {
        connection = ConnectionFactory.createConnection();
        Referee.initRefereeList();
        try {
            Statement stmt = connection.createStatement();
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
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error!\n" + e);
        }
    }
    
    public static void createBallPicker() {
        connection = ConnectionFactory.createConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from RamasseurBalles");
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
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error!\n" + e);
        }
    }
    
    public static void createSchedule() {
        connection = ConnectionFactory.createConnection();
        Horaire.initListeHoraire();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Horaire");
            while (rs.next()) {
                int id = rs.getInt("idHoraire");
                Date date = rs.getDate("date");
                LocalTime start = rs.getTime("heureDebut").toLocalTime();
                LocalTime end = rs.getTime("heureFin").toLocalTime();
                Horaire.addHoraire(new Horaire(id, date, start, end));
            }
            rs.close();
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error!\n" + e);
        }
    }
    
    public static void createCourt() {
        connection = ConnectionFactory.createConnection();
        Terrain.initListeTerrain();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Terrain");
            while (rs.next()) {
                int id = rs.getInt("idTerrain");
                String name = rs.getString("nom");
                String courtType = rs.getString("typeTerrain");
                Terrain.addTerrain(new Terrain(id, name, courtType));
            }
                rs.close();
                stmt.close();
                connection.close();
        } catch (SQLException e) {
            System.err.println("Error!\n" + e);
        }
    }
}
