/***********************************************************************
 * Module:  Match.java
 * Author:  p2007545
 * Purpose: Defines the Class Match
 ***********************************************************************/

package metier;

import BaseDeDonnees.DBDataFactory;
import java.util.*;

public class Match {
    private int id;
    private int tour;
    private Map<Joueur,ArrayList<Integer>> score = new HashMap<>(); // associe un idJoueur avec son score
    private Match fils;
   
    private Terrain terrain;
    private Horaire horaire;
    private boolean resultat;
    private ArrayList<Arbitre> arbitre = new ArrayList();
    
    private static ArrayList<Match> listeMatch = new ArrayList();
   
   
   
    //Constructeur pour la méthode générerMatch()
    public Match(int id) {
        ArrayList<Joueur>listeJoueurTotaux = Joueur.getListeJoueur();
        ArrayList<Horaire>listeHoraireTotaux = Horaire.getListeHoraire();
        ArrayList<Terrain>listeTerrainTotaux = Terrain.getListeTerrain();
                
        
        this.id = id;
        this.tour = 1;
        this.fils = null;
        
        this.arbitre.add(assignerArbitre(id,"Chaise"));
        for (int i = 0; i < 8; i++) { this.arbitre.add(assignerArbitre(id,"Ligne")); }
        
        this.horaire = listeHoraireTotaux.get((this.id)/5);
        this.terrain = listeTerrainTotaux.get((this.id)%5);
        
        this.score.put(listeJoueurTotaux.get(2*id),new ArrayList<Integer>(Arrays.asList(0,0,0,0,0)));
        this.score.put(listeJoueurTotaux.get(2*id+1),new ArrayList<Integer>(Arrays.asList(0,0,0,0,0)));
        
        
                
                
                
        listeMatch.add(this);
    }
   
    public Match(int id, int tour, Joueur joueur1, Joueur joueur2) {  
        
        ArrayList<Horaire>listeHoraireTotaux = Horaire.getListeHoraire();
        ArrayList<Terrain>listeTerrainTotaux = Terrain.getListeTerrain();
        
        this.id = id;
        this.tour = tour;
        this.fils = null;
        
        this.arbitre.add(assignerArbitre(id,"Chaise"));
        
        for (int i = 0; i < 8; i++) { this.arbitre.add(assignerArbitre(id,"Ligne")); }
        
        this.horaire = listeHoraireTotaux.get((this.id)/5);
        this.terrain = listeTerrainTotaux.get((this.id)%5);
        
        this.score.put(joueur1,new ArrayList<Integer>(Arrays.asList(0,0,0,0,0)));
        this.score.put(joueur2,new ArrayList<Integer>(Arrays.asList(0,0,0,0,0)));
                
                
                
        listeMatch.add(this);
    }

    public boolean isResultat() {
        return resultat;
    }

    public void setResultat(boolean resultat) {
        this.resultat = resultat;
    }
   
   
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
   
