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
//   private LocalTime heureDebut;
//   private LocalTime heureFin;
   private Time heureDebut, heureFin;
   private static ArrayList<Horaire> listeHoraire = new ArrayList();

   protected void finalize() {
      // TODO: implement
   }

   
   /** @param date 
    * @param heureDebut 
    * @param heureFin 
    * @param listeHoraire */
   

    public Horaire(int id, Date date, Time heureDebut, Time heureFin) {
        this.id = id;
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        listeHoraire.add(this);
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
   
   public Time getHeureDebut() {
      return heureDebut;
   }
   
   /** @param newHeureDebut */
   public void setHeureDebut(Time newHeureDebut) {
      heureDebut = newHeureDebut;
   }
   
   public Time getHeureFin() {
      return heureFin;
   }
   
   /** @param newHeureFin */
   public void setHeureFin(Time newHeureFin) {
      heureFin = newHeureFin;
   }
   
   
   public static ArrayList<Horaire> getListeHoraire() {
        return listeHoraire;
    }

    public static void setListeHoraire(ArrayList<Horaire> listeHoraire) {
        Horaire.listeHoraire = listeHoraire;
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