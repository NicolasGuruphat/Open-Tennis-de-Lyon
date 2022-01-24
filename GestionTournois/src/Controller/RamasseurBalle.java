/***********************************************************************
 * Module:  RamasseurBalle.java
 * Author:  p2007545
 * Purpose: Defines the Class RamasseurBalle
 ***********************************************************************/

package Controller;

import java.util.Collection;
import java.sql.Date;
import java.util.ArrayList;

public class RamasseurBalle extends Attendant {
    private String club;
    private int team;
    private static ArrayList<RamasseurBalle> ballPickerList = new ArrayList();
   
    protected void finalize() {
        // TODO: implement
    }
   
    public String getClub() {
        return club;
    }
   
    /** @param newClub */
    public void setClub(String newClub) {
        club = newClub;
    }
    
    public RamasseurBalle(int id, String lastName, String firstName, 
            Date birthDate, String nationality, String club, int team,
            Collection<Match> matchsList) {
        super(id, lastName, firstName, birthDate, nationality);
        this.club = club;
        ballPickerList.add(this);
    }
   
   public static ArrayList<RamasseurBalle> getBallPickerList() {
       return ballPickerList;
   }
   
   public static void initBallPickerList() {
       ballPickerList = new ArrayList<>();
   }
   
   public static void addBallPicker(RamasseurBalle ballPicker) {
       ballPickerList.add(ballPicker);
   }
}