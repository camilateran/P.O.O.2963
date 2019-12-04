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
public class Toad extends Amphibian{
    private String spotColor;

    public Toad(String spotColor, boolean metamorphosis, int id, String name, String gender, float weight, Cage cage) {
        super(metamorphosis, id, name, gender, weight, cage);
        this.spotColor = spotColor;
    }
    @Override
    public String toString(){
        return super.toString()+"," +spotColor;
    }
    
    
    
    /**
     * @return the spotColor
     */
    public String getSpotColor() {
        return spotColor;
    }

    /**
     * @param spotColor the spotColor to set
     */
    public void setSpotColor(String spotColor) {
        this.spotColor = spotColor;
    }

    @Override
    public String getData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

}
