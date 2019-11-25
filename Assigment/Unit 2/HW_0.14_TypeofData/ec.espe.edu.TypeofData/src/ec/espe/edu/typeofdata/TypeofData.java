/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.typeofdata;

import java.util.Scanner;

/**
 *
 * @author camyt
 */
public class TypeofData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       Operation operation = new Operation();
       
        System.out.println("Enter name: ");
        String name = in.nextLine();
        operation.verificateName(name);
        System.out.println("Enter year of birth: ");
        int year = in.nextInt();
        operation.Year(year);
        System.out.println("Enter note(1) ");
        float note1 = in.nextFloat();
        System.out.println("Enter note(2) ");
        float note2 = in.nextFloat(); 
        operation.comment(note1, note2);
        System.out.println("Enter note(3) ");
        float note3 = in.nextFloat(); 
        float result= operation.average(note1, note2, note3);
        boolean pass = operation.approved(result);
        
        if(pass == true){
            System.out.println("You pass the semester");
        }
        else {
            System.out.println("You lost the semester");
        }
        
        
        
        
    }
    
}
