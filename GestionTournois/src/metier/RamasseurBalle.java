/***********************************************************************
 * Module:  RamasseurBalle.java
 * Author:  p2007545
 * Purpose: Defines the Class RamasseurBalle
 ***********************************************************************/

package metier;

import java.util.*;

public class RamasseurBalle extends Participant {
   private int id;
   private String club;
   
   protected void finalize() {
      // TODO: implement
   }
   
   public java.util.Collection<Match> estAssigneA;
   
   public String getClub() {
      return club;
   }
   
   /** @param newClub */
   public void setClub(String newClub) {
      club = newClub;
   }
   
   /** @param club */
   public RamasseurBalle(String club) {
      // TODO: implement
   }
   
   public int getId() {
      return id;
   }
   
   /** @param newId */
   public void setId(int newId) {
      id = newId;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Match> getEstAssigneA() {
      if (estAssigneA == null)
         estAssigneA = new java.util.HashSet<Match>();
      return estAssigneA;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEstAssigneA() {
      if (estAssigneA == null)
         estAssigneA = new java.util.HashSet<Match>();
      return estAssigneA.iterator();
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
      if (this.estAssigneA == null)
         this.estAssigneA = new java.util.HashSet<Match>();
      if (!this.estAssigneA.contains(newMatch))
         this.estAssigneA.add(newMatch);
   }
   
   /** @pdGenerated default remove
     * @param oldMatch */
   public void removeEstAssigneA(Match oldMatch) {
      if (oldMatch == null)
         return;
      if (this.estAssigneA != null)
         if (this.estAssigneA.contains(oldMatch))
            this.estAssigneA.remove(oldMatch);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEstAssigneA() {
      if (estAssigneA != null)
         estAssigneA.clear();
   }

}