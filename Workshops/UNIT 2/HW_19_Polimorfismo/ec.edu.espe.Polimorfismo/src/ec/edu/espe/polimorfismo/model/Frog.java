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
public class Frog extends Amphibian{
    
    private boolean poisonous;
    private int legLenght;

    public Frog(boolean poisonous, int legLenght, boolean metamorphosis, int id, String name, String gender, float weight, Cage cage) {
        super(metamorphosis, id, name, gender, weight, cage);
        this.poisonous = poisonous;
        this.legLenght = legLenght;
    }
    @Override
    public String toString(){
        String frog = poisonous+","+legLenght;
        return super.toString()+"," +frog;
    }
    
    
    
    /**
     * @return the poisonous
     */
    public boolean isPoisonous() {
        return poisonous;
    }

    /**
     * @param poisonous the poisonous to set
     */
    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }

    /**
     * @return the legLenght
     */
    public int getLegLenght() {
        return legLenght;
    }

    /**
     * @param legLenght the legLenght to set
     */
    public void setLegLenght(int legLenght) {
        this.legLenght = legLenght;
    }
    
    
    
    
    
    
    
}
