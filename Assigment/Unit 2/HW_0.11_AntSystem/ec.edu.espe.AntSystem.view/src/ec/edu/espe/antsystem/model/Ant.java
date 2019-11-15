/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antsystem.model;

import ec.edu.espe.antsystem.controller.Food;

/**
 *
 * @author DTj
 */
public class Ant {
    private Cell position;
    private int weight;
    private Food foods;
   
    private Ant[] a = new Ant[5];
    public void run(){
        
    }
    @Override
    public String toString(){
        return "Class Ant";
    }
}
