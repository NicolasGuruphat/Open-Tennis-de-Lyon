/***********************************************************************
 * Module:  Match.java
 * Author:  p2007545
 * Purpose: Defines the Class Match
 ***********************************************************************/

package Controller;

import Model.DBDataFactory;
import java.util.*;

public class Match {
    private int id;
    private int tour;
    private Map<Player,ArrayList<Integer>> score = new HashMap<>(); // associe un idJoueur avec son score
    private Match fils;
   
    private Terrain terrain;
    private Horaire horaire;
    
    private ArrayList<Referee> arbitre = new ArrayList();
    private ArrayList<RamasseurBalle> ballPickerTeam = new ArrayList();
    
    private static ArrayList<Match> listeMatch = new ArrayList();
   
   
   
    //Constructeur pour la méthode générerMatch()
    public Match(int id) {
        ArrayList<Player>listeJoueurTotaux = Player.getPlayerList();
        ArrayList<Horaire>listeHoraireTotaux = Horaire.getListeHoraire();
        ArrayList<Terrain>listeTerrainTotaux = Terrain.getListeTerrain();
                
        
        this.id = id;
        this.tour = 1;
        this.fils = null;
        
        this.arbitre.add(assignerArbitre(id,"Chaise"));
        for (int i = 0; i < 8; i++) { this.arbitre.add(assignerArbitre(id,"Ligne")); }
        
        for (int i = 0; i < 12; i++) {
            this.ballPickerTeam.add(RamasseurBalle.getBallPickerList().get((id%5)*12 + i)); 
        }
        
        this.horaire = listeHoraireTotaux.get((this.id)/5);
        this.terrain = listeTerrainTotaux.get((this.id)%5);
        
        this.score.put(listeJoueurTotaux.get(2*id),new ArrayList<Integer>(Arrays.asList(null,null,null,null,null)));
        this.score.put(listeJoueurTotaux.get(2*id+1),new ArrayList<Integer>(Arrays.asList(null,null,null,null,null)));
    }
   
