/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDeDonnees;

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
            ResultSet rslt = stm.executeQuery("select * from Joueurs"); 
            while(rslt.next()){
                int id=rslt.getInt("idJoueur");
                String nom = rslt.getString("Nom");
                String prenom = rslt.getString("Prenom");
                String nationalite = rslt.getString("Nationalite");
                Joueur joueur = new Joueur(null, null, id,nom,prenom,nationalite);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        Joueur.printAll();
    }
    
    public static void createArbitres()
    {
        try{
            Statement stm = connection.createStatement();
            ResultSet rslt = stm.executeQuery("select * from Arbitres"); 
            while(rslt.next()){
                int id=rslt.getInt("idArbitre");
                String nom = rslt.getString("Nom");
                String prenom = rslt.getString("Prenom");
                String nationalite = rslt.getString("Nationalite");
                String typeArbitre = rslt.getString("typeArbitre");
                Arbitre arbitre = new Arbitre(id,typeArbitre,null,nom,prenom,nationalite);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        Arbitre.printAll();
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
                Match match = new Match(id,tour,score,null);
            }            
        }catch(Exception e){
            System.out.println(e);
        }
        Arbitre.printAll();
    }
    
    
}
