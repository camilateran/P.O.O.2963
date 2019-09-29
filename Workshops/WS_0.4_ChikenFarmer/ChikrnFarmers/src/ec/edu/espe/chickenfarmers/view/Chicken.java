/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.chickenfarmers.view;

/**
 *
 * @author Lenovo
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean molting;
    
    String[] nameChicken = new String[5];

   
    public void doStuff(int forTime){
        System.out.println("My chicken" +name+"is doing things");
            eat();
            drink();
            cluck();
            wander();
            poop();  
    }
    private void cluck(){
        System.out.println("My chicken " +name+ "say cluck cluck");
    } 
    private void wander(){
        System.out.println("My chicken " +name+ "is wandering");
    }
    private void eat(){
        System.out.println("My chicken " +name+ "is eating");
    }
    private void drink(){
        System.out.println("My chicken " +name+ "is drinking");
    }
    private void poop(){
        System.out.println("My chicken " +name+ "is pooping");
    }
    
   // private Egg layAnEgg(){
    //    return new Egg();
    //}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMolting() {
        return molting;
    }

    public void setMolting(boolean molting) {
        this.molting = molting;
    }

    public String[] getNameChicken() {
        return nameChicken;
    }

    public void setNameChicken(String[] nameChicken) {
        this.nameChicken = nameChicken;
    }
    

}
