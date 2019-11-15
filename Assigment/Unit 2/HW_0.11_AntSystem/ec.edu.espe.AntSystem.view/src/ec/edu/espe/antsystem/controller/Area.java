/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antsystem.controller;

import ec.edu.espe.antsystem.model.Cell;

/**
 *
 * @author DTj
 */
public class Area {
    private int width;
    private int height;
    private int initNumberOfFoodPiles;
    private int tickDuration;
    private Cell cell;
    private AntEater antEater;
    private Colony colony;
    private FoodPile foodPile;
    
    public void Setup(){
       
    }
    public void Add(Colony colony){
        colony.run();
        
        
    }
    public void Add(AntEater anteater){
        
    }
    public void isAnyFoodRemainig(){
        
    }
    
    
    
    
    //public Cell GetCell(row, col){
      //  return new Cell();
    //}
    
}
