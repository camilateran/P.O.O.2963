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
public abstract class Reptile extends Animal{
    
    private boolean temperatureControl;

    public Reptile(boolean temperatureControl, int id, String name, String gender, float weight, Cage cage) {
        super(id, name, gender, weight, cage);
        System.out.println("REPTILE CONSTRUCTOR");
        this.temperatureControl = temperatureControl;
    }

    @Override
    public String toString(){
        return super.toString()+","+ temperatureControl+",";
    }
    
        
    /**
     * @return the temperatureControl
     */
    public boolean isTemperatureControl() {
        return temperatureControl;
    }

    /**
     * @param temperatureControl the temperatureControl to set
     */
    public void setTemperatureControl(boolean temperatureControl) {
        this.temperatureControl = temperatureControl;
    }
    
    
    
    
    

    
    
    
}
