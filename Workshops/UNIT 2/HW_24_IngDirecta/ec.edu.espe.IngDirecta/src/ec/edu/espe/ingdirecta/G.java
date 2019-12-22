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
public class G extends C{
    private I i;

    public G(I i) {
        this.i = i;
    }

    
    @Override
    public void print() {
         System.out.println("Printing from G");
    }

    @Override
    public String toString() {
        return "G{" + "i=" + i + '}';
    }
    
    
       
    
    
    
        
}
