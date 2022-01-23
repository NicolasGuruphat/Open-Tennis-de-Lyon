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
        ObjectFactory.createReferee();
        ObjectFactory.createBallPicker();
        ObjectFactory.createCourt();
        ObjectFactory.createSchedule();
        MatchFactory.createMatch();
        for (Match m : Match.getListeMatch()) {
            System.out.println(m.getBallPickerTeam());
        }
    }
}
