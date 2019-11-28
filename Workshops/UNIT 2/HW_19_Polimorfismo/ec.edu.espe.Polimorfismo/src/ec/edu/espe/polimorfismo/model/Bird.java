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
public abstract class Bird extends Animal{
    //the wigSize in mm;
    private int wingSize;
    // true fly, false not fly
    private boolean fly;

    public Bird(int wingSize, boolean fly, int id, String name, String gender, float weight, Cage cage) {
        super(id, name, gender, weight, cage);
        System.out.println("BIRD CONSTRUCTOR");
        this.wingSize = wingSize;
        this.fly = fly;
    }

    @Override
    public String toString(){
        return super.toString()+","+ wingSize+","+fly;
    }
    
    
    
    
    /**
     * @return the wingSize
     */
    public int getWingSize() {
        return wingSize;
    }

    /**
     * @param wingSize the wingSize to set
     */
    public void setWingSize(int wingSize) {
        this.wingSize = wingSize;
    }

    /**
     * @return the fly
     */
    public boolean isFly() {
        return fly;
    }

    /**
     * @param fly the fly to set
     */
    public void setFly(boolean fly) {
        this.fly = fly;
    }
    
    
    
    
}
