/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.File;

import java.util.Scanner;

/**
 *
 * @author camyt
 */
public class File {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Information book = new Information();
        int op;
     

       do {

            book.listBook();
              
            
            System.out.println(book);
            
            System.out.println("Enter (1) to add ");
            System.out.println("Enter another number to finish");
            op = in.nextInt();

             

        } while (op == 1);
       

        book.EscribirCSV("File.csv");

    }
    
    
}
