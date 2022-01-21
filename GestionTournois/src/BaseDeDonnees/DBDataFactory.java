/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDeDonnees;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import metier.Match;
import metier.Joueur;
/**
 *
 * @author nicog
 */
public class DBDataFactory {
static Connection connection = ConnectionFactory.createConnection();
    
    public static void createMatch(Match match)
    {
        try{
            PreparedStatement pstm = connection.prepareStatement("insert  into `Match` values (? ? ? ? ?)");
            pstm.setString(2,"simple");
            pstm.setInt(3,match.getTour());
            pstm.setInt(4,match.getHoraire().getId());
            pstm.setInt(5,match.getTerrain().getId());
               
            pstm.close();
             
            for(Joueur joueur in match.getScore()){
                pstm = connection.prepareStatement("insert into `listeJoueur` values (?,?,?,?,?)");
                pstm.setInt(1,joueur.getId());
                pstm.setInt(2,match.getId());
                pstm.setBoolean(3,match.result);
                int i =0;
                for(int score in ){
                    pstm.setInt(3,value[i]);
                    i++
                
                pstm.close();
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
