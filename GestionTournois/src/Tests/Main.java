/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;

import Model.ObjectFactory;
import Controller.*;
import Model.*;
import Exceptions.*;
import java.sql.*;
import java.util.*;

/**
 *
 * @author elartic
 */
public class Main {
    public static void main(String[] args) {
        ObjectFactory.createPlayers();
        System.out.println(Player.getPlayerList());
        ObjectFactory.createPlayers();
        System.out.println(Player.getPlayerList());
        
        ObjectFactory.createSchedule();
        System.out.println(Horaire.getListeHoraire());
        ObjectFactory.createSchedule();
        System.out.println(Horaire.getListeHoraire());
        
        ObjectFactory.createCourt();
        System.out.println(Terrain.getListeTerrain());
        ObjectFactory.createCourt();
        System.out.println(Terrain.getListeTerrain());
        
        ObjectFactory.createSchedule();
        System.out.println(Horaire.getListeHoraire().get(0));
        
        System.out.println("\n\n\n\n\n\n");
        
        MatchFactory.createMatch();
        System.out.println(Match.getListeMatch());
        
        Map<Player, ArrayList<Integer>> test = new HashMap<>();
        
        ArrayList<Integer> testArray = new ArrayList<>();
        testArray.add(6);
        testArray.add(6);
        testArray.add(6);
        
        Player testPlayer = new Player(1, "bonsoir", "bonjour", null, "France");
        System.out.println(testPlayer);
        
        test.put(testPlayer, testArray);
        System.out.println(test);
    }
}
