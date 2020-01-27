/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.templatemethod.view;

import ec.edu.espe.templatemethod.controller.Manual;
import ec.edu.espe.templatemethod.controller.Drive;
import ec.edu.espe.templatemethod.controller.Automatic;

/**
 *
 * @author camyt
 */
public class TemplateM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Drive drive = new Automatic();
        System.out.println(drive.driveCar());
        drive = new Manual();
        System.out.println(drive.driveCar());
        
        
    }
    
}
