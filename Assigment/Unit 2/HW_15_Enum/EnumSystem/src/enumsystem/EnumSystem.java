/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumsystem;

import java.util.Scanner;

/**
 *
 * @author camyt
 */
public class EnumSystem {

    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter day: ");
        String day = in.next();
        DiaSemana dia = DiaSemana.valueOf(day.toUpperCase());
        
        System.out.println(dia.toString());
     
    }


 
    
    
}
