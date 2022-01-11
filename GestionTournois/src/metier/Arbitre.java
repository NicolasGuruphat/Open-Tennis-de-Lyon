/***********************************************************************
 * Module:  Arbitre.java
 * Author:  p2007545
 * Purpose: Defines the Class Arbitre
 ***********************************************************************/

package metier;

import java.util.*;

public class Arbitre extends Participant {
    
   private String typeArbitre;
   static ArrayList<Arbitre> listeArbitre=new ArrayList();
   
   protected void finalize() {
      // TODO: implement
   }
   
   public java.util.Collection<Match> listeMatchs;
   
   
   public String getTypeArbitre() {
      return typeArbitre;
   }
   
   /** @param newId */
   public void setType(String newTypeArbitre) {
      typeArbitre = newTypeArbitre;
   }
   
    public Arbitre(int id, String typeArbitre, Collection<Match> listeMatchs, String nom, String prenom, String nationnalite) {
        super(id, nom, prenom, nationnalite);
        this.typeArbitre = typeArbitre;
        this.listeMatchs = listeMatchs;
        listeArbitre.add(this);
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
    public static void printAll(){
        System.out.println("print all");
        for(Arbitre arbitre : listeArbitre)
        {
            System.out.println(arbitre.id);
        }
    
    }

}