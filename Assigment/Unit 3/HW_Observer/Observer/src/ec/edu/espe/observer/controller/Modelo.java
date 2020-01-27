package ec.edu.espe.observer.controller;

import java.util.ArrayList;



public class Modelo implements Observable<ModeloObserver>{


    private ArrayList<ModeloObserver> observadores;

    private int valor;
    
    

    public Modelo() {

        valor = 0;
        observadores = new ArrayList<ModeloObserver>();
        
    }

    public void sumar(){
        
        valor++;

        notificarObservadores(valor);
    }

    public void restar(){
        valor--;

        notificarObservadores(valor);
    }
    

    @Override
    public void addObservador(ModeloObserver t) {

        observadores.add(t);
  
        notificarObservadores(valor);
    }


    @Override
    public void removeObservador(ModeloObserver t) {
        observadores.remove(t);
    }
    

    private void notificarObservadores(int t) {
      
        for(ModeloObserver o : observadores){
  
            o.valorCambiado(t);
        }
    }
    
    
}
