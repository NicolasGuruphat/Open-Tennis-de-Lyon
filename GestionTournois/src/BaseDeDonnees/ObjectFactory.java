/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDeDonnees;
import java.util.ArrayList;
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
            ResultSet rslt = stm.executeQuery("select * from joueur"); 
            while(rslt.next()){
                int id=rslt.getInt("ID");
                String nom = rslt.getString("Nom");
                String prenom = rslt.getString("Prenom");
                String nationalite = rslt.getString("Nationalite");
                Joueur joueur = new Joueur(id,nom,prenom,nationalite);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        //Joueur.printAll();
    }
    
    public static void createArbitres()
    {
        try{
            Statement stm = connection.createStatement();
            ResultSet rslt = stm.executeQuery("select * from arbitre"); 
            while(rslt.next()){
                int id=rslt.getInt("ID");
                String nom = rslt.getString("Nom");
                String prenom = rslt.getString("Prenom");
                String nationalite = rslt.getString("Nationalite");
                Arbitre arbitre = new Arbitre(id,nom,prenom,nationalite);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        Arbitre.printAll();
    }
    
    
}
