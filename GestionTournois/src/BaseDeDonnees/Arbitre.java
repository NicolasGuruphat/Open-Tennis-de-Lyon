/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDeDonnees;

import java.util.ArrayList;

/**
 *
 * @author nicog
 */
public class Arbitre {
    private int id;
    String nom;
    String prenom;
    String nationalite;
    static ArrayList<Arbitre> listeArbitre=new ArrayList();
    Arbitre(int id, String nom, String prenom, String nationalite){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.nationalite=nationalite;
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
