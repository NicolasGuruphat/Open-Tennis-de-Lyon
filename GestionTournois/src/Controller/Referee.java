/***********************************************************************
 * Module:  Arbitre.java
 * Author:  p2007545
 * Purpose: Defines the Class Arbitre
 ***********************************************************************/

package Controller;

import java.util.ArrayList;
import java.sql.Date;

public class Referee extends Attendant {
    private String refereeType;
    private static ArrayList<Referee> refereeList;
    ArrayList<Horaire> scheduleList = new ArrayList();
   
    protected void finalize() {
        // TODO: implement
    }

    public String getRefereeType() {
        return refereeType;
    }
   
    /** @param newId */
    public void setType(String newTypeArbitre) {
        refereeType = newTypeArbitre;
    }
   
    public static ArrayList<Referee> getRefereeList() {
        return refereeList;
    }

    public static void setRefereeList(ArrayList<Referee> listeArbitre) {
        Referee.refereeList = listeArbitre;
    }

    public ArrayList<Horaire> getListeHoraire() {
        return scheduleList;
    }

    public void setListeHoraire(ArrayList<Horaire> listeHoraire) {
        this.scheduleList = listeHoraire;
    }
    
    public static void initRefereeList() {
        refereeList = new ArrayList<>();
    }

   
    public Referee(int id, String lastName, String firstName, 
            Date birthDate, String nationality, String refereeType) {
        super(id, lastName, firstName, birthDate, nationality);
        this.refereeType = refereeType;

        refereeList.add(this);
    }
   
 
    public static void printAll(){
        System.out.println("print all");
        for(Referee arbitre : refereeList)
        {
            System.out.println(arbitre.id);
        }
    
    }

    @Override
    public String toString() {
        return "Referee{" + "refereeType=" + refereeType + 
                ", scheduleList=" + scheduleList + 
                '}';
    }
}