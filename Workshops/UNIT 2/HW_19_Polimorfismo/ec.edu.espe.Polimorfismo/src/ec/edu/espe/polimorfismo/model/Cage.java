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
class Cage {
    private int id;
    private String material;
    private int Xposition;
    private int Yposition;

    public Cage(int id, String material, int Xposition, int Yposition) {
        this.id = id;
        this.material = material;
        this.Xposition = Xposition;
        this.Yposition = Yposition;
    }
    
    @Override
    public String toString(){
        String cage;
        cage = id+","+material+","+Xposition+","+Yposition;
        return cage;
    }
   

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return the Xposition
     */
    public int getXposition() {
        return Xposition;
    }

    /**
     * @param Xposition the Xposition to set
     */
    public void setXposition(int Xposition) {
        this.Xposition = Xposition;
    }

    /**
     * @return the Yposition
     */
    public int getYposition() {
        return Yposition;
    }

    /**
     * @param Yposition the Yposition to set
     */
    public void setYposition(int Yposition) {
        this.Yposition = Yposition;
    }
    
}
