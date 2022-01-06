/***********************************************************************
 * Module:  Arbitre.java
 * Author:  p2007545
 * Purpose: Defines the Class Arbitre
 ***********************************************************************/

package metier;

import java.util.*;

public class Arbitre extends Participant {
   private int id;
   
   protected void finalize() {
      // TODO: implement
   }
   
   public java.util.Collection<Match> arbitre;
   
   public int getId() {
      return id;
   }
   
   /** @param newId */
   public void setId(int newId) {
      id = newId;
   }
   
   public Arbitre() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Match> getArbitre() {
      if (arbitre == null)
         arbitre = new java.util.HashSet<Match>();
      return arbitre;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorArbitre() {
      if (arbitre == null)
         arbitre = new java.util.HashSet<Match>();
      return arbitre.iterator();
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
      if (this.arbitre == null)
         this.arbitre = new java.util.HashSet<Match>();
      if (!this.arbitre.contains(newMatch))
         this.arbitre.add(newMatch);
   }
   
   /** @pdGenerated default remove
     * @param oldMatch */
   public void removeArbitre(Match oldMatch) {
      if (oldMatch == null)
         return;
      if (this.arbitre != null)
         if (this.arbitre.contains(oldMatch))
            this.arbitre.remove(oldMatch);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllArbitre() {
      if (arbitre != null)
         arbitre.clear();
   }

}