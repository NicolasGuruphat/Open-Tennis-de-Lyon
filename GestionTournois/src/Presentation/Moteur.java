/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/**
 *
 * @author p2007545
 */
public class Moteur {
    
    IHM fenetre;
    public Moteur(IHM fenetre){
    super();
    this.fenetre = fenetre;
    
    }
 
    
    public void afficherPrint(String test)
            {
                
            System.out.println(test);
            
            }
        
}
