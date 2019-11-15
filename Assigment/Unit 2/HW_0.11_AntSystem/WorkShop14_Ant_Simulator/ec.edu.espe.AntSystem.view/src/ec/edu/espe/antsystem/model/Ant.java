/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antsystem.model;

import ec.edu.espe.antsystem.controller.Food;

/**
 *
 * @author Jerico Ruiz
 */
public class Ant {
    private Cell position;
    private int weight;
    private Food foods;
    
   
    private Ant[] a = new Ant[5];
    public void run(){
         
        for (int i = 0; i < 4; i++) {
            int j = i+1;
            System.out.println("Ant " + j  + " is running");    
        }
        
        
    }
    @Override
    public String toString(){
        return "Class Ant";
    }
}
