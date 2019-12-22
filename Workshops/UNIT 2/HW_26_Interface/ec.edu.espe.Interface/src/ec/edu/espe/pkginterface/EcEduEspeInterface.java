/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pkginterface;

import ec.edu.espe.pkginterface.controller.Animal;
import ec.edu.espe.pkginterface.controller.Monkey;

/**
 *
 * @author camyt
 */
public class EcEduEspeInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal;
        animal = new Monkey();
        
        System.out.println(animal);
        
    }
    
}
