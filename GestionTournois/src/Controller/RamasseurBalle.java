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
    public Collection<Match> matchsList;
    private static ArrayList<RamasseurBalle> ballPickerList = new ArrayList();
   
    protected void finalize() {
        // TODO: implement
    }
   
    public java.util.Collection<Match> listeMatchs;
   
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
        this.matchsList = matchsList;
        ballPickerList.add(this);
    }
   
   /** @pdGenerated default getter */
   public java.util.Collection<Match> getEstAssigneA() {
      if (listeMatchs == null)
         listeMatchs = new java.util.HashSet<Match>();
      return listeMatchs;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEstAssigneA() {
      if (listeMatchs == null)
         listeMatchs = new java.util.HashSet<Match>();
      return listeMatchs.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEstAssigneA */
   public void setEstAssigneA(java.util.Collection<Match> newEstAssigneA) {
      removeAllEstAssigneA();
      for (java.util.Iterator iter = newEstAssigneA.iterator(); iter.hasNext();)
         addEstAssigneA((Match)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMatch */
   public void addEstAssigneA(Match newMatch) {
      if (newMatch == null)
         return;
      if (this.listeMatchs == null)
         this.listeMatchs = new java.util.HashSet<Match>();
      if (!this.listeMatchs.contains(newMatch))
         this.listeMatchs.add(newMatch);
   }
   
   /** @pdGenerated default remove
     * @param oldMatch */
   public void removeEstAssigneA(Match oldMatch) {
      if (oldMatch == null)
         return;
      if (this.listeMatchs != null)
         if (this.listeMatchs.contains(oldMatch))
            this.listeMatchs.remove(oldMatch);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEstAssigneA() {
      if (listeMatchs != null)
         listeMatchs.clear();
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