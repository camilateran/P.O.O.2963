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
public class Monkey extends Mammal{
    
    private int tailLength;

    public Monkey(int tailLength, boolean isBreastFeeding, int id, String name, String gender, float weight, Cage cage) {
        super(isBreastFeeding, id, name, gender, weight, cage);
        this.tailLength = tailLength;
    }
    
    @Override
    public String toString(){
        return super.toString()+"," +tailLength+",";
    }
    
    /**
     * @return the tailLength
     */
    public int getTailLength() {
        return tailLength;
    }

    /**
     * @param tailLength the tailLength to set
     */
    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }
    
    
    
    
}
