/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.File;

/**
 *
 * @author camyt
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadCsv {
      public static void main(String[] args){
        Information book;
        
        try{
            BufferedReader entrada = new BufferedReader(new FileReader("File.csv"));
            //OJO
            String name = null;
            String lastName = null;
            int day = 0 , month = 0, year;
         
            while((year=entrada.read())!= 0){
                    name=entrada.readLine();
                    lastName=entrada.readLine();
                                        
            }
            book = new Information(name,lastName,day,month,year);
            System.out.println(book);
             if(entrada!= null){
                 entrada.close();
            }
            
        }
       
        catch(IOException ex){
            System.out.println("Error");
            ex.printStackTrace();
        }
        
        
    }
    
    
}