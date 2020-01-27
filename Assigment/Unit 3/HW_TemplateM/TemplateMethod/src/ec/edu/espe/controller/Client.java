
package ec.edu.espe.controller;

import ec.edu.espe.model.Person;


public class Client extends Person{
    private  int numberClient;
    
    public Client(int numeroCliente){
        setNumberClient(numeroCliente);
    }

    @Override
    protected String getId() {
        return String.valueOf(numberClient);
    }

    @Override
    protected String getTypeId() {
        return "numero de cliente";
    }

    public int getNumeroCliente() {
        return numberClient;
    }

    public void setNumberClient(int numeroCliente) {
        this.numberClient = numeroCliente;
    }
    
    
}
