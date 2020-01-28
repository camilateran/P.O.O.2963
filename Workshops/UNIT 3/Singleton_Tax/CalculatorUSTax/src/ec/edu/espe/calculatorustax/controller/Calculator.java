
package ec.edu.espe.calculatorustax.controller;


public class Calculator {
    public static void main(String args[]){
    USTax tax = USTax.getInstance();
    
    tax.salesTotal();
    }
}
