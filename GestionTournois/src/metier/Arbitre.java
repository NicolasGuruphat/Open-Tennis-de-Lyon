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
   ArrayList<Horaire> listeHoraire = new ArrayList();
   
   protected void finalize() {
      // TODO: implement
   }

   
   public String getTypeArbitre() {
      return typeArbitre;
   }
   
   /** @param newId */
   public void setType(String newTypeArbitre) {
      typeArbitre = newTypeArbitre;
   }
   
    public static ArrayList<Arbitre> getListeArbitre() {
        return listeArbitre;
    }

    public static void setListeArbitre(ArrayList<Arbitre> listeArbitre) {
        Arbitre.listeArbitre = listeArbitre;
    }

    public ArrayList<Horaire> getListeHoraire() {
        return listeHoraire;
    }

    public void setListeHoraire(ArrayList<Horaire> listeHoraire) {
        this.listeHoraire = listeHoraire;
    }

   
    public Arbitre(int id, String typeArbitre, String nom, String prenom, String nationnalite) {
        super(id, nom, prenom, nationnalite);
        this.typeArbitre = typeArbitre;

        listeArbitre.add(this);
    }
   
 
    public static void printAll(){
        System.out.println("print all");
        for(Arbitre arbitre : listeArbitre)
        {
            System.out.println(arbitre.id);
        }
    
    }

}