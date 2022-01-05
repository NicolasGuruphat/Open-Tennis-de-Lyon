/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiontournois;

import java.sql.SQLException;

import java.sql.*;
//import com.mysql.jdbc.Driver;
/**
 *
 * @author nicog
 */
public class GestionTournois {

    /**
     * 
     * @param args the command line arguments
     */
    static Connection connection;
    public static void main(String[] args) {
        
        getConnexion();
        try{
            Statement stm = connection.createStatement();
            ResultSet rslt = stm.executeQuery("select * from arbitre"); 
            
            while(rslt.next()){
                int id=rslt.getInt("ID");
                System.out.println(id);
            }
        }
        catch(Exception e){
            System.out.println(e); 
        }
    }
    public static void getConnexion(){
        
        try{
            connection = DriverManager.getConnection("jdbc:mariadb://iutdoua-web.univ-lyon1.fr/p2003245?user=p2003245&password=564094");
            connection.setAutoCommit(true);
        }
        catch(Exception e){
            System.out.println(e); 
        }
    }
}
