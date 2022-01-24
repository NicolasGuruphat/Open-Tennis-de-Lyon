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

import java.util.*;
import Controller.*;

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
            for(Map.Entry<Player, ArrayList<Integer>> entry : match.getScore().entrySet()) {
                Player joueur = entry.getKey();
                ArrayList<Integer> score = entry.getValue();
                pstm = connection.prepareStatement("insert into `ListeJoueurs` values (?,?,?,?,?,?,?)");
                pstm.setInt(1,joueur.getId());
                pstm.setInt(2,match.getId());
                for(int i=0;i<score.size();i++){
                    pstm.setInt(3+i, score.get(i));
                }
                pstm.execute();
                System.out.println("match ajouté à la BDD");
                pstm.close();
            }
            for(Referee arbitre : match.getArbitre()){
                pstm = connection.prepareStatement("insert into `ListeArbitre` values (?, ?)");
                pstm.setInt(1,arbitre.getId());
                pstm.setInt(2,match.getId());
                pstm.execute();
                pstm.close();
            }
            for(RamasseurBalle ramasseur : match.getBallPickerTeam()){
                pstm = connection.prepareStatement("insert into `ListeRamasseurs` values (?, ?)");
                pstm.setInt(1,ramasseur.getId());
                pstm.setInt(2, match.getId());
                pstm.execute();
                pstm.close();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void updateScore(Match match){
        try{
            for(Map.Entry<Player, ArrayList<Integer>> entry : match.getScore().entrySet()) {
                Player joueur = entry.getKey();
                ArrayList<Integer> score = entry.getValue();
                PreparedStatement pstm = connection.prepareStatement("update `ListeJoueurs set set1=(?) set2=(?) set3=(?) set4=(?) set5=(?) where idJoueur = (?) and idMatch = (?)");
                for(int i=1;i<score.size()+1;i++){
                    pstm.setInt(i, score.get(i));
                }
                pstm.setInt(7,match.getId());
                pstm.execute();
                System.out.println("match modifié");
                pstm.close();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
