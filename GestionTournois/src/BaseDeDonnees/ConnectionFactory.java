/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDeDonnees;
import java.sql.*;
/**
 *
 * @author nicog
 */
public class ConnectionFactory {
    
    static Connection connection;

    public static Connection getConnection(){
        return connection;
    }

    public static Connection createConnection(){
        try{
            connection = DriverManager.getConnection("jdbc:mariadb://iutdoua-web.univ-lyon1.fr/p2003245?user=p2003245&password=564094");
            connection.setAutoCommit(true);
        }
        catch(Exception e){
            System.out.println(e); 
        }
        return connection;
    }
}
