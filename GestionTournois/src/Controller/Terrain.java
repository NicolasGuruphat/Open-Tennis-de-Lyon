/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.*;

/**
 *
 * @author p2007545
 */
public class Terrain {
    private int id;
    private String nom;
    private String typeTerrain;
    private static ArrayList<Terrain> listeTerrain;

    public Terrain(int id, String nom, String typeTerrain) {
        this.id = id;
        this.nom = nom;
        this.typeTerrain = typeTerrain;
        listeTerrain.add(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTypeTerrain() {
        return typeTerrain;
    }

    public void setTypeTerrain(String typeTerrain) {
        this.typeTerrain = typeTerrain;
    }

    public static ArrayList<Terrain> getListeTerrain() {
        return listeTerrain;
    }

    public static void setListeTerrain(ArrayList<Terrain> listeTerrain) {
        Terrain.listeTerrain = listeTerrain;
    }
    
    public static void initListeTerrain() {
        listeTerrain = new ArrayList<>();
    }
    
    public static void addTerrain(Terrain terrain) {
        listeTerrain.add(terrain);
    }
    
    public static void printAll(){
        System.out.println("printAll terrain");

        for (int i = 0; i < listeTerrain.size() ; i++)
            {
            System.out.println(listeTerrain.get(i).getId());
            }

        }

    @Override
    public String toString() {
        return "Terrain{" + "id=" + id + 
                ", nom=" + nom + 
                ", typeTerrain=" + typeTerrain + 
                '}';
    }
    
}
