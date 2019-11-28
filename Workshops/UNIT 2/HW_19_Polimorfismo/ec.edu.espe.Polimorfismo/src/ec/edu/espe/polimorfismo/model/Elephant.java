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
public class Elephant extends Mammal {
    private int trunkLenght;

    public Elephant(int trunkLenght, boolean isBreastFeeding, int id, String name, String gender, float weight, Cage cage) {
        super(isBreastFeeding, id, name, gender, weight, cage);
        this.trunkLenght = trunkLenght;
    } 
    
    @Override
    public String toString(){
        return super.toString()+"," +trunkLenght+",";
    }
    
    /**
     * @return the trunkLenght
     */
    public int getTrunkLenght() {
        return trunkLenght;
    }

    /**
     * @param trunkLenght the trunkLenght to set
     */
    public void setTrunkLenght(int trunkLenght) {
        this.trunkLenght = trunkLenght;
    }
    
    
    
    
    
}
