/***********************************************************************
 * Module:  Arbitre.java
 * Author:  p2007545
 * Purpose: Defines the Class Arbitre
 ***********************************************************************/

package metier;

import java.util.*;

public class Arbitre extends Participant {
    
   private String type;
   
   protected void finalize() {
      // TODO: implement
   }
   
   public java.util.Collection<Match> listeMatchs;
   
   
   public String getType() {
      return type;
   }
   
   /** @param newId */
   public void setType(String newType) {
      type = newType;
   }
   
    public Arbitre(String type, Collection<Match> listeMatchs, String nom, String prenom, String nationnalite) {
        super(nom, prenom, nationnalite);
        this.type = type;
        this.listeMatchs = listeMatchs;
    }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Match> getListeMatchs() {
      if (listeMatchs == null)
         listeMatchs = new java.util.HashSet<Match>();
      return listeMatchs;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorListeMatchs() {
      if (listeMatchs == null)
         listeMatchs = new java.util.HashSet<Match>();
      return listeMatchs.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newArbitre */
   public void setListeMatchs(java.util.Collection<Match> newListeMatchs) {
      removeAllMatch();
      for (java.util.Iterator iter = newListeMatchs.iterator(); iter.hasNext();)
         addMatch((Match)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMatch */
   public void addMatch(Match newMatch) {
      if (newMatch == null)
         return;
      if (this.listeMatchs == null)
         this.listeMatchs = new java.util.HashSet<Match>();
      if (!this.listeMatchs.contains(newMatch))
         this.listeMatchs.add(newMatch);
   }
   
   /** @pdGenerated default remove
     * @param oldMatch */
   public void removeMatch(Match oldMatch) {
      if (oldMatch == null)
         return;
      if (this.listeMatchs != null)
         if (this.listeMatchs.contains(oldMatch))
            this.listeMatchs.remove(oldMatch);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMatch() {
      if (listeMatchs != null)
         listeMatchs.clear();
   }

}