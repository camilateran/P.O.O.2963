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
public class Chameleon extends Reptile{
    private int tailLenght;
    private boolean camouflage;

    public Chameleon(int tailLenght, boolean camouflage, boolean temperatureControl, int id, String name, String gender, float weight, Cage cage) {
        super(temperatureControl, id, name, gender, weight, cage);
        this.tailLenght = tailLenght;
        this.camouflage = camouflage;
    }
    @Override
    public String toString(){
        String chameleon;
        chameleon = tailLenght+","+tailLenght;
        return super.toString()+"," + chameleon;
    }
    
    
    
    
    /**
     * @return the tailLenght
     */
    public int getTailLenght() {
        return tailLenght;
    }

    /**
     * @param tailLenght the tailLenght to set
     */
    public void setTailLenght(int tailLenght) {
        this.tailLenght = tailLenght;
    }

    /**
     * @return the camouflage
     */
    public boolean isCamouflage() {
        return camouflage;
    }

    /**
     * @param camouflage the camouflage to set
     */
    public void setCamouflage(boolean camouflage) {
        this.camouflage = camouflage;
    }
    
    
    
    
    
    
    
    
    
}
