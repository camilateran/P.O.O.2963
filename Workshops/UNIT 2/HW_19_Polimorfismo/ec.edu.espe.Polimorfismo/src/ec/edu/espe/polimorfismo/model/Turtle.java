/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.polimorfismo.model;

/**
 *
 * @author camyt
 */
public class Turtle extends Reptile{
    private boolean water;

    public Turtle(boolean water, boolean temperatureControl, int id, String name, String gender, float weight, Cage cage) {
        super(temperatureControl, id, name, gender, weight, cage);
        this.water = water;
    }
    @Override
    public String toString(){
        return super.toString()+"," +water+",";
    }
    
    
    /**
     * @return the water
     */
    public boolean isWater() {
        return water;
    }

    /**
     * @param water the water to set
     */
    public void setWater(boolean water) {
        this.water = water;
    }

    @Override
    public String getData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
