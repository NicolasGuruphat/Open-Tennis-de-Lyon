/***********************************************************************
 * Module:  Arbitre.java
 * Author:  p2007545
 * Purpose: Defines the Class Arbitre
 ***********************************************************************/

package metier;

import java.util.*;

public class Arbitre extends Participant {
   private int id;
   private String type;
   
   protected void finalize() {
      // TODO: implement
   }
   
   public java.util.Collection<Match> listeMatchs;
   
   public int getId() {
      return id;
   }
   
   /** @param newId */
   public void setId(int newId) {
      id = newId;
   }
   
   public String getType() {
      return type;
   }
   
   /** @param newId */
   public void setType(String newType) {
      type = newType;
   }
   
   public Arbitre() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Match> getArbitre() {
      if (listeMatchs == null)
         listeMatchs = new java.util.HashSet<Match>();
      return listeMatchs;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorArbitre() {
      if (listeMatchs == null)
         listeMatchs = new java.util.HashSet<Match>();
      return listeMatchs.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newArbitre */
   public void setArbitre(java.util.Collection<Match> newArbitre) {
      removeAllArbitre();
      for (java.util.Iterator iter = newArbitre.iterator(); iter.hasNext();)
         addArbitre((Match)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMatch */
   public void addArbitre(Match newMatch) {
      if (newMatch == null)
         return;
      if (this.listeMatchs == null)
         this.listeMatchs = new java.util.HashSet<Match>();
      if (!this.listeMatchs.contains(newMatch))
         this.listeMatchs.add(newMatch);
   }
   
   /** @pdGenerated default remove
     * @param oldMatch */
   public void removeArbitre(Match oldMatch) {
      if (oldMatch == null)
         return;
      if (this.listeMatchs != null)
         if (this.listeMatchs.contains(oldMatch))
            this.listeMatchs.remove(oldMatch);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllArbitre() {
      if (listeMatchs != null)
         listeMatchs.clear();
   }

}