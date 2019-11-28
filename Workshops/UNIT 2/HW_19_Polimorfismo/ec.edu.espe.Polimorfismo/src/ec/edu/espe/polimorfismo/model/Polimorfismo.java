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
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cage cage = new Cage(1, "Wood", 1, 1);
        Cage cage1 = new Cage(2, "Metal", 1, 1);
        Cage cage2 = new Cage(4, "Glass", 2, 8);
      

        Animal animal;
        animal = new Monkey(20, true, 1, "Chango", "Male", 20, cage);
        animal = new Owl(true, 73, true, 2, "Royal Owl", "Female", 2.4F, cage1);
        animal = new Loro("Hola", 10, true, 3, "Guacamayo", "Male", 1.7F, cage);
        animal = new Frog(true, 5 ,true, 4,"Dendrobatidae Frog","Female",1.5F, cage2);
        
    }

}
