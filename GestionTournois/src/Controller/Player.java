/***********************************************************************
 * Module:  Joueur.java
 * Author:  p2007545
 * Purpose: Defines the Class Joueur
 ***********************************************************************/

package Controller;

import java.sql.Date;
import java.util.ArrayList;

public class Player extends Attendant {
   private static ArrayList<Player> playerList;

    public Player(int id, String lastName, String firstName, Date birthDate, 
            String nationality) {
        super(id, lastName, firstName, birthDate, nationality);
    }
    
    public void reserverCourt() {
        // TODO: implement
    }
   
    public void supprimerReservation() {
        // TODO: implement
    }

    
    public static ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public static void setPlayerList(ArrayList<Player> playerList) {
        Player.playerList = playerList;
    }
    
    public static void addPlayer(Player player) {
        playerList.add(player);
    }
    
    public static void initializePlayerList() {
        playerList = new ArrayList();
    }
    
    public static void printAll(){
        System.out.println("print all");        
        
        for (int i = 0; i < playerList.size() ; i++)
            {
            System.out.println(playerList.get(i).getId());
            }
    }
}