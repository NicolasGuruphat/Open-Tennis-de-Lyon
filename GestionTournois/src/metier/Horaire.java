/***********************************************************************
 * Module:  Horaire.java
 * Author:  p2007545
 * Purpose: Defines the Class Horaire
 ***********************************************************************/

package metier;

import java.util.*;

public class Horaire {
   private int id;
   private Date date;
   private Date heureDebut;
   private Date heureFin;
   private Terrain[] terrainDispo;
   
   protected void finalize() {
      // TODO: implement
   }
   
   public java.util.Collection association5;
   
   public Date getDate() {
      return date;
   }
   
   /** @param newDate */
   public void setDate(Date newDate) {
      date = newDate;
   }
   
   public Date getHeureDebut() {
      return heureDebut;
   }
   
   /** @param newHeureDebut */
   public void setHeureDebut(Date newHeureDebut) {
      heureDebut = newHeureDebut;
   }
   
   public Date getHeureFin() {
      return heureFin;
   }
   
   /** @param newHeureFin */
   public void setHeureFin(Date newHeureFin) {
      heureFin = newHeureFin;
   }
   
   public Terrain[] getTerrainDispo() {
      return terrainDispo;
   }
   
   /** @param newTerrainDispo */
   public void setTerrainDispo(Terrain[] newTerrainDispo) {
      terrainDispo = newTerrainDispo;
   }
   
   /** @param date 
    * @param heureDebut 
    * @param heureFin 
    * @param terrainDispo */
   public Horaire(Date date, Date heureDebut, Date heureFin, Terrain[] terrainDispo) {
      // TODO: implement
   }
   
   public int getId() {
      return id;
   }
   
   /** @param newId */
   public void setId(int newId) {
      id = newId;
   }

}