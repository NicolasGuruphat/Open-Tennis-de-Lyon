/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;
import Model.ObjectFactory;
import Controller.*;

/**
 *
 * @author elartic
 */
public class Main {
    public static void main(String[] args) {
        ObjectFactory.createPlayers();
        System.out.println(Player.getPlayerList());
    }
}
