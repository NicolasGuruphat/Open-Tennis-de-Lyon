/***********************************************************************
 * Module:  Participant.java
 * Author:  p2007545
 * Purpose: Defines the Class Participant
 ***********************************************************************/

package metier;

import java.util.*;

public abstract class Participant {
   protected String nom;
   protected String prenom;
   protected String nationnalite;
   
   protected void finalize() {
      // TODO: implement
   }
   
   public String getNom() {
      return nom;
   }
   
   /** @param newNom */
   public void setNom(String newNom) {
      nom = newNom;
   }
   
   public String getPrenom() {
      return prenom;
   }
   
   /** @param newPrenom */
   public void setPrenom(String newPrenom) {
      prenom = newPrenom;
   }
   
   public String getNationnalite() {
      return nationnalite;
   }
   
   /** @param newNationnalite */
   public void setNationnalite(String newNationnalite) {
      nationnalite = newNationnalite;
   }
   
   public Participant() {
      // TODO: implement
   }

}