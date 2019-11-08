
package ec.edu.espe.book.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadCsv {
      public static void main(String[] args){
        Book book;
        
        try{
            BufferedReader entrada = new BufferedReader(new FileReader("Book.csv"));
            //OJO
            String author = null;
            String books = null,editorial = null;
            int year;
            while((year=entrada.read())!= 0){
                    author=entrada.readLine();
                    books=entrada.readLine();
                    editorial=entrada.readLine();
                    
            }
            book = new Book(author,books,editorial,year);
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
