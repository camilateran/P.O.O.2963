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
public abstract  class Amphibian extends Animal{
    
    private boolean metamorphosis;
    

    public Amphibian(boolean metamorphosis, int id, String name, String gender, float weight, Cage cage) {
        super(id, name, gender, weight, cage);
        System.out.println("AMPHIBIAN CONSTRUCTOR");
        this.metamorphosis = metamorphosis;
    }

    @Override
    public String toString(){
        return super.toString()+","+metamorphosis+",";
    }
    
    
    
    /**
     * @return the metamorphosis
     */
    public boolean isMetamorphosis() {
        return metamorphosis;
    }

    /**
     * @param metamorphosis the metamorphosis to set
     */
    public void setMetamorphosis(boolean metamorphosis) {
        this.metamorphosis = metamorphosis;
    }
    
    
    
    
}
