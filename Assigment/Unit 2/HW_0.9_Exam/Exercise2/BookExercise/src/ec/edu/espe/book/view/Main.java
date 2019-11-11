package ec.edu.espe.book.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Book book = new Book();
        int op;
        int cont = 0;  

       do {

            book.listBook();
              
            
            System.out.println(book);
            
            System.out.println("Enter (1) to add ");
            System.out.println("Enter another number to finish");
            op = in.nextInt();
            cont += 1;
             

        } while (op == 1);
        book.countBook(cont);

        book.EscribirCSV("Book.csv");

    }
    

}
