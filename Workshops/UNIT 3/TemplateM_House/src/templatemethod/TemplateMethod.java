/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

import ec.edu.espe.templatemethod.controller.Glass;
import ec.edu.espe.templatemethod.controller.House;
import ec.edu.espe.templatemethod.controller.Wooden;


/**
 *
 * @author camyt
 */
public class TemplateMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     House house = new Wooden();
     house.buildHouse();
     house = new Glass();
     house.buildHouse();
     
    
}
}
