
package ec.edu.espe.observer.controller;


public class mvc {
    
    public static void main(String args[]){
        
       
        Modelo m = new Modelo();
        
       
        Controlador c = new Controlador(m);
        
        
        Vista v = new Vista(c);
        Vista v2 = new Vista(c);
        
        
        m.addObservador(v);
        m.addObservador(v2);
        
    }
}