    public Match(int id, int tour, Player joueur1, Player joueur2) {  
        
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
    
    public Match(int id, int tour, Horaire horaire, Terrain terrain) {
        this.id = id;
        this.tour = tour;
        this.horaire = horaire;
        this.terrain = terrain;
        listeMatch.add(this);
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
   
    public static void creerMatch(Match match1, Match match2) {
        int nouveauId = listeMatch.size();
        int nouveauTour;
        Match match;
        
        if (nouveauId < 16){nouveauTour = 1;}
        
        if (nouveauId < 24){nouveauTour = 2;}
        
        if (nouveauId < 28){nouveauTour = 3;}
        
        if (nouveauId < 30){nouveauTour = 4;} 
        
        else {nouveauTour = 5;}
        
        match = new Match(nouveauId, nouveauTour, match1.comparerScore(), match2.comparerScore());
        
        match1.setFils(match);
        match2.setFils(match);
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
   
   public Map<Player,ArrayList<Integer>> getScore() {
      return score;
   }
   
   /** @param newScore */
   public void setScore(Map<Player,ArrayList<Integer>> newScore) {
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

    public ArrayList<Referee> getArbitre() {
        return arbitre;
    }

    public void setArbitre(ArrayList<Referee> arbitre) {
        this.arbitre = arbitre;
    }
    
    public ArrayList<RamasseurBalle> getBallPickerTeam() {
        return ballPickerTeam;
    }

    public static ArrayList<Match> getListeMatch() {
        return listeMatch;
    }

    public static void setListeMatch(ArrayList<Match> listeMatch) {
        Match.listeMatch = listeMatch;

    }
    
    public static void initListeMatch() {
        listeMatch = new ArrayList();
    }
    
    public static void addMatch(Match match) {
        listeMatch.add(match);
    }
    
    private Referee assignerArbitre(int incrementeurJoueur, String typeArbitre) {   
        ArrayList<Player> listeJoueurTotaux = Player.getPlayerList();
        ArrayList<Referee> listeArbitreTotaux = Referee.getRefereeList();
        
        int limiteIncrementeurArbitre = 0;
        int limiteArbitreMax = listeArbitreTotaux.size()/2;
        
        int limiteIncrementeurJoueur = incrementeurJoueur;
        int limiteJoueurMax = listeJoueurTotaux.size();
        

        while(       
                    
                    //les limites ne sont pas dépassés
                    ( (limiteIncrementeurJoueur < limiteJoueurMax && limiteIncrementeurArbitre < limiteArbitreMax ) 
                    &&
                    //les types ne sont pas bon
                    (  "Chaise".equals(typeArbitre) && "Ligne".equals(listeArbitreTotaux.get(limiteIncrementeurArbitre).getRefereeList())
                    || "Ligne".equals(typeArbitre) && "Chaise".equals(listeArbitreTotaux.get(limiteIncrementeurArbitre).getRefereeList()) )
                    &&
                    //l'arbitre a déja l'horaire du match pris pour un autre match
                    ( ( listeArbitreTotaux.get(limiteIncrementeurArbitre).getListeHoraire().indexOf(this.getHoraire()) != -1) 
                    ||
                    //l'arbitre a la même nationnalité que l'un des deux joueurs
                    ( (listeJoueurTotaux.get(2*incrementeurJoueur).getNationality() == null ? listeArbitreTotaux.get(limiteIncrementeurArbitre).getNationality() == null : listeJoueurTotaux.get(2*incrementeurJoueur).getNationality().equals(listeArbitreTotaux.get(limiteIncrementeurArbitre).getNationality()) ) 
                    || 
                    (listeJoueurTotaux.get(2*incrementeurJoueur+1).getNationality() == null ? (listeArbitreTotaux.get(limiteIncrementeurArbitre).getNationality()) == null : listeJoueurTotaux.get(2*incrementeurJoueur+1).getNationality().equals(listeArbitreTotaux.get(limiteIncrementeurArbitre).getNationality()) )) )
                    )
                )
            {
                
            if ("Chaise".equals(typeArbitre) && "Chaise".equals(listeArbitreTotaux.get(limiteIncrementeurArbitre).getRefereeType()) && (listeArbitreTotaux.get(limiteIncrementeurArbitre).getListeHoraire().size() <= 4 ) ) 
                {
                listeArbitreTotaux.add(listeArbitreTotaux.get(incrementeurJoueur));
                listeArbitreTotaux.remove(incrementeurJoueur);
                

                }
            
            else if("Ligne".equals(typeArbitre) && "Ligne".equals(listeArbitreTotaux.get(limiteIncrementeurArbitre).getRefereeType()))
                {

                listeArbitreTotaux.add(listeArbitreTotaux.get(incrementeurJoueur));
                listeArbitreTotaux.remove(incrementeurJoueur);


                }
            
            limiteIncrementeurJoueur++;
            limiteIncrementeurArbitre++;          
             

            }

             if (limiteIncrementeurJoueur == limiteJoueurMax) {System.out.println("Pas d'arbitre trouvée, assignation par défaut"); }

             listeArbitreTotaux.get(limiteIncrementeurArbitre).getListeHoraire().add(this.horaire);

             return listeArbitreTotaux.get(limiteIncrementeurArbitre);
        }
    
    
            

    public static void genererArbreMatch() {
            
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
                    //System.out.println("match Referee nationnalité + id : " + listeMatch.get(i).getArbitre().getNationality() + "  " + listeMatch.get(i).getArbitre().getId() +" " + listeMatch.get(i).getArbitre().getListeHoraire().size() +  "\n\n" );

                    //System.out.println("match Referee nationnalité : " + listeMatch.get(i).getArbitre().getNationality() + "\n\n" );
                }
        }
    
        public Player comparerScore() {
            Player joueurGagnant; 
        
            ArrayList<Player> listeJoueur = new ArrayList();
            ArrayList<ArrayList<Integer>> listeScore = new ArrayList();

            int sommeScore1 = 0;
            int sommeScore2 = 0;
            
            System.out.println(this.getScore());
            for(Map.Entry<Player, ArrayList<Integer>> entry : this.score.entrySet()) {
                listeJoueur.add(entry.getKey());
                listeScore.add(entry.getValue());
            }
            
            System.out.println(listeScore.toString());
            for (int i = 0; i < listeScore.get(0).size() ;i++ ) {
                sommeScore1 += listeScore.get(0).get(i);
                sommeScore2 += listeScore.get(1).get(i);
            }

            if (sommeScore1 > sommeScore2) { joueurGagnant = listeJoueur.get(0); }
            else { joueurGagnant = listeJoueur.get(1); }


            return joueurGagnant;
        }
    
    
    public Player getJoueur(int numJoueur) {
        ArrayList<Player> listeJoueur = new ArrayList();
        
//        int incrementeur = 0;
//        for(Map.Entry<Player, ArrayList<Integer>> entree : this.score.entrySet()) {
//            listeJoueur.set(incrementeur, entree.getKey());
//            incrementeur++;
//        }
        
        for (Player p : this.getScore().keySet()) {
            listeJoueur.add(p);
        }
        
        return listeJoueur.get(numJoueur);
    }


    public void modifierScore(Player joueur, ArrayList<Integer> score) {
            this.getScore().put(joueur, score);
        }
    
    public void modifierTerrain(Terrain nouveauTerrain) {
        int i = 0;
        boolean fin = false;
        
        while ( i <listeMatch.size() && fin == false ) {
            if (nouveauTerrain == listeMatch.get(i).getTerrain() &&
                    this.horaire == listeMatch.get(i).getHoraire())
                {
                System.out.println("Changement de terrain impossible, le terrain est déja pris");
                fin = true;
                }
            if (fin == false) {this.terrain = nouveauTerrain;}
        }
    }
    
    public void VerifierScoreMatch() {
        Match match2 = null;

        if (this.getId() % 2 == 0) { match2 = Match.getListeMatch().get(this.getId() + 1 ); }

        if (this.getId() % 2 == 1) { match2 = Match.getListeMatch().get(this.getId() - 1 ); }

        boolean valide = true;
        
        ArrayList<Integer> nullList = new ArrayList(Arrays.asList(null, null, 
                null, null, null));

        for(Map.Entry<Player, ArrayList<Integer>> entry : this.getScore().entrySet()) {
            if (entry.getValue() == nullList) {
                valide = false;
            }
        }

        if (valide == true) {
            Match.creerMatch(this,match2);
        }
    }

    @Override
    public String toString() {
        return "Match{" + "id=" + id + 
                ", tour=" + tour + 
                ", score=" + score + 
                ", fils=" + fils + 
                ", terrain=" + terrain + 
                ", horaire=" + horaire + 
                ", arbitre=" + arbitre + 
                ", ballPickerTeam=" + ballPickerTeam + 
                '}';
    }
    
}

