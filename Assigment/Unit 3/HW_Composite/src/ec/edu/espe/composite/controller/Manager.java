/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.composite.controller;

/**
 *
 * @author camyt
 */
public class Manager extends Supervisor{

    public Manager() {
        super();
        title = "Manager";
    }
    
    public Manager( String aName ) {
       this(); 
       name = aName; 
    }
    public void satetName(){
        super.stateName();
    }
    
}
