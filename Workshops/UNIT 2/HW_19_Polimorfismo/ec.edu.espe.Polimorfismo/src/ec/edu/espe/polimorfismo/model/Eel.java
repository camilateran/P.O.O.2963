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
public class Eel extends Fish {
    private float electricShock;

    public Eel(float electricShock, int fins, boolean saltwater, int id, String name, String gender, float weight, Cage cage) {
        super(fins, saltwater, id, name, gender, weight, cage);
        this.electricShock = electricShock;
    }
    @Override
    public String toString(){
        return super.toString()+"," +electricShock+",";
    }
    
    
    /**
     * @return the electricShock
     */
    public float getElectricShock() {
        return electricShock;
    }

    /**
     * @param electricShock the electricShock to set
     */
    public void setElectricShock(float electricShock) {
        this.electricShock = electricShock;
    }

    @Override
    public String getData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
