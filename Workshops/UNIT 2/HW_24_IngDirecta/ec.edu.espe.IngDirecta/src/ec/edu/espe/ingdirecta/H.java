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
public class H extends C{
    private J j;

    public H(J j) {
        this.j = j;
    }

    

    
    /**
     * @return the j
     */
    public J getJ() {
        return j;
    }

    /**
     * @param j the j to set
     */
    public void setJ(J j) {
        this.j = j;
    }

    @Override
    public void print() {
        System.out.println("Printing H");
       
    }

    @Override
    public String toString() {
        return "H{" + "j=" + j + '}';
    }
    

   
    
    
}
