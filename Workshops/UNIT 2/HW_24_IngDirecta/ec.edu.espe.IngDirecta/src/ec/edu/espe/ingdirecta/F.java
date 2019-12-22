/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ingdirecta;

/**
 *
 * @author camyt
 */
public class F extends C{
    private K k;

    public F(K k) {
        this.k = k;
    }

    

    
    /**
     * @return the k
     */
    public K getK() {
        return k;
    }

    /**
     * @param k the k to set
     */
    public void setK(K k) {
        this.k = k;
    }

    @Override
    public void print() {
        System.out.println("Printing from F");
    }

    @Override
    public String toString() {
        return "F{" + "k=" + k + '}';
    }
    
    

  
    
    
    
}
