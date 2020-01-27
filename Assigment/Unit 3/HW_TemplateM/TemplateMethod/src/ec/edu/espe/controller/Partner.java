
package ec.edu.espe.controller;

import ec.edu.espe.model.Person;


public class Partner extends Person{
    private int numberPartner;
    
    public  Partner(int numeroSocio){
        setNumberPartner(numeroSocio);
    }

    public int getNumberPartner() {
        return numberPartner;
    }

    public void setNumberPartner(int numeroSocio) {
        this.numberPartner = numeroSocio;
    }

    @Override
    protected String getId() {
        return String.valueOf(numberPartner);
    }

    @Override
    protected String getTypeId() {
        return "numero de socio";
    }
    
}
