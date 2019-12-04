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
public class Loro extends Bird{
    private String talk;

    public Loro(String talk, int wingSize, boolean fly, int id, String name, String gender, float weight, Cage cage) {
        super(wingSize, fly, id, name, gender, weight, cage);
        this.talk = talk;
    }

    
    @Override
    public String toString(){
        return super.toString()+"," +talk;
    }
    
    
    
    /**
     * @return the talk
     */
    public String getTalk() {
        return talk;
    }

    /**
     * @param talk the talk to set
     */
    public void setTalk(String talk) {
        this.talk = talk;
    }

    @Override
    public String getData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
