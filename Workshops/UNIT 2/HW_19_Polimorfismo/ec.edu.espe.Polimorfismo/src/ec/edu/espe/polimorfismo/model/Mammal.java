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
public abstract class Mammal extends Animal {
     private boolean isBreastFeeding;

    public Mammal(boolean isBreastFeeding, int id, String name, String gender, float weight, Cage cage) {
        super(id, name, gender, weight, cage);
        System.out.println("MAMMAL CONSTRUCTOR");
        this.isBreastFeeding = isBreastFeeding;
    }
    @Override
    public String toString(){
        return super.toString()+","+ isBreastFeeding+",";
    }
     

    /**
     * @return the isBreastFeeding
     */
    public boolean isIsBreastFeeding() {
        return isBreastFeeding;
    }

    /**
     * @param isBreastFeeding the isBreastFeeding to set
     */
    public void setIsBreastFeeding(boolean isBreastFeeding) {
        this.isBreastFeeding = isBreastFeeding;
    }
     
     
}
