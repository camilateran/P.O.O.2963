package ec.edu.espe.observer.controller;


public interface Observable <T>{

    public void addObservador(T t);
    

    public void removeObservador(T t);
}
