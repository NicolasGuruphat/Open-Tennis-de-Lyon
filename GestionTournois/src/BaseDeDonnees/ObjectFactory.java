/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDeDonnees;

import java.util.Date;
import java.time.*;

import metier.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.sql.*;
/**
 *
 * @author nicog
 */
public class ObjectFactory {
    
    static Connection connection = ConnectionFactory.createConnection();
    
    public static void createJoueurs()
    {
        try{
            Statement stm = connection.createStatement();
            ResultSet rslt = stm.executeQuery("select * from Joueur"); 
            while(rslt.next()){
                int id=rslt.getInt("idJoueur");
                String nom = rslt.getString("Nom");
                String prenom = rslt.getString("Prenom");
                String nationalite = rslt.getString("Nationalite");
                Joueur joueur = new Joueur(id,nom,prenom,nationalite);
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
    
    public static void createArbitres()
    {
        try{
            Statement stm = connection.createStatement();
            ResultSet rslt = stm.executeQuery("select * from Arbitre"); 
            while(rslt.next()){
                int id=rslt.getInt("idArbitre");
                String nom = rslt.getString("Nom");
                String prenom = rslt.getString("Prenom");
                String nationalite = rslt.getString("Nationalite");
                String typeArbitre = rslt.getString("typeArbitre");
                new Arbitre(id,typeArbitre,nom,prenom,nationalite);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void createMatchs()
    {
        int idJoueur;
        try{
            Statement stm = connection.createStatement();
            ResultSet rslt = stm.executeQuery("select * from matchs"); 
            while(rslt.next()){
                int id=rslt.getInt("idMatch");
                ResultSet rsltListeJoueurs = stm.executeQuery("select * from listejoueurs"); 
                int idWinner=rslt.getInt("idWinner");
                String typeMatch = rslt.getString("typeMatch");
                int tour = rslt.getInt("tour");
                String scoreString = rslt.getString("score");
                String[] parts = scoreString.split("-");
                int part1 = Integer.parseInt(parts[0]); 
                int part2 = Integer.parseInt(parts[1]);
                Map<Integer,Integer> score = new HashMap<Integer,Integer>();
                while(rslt.next()){
                    if(rslt.getInt("match")==id){
                        idJoueur=rsltListeJoueurs.getInt("idJoueur");
                        if(idJoueur==idWinner){
                            score.put(idJoueur,part1);
                        }
                        else{
                            score.put(idJoueur,part2);
                        }
                    }
                }
                //int
                //new Match(id,tour,score,null);
            }            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void createHoraires()
    {
        try{
            Statement stm = connection.createStatement();
            ResultSet rslt = stm.executeQuery("select * from Horaire");
            while(rslt.next()){
                int idHoraire=rslt.getInt("idHoraire");
                Date date = rslt.getDate("date");
                Time heureDebut = rslt.getTime("heureDebut");
                Time heureFin = rslt.getTime("heureFin");
                
                https://howtodoinjava.com/java/date-time/localtime-to-sql-time/
                new Horaire(idHoraire, date, heureDebut.toLocalTime(), heureFin.toLocalTime() );
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void createTerrains()
    {
        try{
            Statement stm = connection.createStatement();
            ResultSet rslt = stm.executeQuery("select * from Terrain");
            while(rslt.next()){
                int idTerrain=rslt.getInt("idTerrain");
                String nom = rslt.getString("nom");
                String typeTerrain = rslt.getString("typeTerrain");
                
                new Terrain(idTerrain, nom, typeTerrain);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    
}
