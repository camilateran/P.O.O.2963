/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.polimorfismo.model;

/**
 *
 * @author camyt
 */
public abstract class Animal {
    private int id;
    private String name;
    private String gender;
    // weight in kg
    private float weight;
    private Cage cage;
    
    public abstract String getData();

    public Animal(int id, String name, String gender, float weight, Cage cage) {
        
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.cage = cage;
    }
    public void run(){
        System.out.println("run fast");
    }
    public void run(int speed){
        System.out.println("run at speed "+speed);
    }
    public void run(String park){
        System.out.println("run at park "+park);
        
    }
    public void run(String park,float speed){
        System.out.println("run at park "+park);
    }
    
    @Override
    public String toString(){
        String animal;
        animal = id+","+name+","+gender+","+weight+","+cage;
        return animal;
    }
    
    public boolean feed(){
        return true;
    }

    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return the cage
     */
    public Cage getCage() {
        return cage;
    }

    /**
     * @param cage the cage to set
     */
    public void setCage(Cage cage) {
        this.cage = cage;
    }
    
    
}
