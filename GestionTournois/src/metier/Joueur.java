/***********************************************************************
 * Module:  Joueur.java
 * Author:  p2007545
 * Purpose: Defines the Class Joueur
 ***********************************************************************/

package metier;

import java.util.*;

public class Joueur extends Participant {
   
   protected void finalize() {
      // TODO: implement
   }
   static ArrayList<Joueur> listeJoueur=new ArrayList();
   public java.util.Collection<Match> joueEnMatchDouble;
   public java.util.Collection<Match> joueEnMatchSimple;
   
   public void reserverCourt() {
      // TODO: implement
   }
   
   public void supprimerReservation() {
      // TODO: implement
   }
   
       public Joueur(Collection<Match> joueEnMatchDouble, Collection<Match> joueEnMatchSimple,int id, String nom, String prenom, String nationnalite) {
        super(id,nom, prenom, nationnalite);
        this.joueEnMatchDouble = joueEnMatchDouble;
        this.joueEnMatchSimple = joueEnMatchSimple;
        listeJoueur.add(this);
    }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Match> getJoueEnMatchDouble() {
      if (joueEnMatchDouble == null)
         joueEnMatchDouble = new java.util.HashSet<Match>();
      return joueEnMatchDouble;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorJoueEnMatchDouble() {
      if (joueEnMatchDouble == null)
         joueEnMatchDouble = new java.util.HashSet<Match>();
      return joueEnMatchDouble.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newJoueEnMatchDouble */
   public void setJoueEnMatchDouble(java.util.Collection<Match> newJoueEnMatchDouble) {
      removeAllJoueEnMatchDouble();
      for (java.util.Iterator iter = newJoueEnMatchDouble.iterator(); iter.hasNext();)
         addJoueEnMatchDouble((Match)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMatch */
   public void addJoueEnMatchDouble(Match newMatch) {
      if (newMatch == null)
         return;
      if (this.joueEnMatchDouble == null)
         this.joueEnMatchDouble = new java.util.HashSet<Match>();
      if (!this.joueEnMatchDouble.contains(newMatch))
         this.joueEnMatchDouble.add(newMatch);
   }
   
   /** @pdGenerated default remove
     * @param oldMatch */
   public void removeJoueEnMatchDouble(Match oldMatch) {
      if (oldMatch == null)
         return;
      if (this.joueEnMatchDouble != null)
         if (this.joueEnMatchDouble.contains(oldMatch))
            this.joueEnMatchDouble.remove(oldMatch);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllJoueEnMatchDouble() {
      if (joueEnMatchDouble != null)
         joueEnMatchDouble.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Match> getJoueEnMatchSimple() {
      if (joueEnMatchSimple == null)
         joueEnMatchSimple = new java.util.HashSet<Match>();
      return joueEnMatchSimple;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorJoueEnMatchSimple() {
      if (joueEnMatchSimple == null)
         joueEnMatchSimple = new java.util.HashSet<Match>();
      return joueEnMatchSimple.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newJoueEnMatchSimple */
   public void setJoueEnMatchSimple(java.util.Collection<Match> newJoueEnMatchSimple) {
      removeAllJoueEnMatchSimple();
      for (java.util.Iterator iter = newJoueEnMatchSimple.iterator(); iter.hasNext();)
         addJoueEnMatchSimple((Match)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMatch */
   public void addJoueEnMatchSimple(Match newMatch) {
      if (newMatch == null)
         return;
      if (this.joueEnMatchSimple == null)
         this.joueEnMatchSimple = new java.util.HashSet<Match>();
      if (!this.joueEnMatchSimple.contains(newMatch))
         this.joueEnMatchSimple.add(newMatch);
   }
   
   /** @pdGenerated default remove
     * @param oldMatch */
   public void removeJoueEnMatchSimple(Match oldMatch) {
      if (oldMatch == null)
         return;
      if (this.joueEnMatchSimple != null)
         if (this.joueEnMatchSimple.contains(oldMatch))
            this.joueEnMatchSimple.remove(oldMatch);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllJoueEnMatchSimple() {
      if (joueEnMatchSimple != null)
         joueEnMatchSimple.clear();
   }
    public static void printAll(){
        System.out.println("print all");
        for(Joueur joueur : listeJoueur)
        {
            System.out.println(joueur.id);
        }
        
    }

}