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
public class Moteur extends AbstractAction {
    
    IHM fenetre;
    public Moteur(String texte, IHM fenetre){
    super(texte);
    this.fenetre = fenetre;
    
    }
    
     @Override
    public void actionPerformed(ActionEvent event){
        
        if (event.getSource() == fenetre.getjToggleButton1())
        {
		
        }
        
        else if (event.getSource() == fenetre.getjToggleButton2())
        {

        }
        
        else if (event.getSource() == fenetre.getjToggleButton3())
        {
       
        }
        

    }
        
}
