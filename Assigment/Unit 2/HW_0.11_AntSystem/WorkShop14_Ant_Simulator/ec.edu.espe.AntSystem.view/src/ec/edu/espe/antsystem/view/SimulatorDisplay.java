/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antsystem.view;

import ec.edu.espe.antsystem.controller.AntEater;
import ec.edu.espe.antsystem.controller.Area;
import ec.edu.espe.antsystem.controller.Colony;
import ec.edu.espe.antsystem.controller.PheromoneDrop;
import ec.edu.espe.antsystem.model.Ant;

/**
 *
 * @author Jerico Ruiz
 */
public class SimulatorDisplay {

  
    public static void main(String[] args) {
        Area area = new Area();
        Colony colony = new Colony();
        Ant ant = new Ant();
        AntEater antEater = new AntEater();
        PheromoneDrop drop = new PheromoneDrop();
        
        colony.run();
        antEater.run();
           
    }
    
}
