/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.singleton.controller;

/**
 *
 * @author Jerico Ruiz
 */
/**
 * @author RicardoMoya
 */

public class UniqueInstance {

    private String name;
    private String xy;

    private static UniqueInstance validateUniquePerson;

    // El constructor es privado, no permite que se genere un constructor por defecto.
    private UniqueInstance(String nombre) {
        this.name = nombre;
        this.xy = xy;
        System.out.println("Mi nombre es: " + this.name);
    }

    public static UniqueInstance getSingletonInstance(String nombre) {
        if (validateUniquePerson == null){
            validateUniquePerson = new UniqueInstance(nombre);
        }
        else{
            System.out.println("No se puede crear el objeto "+ nombre + " porque ya existe un objeto singleton");
        }
        
        return validateUniquePerson;
    }
    
    //Sobreescribimos el método clone, para que no se pueda clonar un objeto de esta clase
    @Override
    public UniqueInstance clone(){
        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException ex) {
            System.out.println("No se puede clonar un objeto singleton");
        }
        return null; 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