    public Match creerMatch(Match match1, Match match2) {

        int nouveauId = listeMatch.size();
        int nouveauTour;
        
        if (nouveauId < 16){nouveauTour = 1;}
        
        if (nouveauId < 24){nouveauTour = 2;}
        
        if (nouveauId < 28){nouveauTour = 3;}
        
        if (nouveauId < 30){nouveauTour = 4;} 
        
        else {nouveauTour = 5;}
        
        
        //System.out.println( ( ).getKey());
        Integer cle;
        //cle = match1.getScore().keySet();
        System.out.println(match1.getScore().keySet());
        
        
        //if match1.getScore().entrySet().getKey();
        //nouveauScore.put(, null);
        
        //Récupérer Score des 2 matchs puis prendre le gagnant, Récupérer horraire et terrain valide




        //nouveauMatch = new Match(id,tour,score,null,terrain,horaire);
        
        //match1.setFils(nouveauMatch);
        //match2.setFils(nouveauMatch);

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
   
   public Map<Joueur,ArrayList<Integer>> getScore() {
      return score;
   }
   
   /** @param newScore */
   public void setScore(Map<Joueur,ArrayList<Integer>> newScore) {
      score = newScore;
   }

    public Match getFils() {
        return fils;
    }

    public void setFils(Match fils) {
        this.fils = fils;
    }
    
    public Terrain getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

    public Horaire getHoraire() {
        return horaire;
    }

    public void setHoraire(Horaire horaire) {
        this.horaire = horaire;
    }

    public ArrayList<Arbitre> getArbitre() {
        return arbitre;
    }

    public void setArbitre(ArrayList<Arbitre> arbitre) {
        this.arbitre = arbitre;
    }
    
    

    public static ArrayList<Match> getListeMatch() {
        return listeMatch;
    }

    public static void setListeMatch(ArrayList<Match> listeMatch) {
        Match.listeMatch = listeMatch;

    }
    

            
    private Arbitre assignerArbitre(int incrementeurJoueur, String typeArbitre)
        {
        return null;
            /*
            
        ArrayList<Joueur> listeJoueurTotaux = Joueur.getListeJoueur();
        ArrayList<Arbitre> listeArbitreTotaux = Arbitre.getListeArbitre();
        
        int incrementeurArbitre = 0;
        
        
        int limiteIncrementeurJoueur = incrementeurJoueur;
        int limiteJoueurMax = listeJoueurTotaux.size();

        while(  (limiteIncrementeurJoueur < limiteJoueurMax) &&
                    
                    ( listeArbitreTotaux.get(incrementeurArbitre).getListeHoraire().indexOf(this.getHoraire()) != -1) 
                    ||
                    ( (listeJoueurTotaux.get(2*incrementeurJoueur).getNationnalite() == null ? listeArbitreTotaux.get(incrementeurArbitre).getNationnalite() == null : listeJoueurTotaux.get(2*incrementeurJoueur).getNationnalite().equals(listeArbitreTotaux.get(incrementeurArbitre).getNationnalite()) ) 
                    || 
                    (listeJoueurTotaux.get(2*incrementeurJoueur+1).getNationnalite() == null ? (listeArbitreTotaux.get(incrementeurArbitre).getNationnalite()) == null : listeJoueurTotaux.get(2*incrementeurJoueur+1).getNationnalite().equals(listeArbitreTotaux.get(incrementeurArbitre).getNationnalite()) ))
                )
            {
                
                /////////A VERIFIER, faut pas confondre condition du while et du if 
               if !(typeArbitre == "Chaise" && listeArbitreTotaux.get(incrementeurArbitre).getTypeArbitre() == "Chaise" && (listeArbitreTotaux.get(incrementeurArbitre).getListeHoraire().size() <= 4 ) ) 
                       {
               listeArbitreTotaux.add(listeArbitreTotaux.get(incrementeurJoueur));
               listeArbitreTotaux.remove(incrementeurJoueur);
               
                       }
                limiteIncrementeurJoueur++; 
               incrementeurArbitre++;
            }
        if (limiteIncrementeurJoueur == limiteJoueurMax) {System.out.println("Pas d'arbitre trouvée, assignation par défaut"); }
        
        this.arbitre = listeArbitreTotaux.get(incrementeurArbitre);
        this.arbitre.getListeHoraire().add(this.horaire);
        */
        }
    
    
            

    public static void genererArbreMatch() 
        {
            
        for( int i=0; i< 16; i++)
            {   
            new Match(i);
            }
          
      }
    
    public static void PrintAll()
        {
            
            System.out.println("PRINT MATCHS  ");
            for (int i = 0; i< listeMatch.size(); i++ )
                {
                    DBDataFactory.createMatch(listeMatch.get(i));
                    System.out.println("match ID : " + listeMatch.get(i).getId()  );
                    System.out.println("match tour : " + listeMatch.get(i).getTour()  );
                    System.out.println("match horaire : " + listeMatch.get(i).getHoraire().getDate() +  "    " +  listeMatch.get(i).getHoraire().getHeureDebut()  );
                    System.out.println("match Terrain: " + listeMatch.get(i).getTerrain().getId()  );
                    System.out.println("match score : " + listeMatch.get(i).getScore());
                    //System.out.println("match Arbitre nationnalité + id : " + listeMatch.get(i).getArbitre().getNationnalite() + "  " + listeMatch.get(i).getArbitre().getId() +" " + listeMatch.get(i).getArbitre().getListeHoraire().size() +  "\n\n" );

                    //System.out.println("match Arbitre nationnalité : " + listeMatch.get(i).getArbitre().getNationnalite() + "\n\n" );
                    
                    



                }
            
    
        }

}

