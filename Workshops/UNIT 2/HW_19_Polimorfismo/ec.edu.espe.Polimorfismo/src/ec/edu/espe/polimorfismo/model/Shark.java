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
public class Shark extends Fish {
    private float swimmingSpeed;

    public Shark(float swimmingSpeed, int fins, boolean saltwater, int id, String name, String gender, float weight, Cage cage) {
        super(fins, saltwater, id, name, gender, weight, cage);
        this.swimmingSpeed = swimmingSpeed;
    }
    @Override
    public String toString(){
        return super.toString()+"," +swimmingSpeed+",";
    }
    
    
    
    
    /**
     * @return the swimmingSpeed
     */
    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    /**
     * @param swimmingSpeed the swimmingSpeed to set
     */
    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
     
    
    

}
