/***********************************************************************
 * Module:  Horaire.java
 * Author:  p2007545
 * Purpose: Defines the Class Horaire
 ***********************************************************************/

package Controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.time.*;


public class Horaire {
    private int id;
    private Date date;
    private LocalTime heureDebut, heureFin;
    private static ArrayList<Horaire> listeHoraire;

   protected void finalize() {
      // TODO: implement
   }

   
   /** @param date 
    * @param heureDebut 
    * @param heureFin 
    * @param listeHoraire */
   

    public Horaire(int id, Date date, LocalTime heureDebut, LocalTime heureFin) {
        this.id = id;
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }
    
    public int getId() {
        return id;
    }
   
    /** @param newId */
    public void setId(int newId) {
       id = newId;
    }
   
    public Date getDate() {
       return date;
    }
   
    /** @param newDate */
    public void setDate(Date newDate) {
       date = newDate;
    }
   
    public LocalTime getHeureDebut() {
       return heureDebut;
    }
   
    /** @param newHeureDebut */
    public void setHeureDebut(LocalTime newHeureDebut) {
       heureDebut = newHeureDebut;
    }
   
    public LocalTime getHeureFin() {
       return heureFin;
    }
   
    /** @param newHeureFin */
    public void setHeureFin(LocalTime newHeureFin) {
       heureFin = newHeureFin;
    }
   
   
    public static ArrayList<Horaire> getListeHoraire() {
         return listeHoraire;
    }

    public static void setListeHoraire(ArrayList<Horaire> listeHoraire) {
        Horaire.listeHoraire = listeHoraire;
    }
    
    public static void initListeHoraire() {
        listeHoraire = new ArrayList<>();
    }
    
    public static void addHoraire(Horaire horaire) {
        listeHoraire.add(horaire);
    }
    
    public static void printAll(){
        System.out.println("printAll terrain");

        for (int i = 0; i < listeHoraire.size() ; i++)
            {
            System.out.println(listeHoraire.get(i).getId());
            }
        }

    @Override
    public String toString() {
        return "Horaire{" + "id=" + id + 
                ", date=" + date + 
                ", heureDebut=" + heureDebut + 
                ", heureFin=" + heureFin + '}';
    }
    
    
}