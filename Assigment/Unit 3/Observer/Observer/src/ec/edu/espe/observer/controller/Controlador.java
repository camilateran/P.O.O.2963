package ec.edu.espe.observer.controller;


public class Controlador {
    Modelo m; 
    

    public Controlador(Modelo m){
       
        this.m = m;
    }
    

    public void sumar(){
        m.sumar();
    }
    
    public void restar(){
        m.restar();
    }
    
}
