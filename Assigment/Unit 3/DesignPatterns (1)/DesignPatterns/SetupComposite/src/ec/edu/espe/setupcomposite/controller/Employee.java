
package ec.edu.espe.setupcomposite.controller;


public abstract class Employee {
    String name = "not assigned yet";
    String title = "not asigned yet";
    
    public void stateName(){
        System.out.println(title + name);
    }
}
