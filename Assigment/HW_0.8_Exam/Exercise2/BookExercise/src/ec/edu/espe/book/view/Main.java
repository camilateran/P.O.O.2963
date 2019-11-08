
package ec.edu.espe.book.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
        Book books = new Book();
        int op;
        int cont =0;
        List<Book> book = new ArrayList();     
        
        do{
            
            books.listBook();
            System.out.println("Enter (1) to add ");
            System.out.println("Enter another number to finish");
            op =in.nextInt();
            cont+=1;
            
        }while(op==1);
        books.countBook(cont);
        
        books.EscribirCSV("Book.csv");
        
    }
    
}

