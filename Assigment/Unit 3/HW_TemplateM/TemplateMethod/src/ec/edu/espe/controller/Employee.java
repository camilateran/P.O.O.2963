
package ec.edu.espe.controller;

import ec.edu.espe.model.Person;


public class Employee extends Person{
    private String legajo;
    
    public Employee(String legajo){
        setLegajo(legajo);
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    @Override
    protected String getId() {
        return legajo;
    }

    @Override
    protected String getTypeId() {
        return "numero de legajo";
    }
    
}
