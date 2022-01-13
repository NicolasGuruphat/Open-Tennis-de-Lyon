/***********************************************************************
 * Module:  Match.java
 * Author:  p2007545
 * Purpose: Defines the Class Match
 ***********************************************************************/

package metier;

import java.util.*;
import java.util.*;

public class Match {
   private int id;
   private int tour;
   private Map<Integer,Integer> score;
   private Match fils;
   
   
   private static ArrayList<Match> listeMatch = new ArrayList();
   
   private static ArrayList<Horaire> listeHorraire = Horaire.getListeHoraire();
   private static ArrayList<Terrain> listeTerrain = Terrain.getListeTerrain();
  
   
   protected void finalize() {
      // TODO: implement
   }
   
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
   
   
   /** @param newId */
   public void setId(int newId) {
      id = newId;
   }
   
   
   public int getTour() {
      return tour;
   }
   
   /** @param newTour */
   public void setTour(int newTour) {
      tour = newTour;
   }
   
   public Map<Integer,Integer> getScore() {
      return score;
   }
   
   /** @param newScore */
   public void setScore(Map<Integer,Integer> newScore) {
      score = newScore;
   }
   
   /** @param tour 
    * @param score 
    * @param match */
    public Match(int id, int tour, Map<Integer,Integer> score, Match fils) {
        this.id = id;
        this.tour = tour;
        this.score = score;
        this.fils = fils;
        listeMatch.add(this);
    }
   
   
   public static void genererArbre() {
      // TODO: implement
      
        for( int i=0;i< 6;i++)
        {
            new Match(i, 1, null, null);
        }
          
      }

}
