/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe;

import ec.edu.espe.controller.Client;
import ec.edu.espe.controller.Employee;
import ec.edu.espe.controller.Partner;
import ec.edu.espe.model.Person;

/**
 *
 * @author Angel castillo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person persona = new Client(1);
        System.out.println("El cliente dice ");
        System.out.println(persona.identify());
        
        System.out.println("El empleado dice ");
        persona = new Employee(" 1");
        System.out.println(persona.identify());
        
        System.out.println("El socio dice ");
        persona = new Partner(1);
        System.out.println(persona.identify());
        
    }
    
}
