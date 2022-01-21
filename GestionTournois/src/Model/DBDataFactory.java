/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import Controller.Match;
import Controller.Joueur;
import java.util.*;


/**
 *
 * @author nicog
 */
public class DBDataFactory {
static Connection connection = ConnectionFactory.createConnection();
    
    public static void createMatch(Match match)
    {
        try{
            Statement stm = connection.createStatement();
            stm.execute("SET FOREIGN_KEY_CHECKS=0");
            stm.close();
            PreparedStatement pstm = connection.prepareStatement("insert  into `Match` values (?,?,?,?,?)");
            pstm.setInt(1,0);
            pstm.setString(2,"simple");
            pstm.setInt(3,match.getTour());
            pstm.setInt(4,match.getHoraire().getId());
            pstm.setInt(5,match.getTerrain().getId());
            pstm.execute();
            pstm.close();
            for(Map.Entry<Joueur, ArrayList<Integer>> entry : match.getScore().entrySet()) {
                Joueur joueur = entry.getKey();
                ArrayList<Integer> score = entry.getValue();
                pstm = connection.prepareStatement("insert into `ListeJoueurs` values (?,?,?,?,?,?,?,?)");
                pstm.setInt(1,joueur.getId());
                pstm.setInt(2,match.getId());
                pstm.setBoolean(3,false);
                for(int i=0;i<score.size();i++){
                    pstm.setInt(4+i, score.get(i));
                }
                pstm.execute();
                System.out.println("match ajouté à la BDD");
                pstm.close();
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
