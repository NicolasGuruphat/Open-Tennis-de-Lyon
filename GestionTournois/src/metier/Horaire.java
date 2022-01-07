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
   public java.util.Collection<Terrain> listeTerrainDispo;
   
   protected void finalize() {
      // TODO: implement
   }

   
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
   
   public java.util.Collection<Terrain> getListeTerrainDispo() {
      return listeTerrainDispo;
   }
   
   /** @param newTerrainDispo */
   public void setTerrainDispo(java.util.Collection<Terrain> newListeTerrainDispo) {
      listeTerrainDispo = newListeTerrainDispo;
   }
   
   /** @param date 
    * @param heureDebut 
    * @param heureFin 
    * @param terrainDispo */
   

    public Horaire(int id, Date date, Date heureDebut, Date heureFin, Collection<Terrain> listeTerrainDispo) {
        this.id = id;
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.listeTerrainDispo = listeTerrainDispo;
    }
   
   public int getId() {
      return id;
   }
   
   /** @param newId */
   public void setId(int newId) {
      id = newId;
   }

}