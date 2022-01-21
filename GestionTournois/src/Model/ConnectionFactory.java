/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author nicog
 */
public class ConnectionFactory {
    
    static Connection connection;
    static ArrayList<Connection> listeConnection = new ArrayList();
    public static Connection getConnection(){
        return connection;
    }

    public static Connection createConnection(){
        try{
            connection = DriverManager.getConnection("jdbc:mariadb://iutdoua-web.univ-lyon1.fr/p2003245?user=p2003245&password=564094");
            connection.setAutoCommit(true);
            listeConnection.add(connection);
        }
        catch(Exception e){
            System.out.println(e); 
        }
        return connection;
    }
    public static void closeAllConnection(){
        for(int i =0;i<listeConnection.size();i++){
            try{
                listeConnection.get(i).close();}
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
