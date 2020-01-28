
package ec.edu.espe.calculatorustax.controller;


public class USTax {
    private static USTax instance;
    //private USTax();
    
    public static USTax getInstance(){
    if(instance == null)
        instance = new USTax();
        
    return instance;
    }
    
    public float salesTotal(){
        
        return 0;
    
    }
}
