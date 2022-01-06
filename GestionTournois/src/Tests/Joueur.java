/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tests;

import java.util.ArrayList;
/**
 *
 * @author nicog
 */

public class Joueur {
    private int id;
    String nom;
    String prenom;
    String nationalite;
    static ArrayList<Joueur> listeJoueur=new ArrayList();
    public Joueur(int id, String nom, String prenom, String nationalite){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.nationalite=nationalite;
        listeJoueur.add(this);
    }
    public static void printAll(){
        System.out.println("print all");
        for(Joueur joueur : listeJoueur)
        {
            System.out.println(joueur.id);
        }
        
    }
}
