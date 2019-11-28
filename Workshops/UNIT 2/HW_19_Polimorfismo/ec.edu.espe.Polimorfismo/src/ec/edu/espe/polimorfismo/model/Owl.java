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
public class Owl extends Bird{
    private boolean nightVision;

    public Owl(boolean nightVision, int wingSize, boolean fly, int id, String name, String gender, float weight, Cage cage) {
        super(wingSize, fly, id, name, gender, weight, cage);
        this.nightVision = nightVision;
    }

    @Override
    public String toString(){
       return super.toString()+"," +nightVision+",";
        
    }
    
    
    /**
     * @return the nightVision
     */
    public boolean isNightVision() {
        return nightVision;
    }

    /**
     * @param nightVision the nightVision to set
     */
    public void setNightVision(boolean nightVision) {
        this.nightVision = nightVision;
    }
    
    
    
    
    

}
