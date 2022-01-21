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
   private static ArrayList<Joueur> listeJoueur=new ArrayList();
   
   public void reserverCourt() {
      // TODO: implement
   }
   
   public void supprimerReservation() {
      // TODO: implement
   }

    public Joueur(int id, String nom, String prenom, String nationnalite) {
        super(id, nom, prenom, nationnalite);
        listeJoueur.add(this);
    }

    
    public static ArrayList<Joueur> getListeJoueur() {
        return listeJoueur;
    }

    public static void setListeJoueur(ArrayList<Joueur> listeJoueur) {
        Joueur.listeJoueur = listeJoueur;
    }
    
    public static void printAll(){
        System.out.println("print all");        
        
        for (int i = 0; i < listeJoueur.size() ; i++)
            {
            System.out.println(listeJoueur.get(i).getId());
            }

    }
}