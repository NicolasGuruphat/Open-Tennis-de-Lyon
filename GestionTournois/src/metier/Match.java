/***********************************************************************
 * Module:  Match.java
 * Author:  p2007545
 * Purpose: Defines the Class Match
 ***********************************************************************/

package metier;

import java.util.*;

public class Match {
   private int id;
   private int tour;
   private Dictionary score;
   private static Match match;
   
   protected void finalize() {
      // TODO: implement
   }
   
   public java.util.Collection<Match> fils;
   
   public void modifier() {
      // TODO: implement
   }
   
   public void supprimer() {
      // TODO: implement
   }
   
   public void entrerScore() {
      // TODO: implement
   }
   
   public Match creerMatch() {
      // TODO: implement
      return null;
   }
   
   public int getId() {
      return id;
   }
   
   public Match getMatch() {
       return match;
   }
   
   /** @param newId */
   public void setId(int newId) {
      id = newId;
   }
   
   /** @param newMatch */
   public void setMatch(Match newMatch) {
      match = newMatch;
   }
   
   public int getTour() {
      return tour;
   }
   
   /** @param newTour */
   public void setTour(int newTour) {
      tour = newTour;
   }
   
   public Dictionary getScore() {
      return score;
   }
   
   /** @param newScore */
   public void setScore(Dictionary newScore) {
      score = newScore;
   }
   
   /** @param tour 
    * @param score 
    * @param match */
   public Match(int tour, Dictionary score, Match match) {
      // TODO: implement
   }
   
   public static void genererArbre() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Match> getFils() {
      if (fils == null)
         fils = new java.util.HashSet<Match>();
      return fils;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorFils() {
      if (fils == null)
         fils = new java.util.HashSet<Match>();
      return fils.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newFils */
   public void setFils(java.util.Collection<Match> newFils) {
      removeAllFils();
      for (java.util.Iterator iter = newFils.iterator(); iter.hasNext();)
         addFils((Match)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMatch */
   public void addFils(Match newMatch) {
      if (newMatch == null)
         return;
      if (this.fils == null)
         this.fils = new java.util.HashSet<Match>();
      if (!this.fils.contains(newMatch))
         this.fils.add(newMatch);
   }
   
   /** @pdGenerated default remove
     * @param oldMatch */
   public void removeFils(Match oldMatch) {
      if (oldMatch == null)
         return;
      if (this.fils != null)
         if (this.fils.contains(oldMatch))
            this.fils.remove(oldMatch);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllFils() {
      if (fils != null)
         fils.clear();
   }

}