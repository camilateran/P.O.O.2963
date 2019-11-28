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
public abstract class Fish extends Animal{
    private int fins;
    private boolean saltwater;

    public Fish(int fins, boolean saltwater, int id, String name, String gender, float weight, Cage cage) {
        super(id, name, gender, weight, cage);
        System.out.println("FISH CONSTRUCTOR");
        this.fins = fins;
        this.saltwater = saltwater;
    }

    @Override
    public String toString(){
        String fish = fins+","+saltwater;
        return super.toString()+"," +fish;
    }
    
    
    /**
     * @return the fins
     */
    public int getFins() {
        return fins;
    }

    /**
     * @param fins the fins to set
     */
    public void setFins(int fins) {
        this.fins = fins;
    }

    /**
     * @return the saltwater
     */
    public boolean isSaltwater() {
        return saltwater;
    }

    /**
     * @param saltwater the saltwater to set
     */
    public void setSaltwater(boolean saltwater) {
        this.saltwater = saltwater;
    }
    
    
    
    
    
}
