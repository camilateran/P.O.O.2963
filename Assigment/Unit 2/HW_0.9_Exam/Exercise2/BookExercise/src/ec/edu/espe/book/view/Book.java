
package ec.edu.espe.book.view;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Book {
    private String title;
    private String author;
    private String editorial;
    private int year;

    public Book(String title, String author, String editorial, int year) {
        this.title = title;
        this.author = author;
        this.editorial = editorial;
        this.year = year;
    }
    public Book(){
        
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public void listBook(){
        Scanner in = new Scanner(System.in);
        List books = new ArrayList();
        
        System.out.println("Enter title: ");
        books.add(this.title = in.nextLine());
        System.out.println("Enter author: ");
        books.add(this.author = in.nextLine());
        System.out.println("Enter editorial: ");
        books.add(this.editorial = in.nextLine());
        System.out.println("Enter year: ");
        books.add(this.year= in.nextInt()); 
        System.out.println(books);
    }
    
    public void countBook(int cont){
        System.out.println("Number of books are: "+cont);
    }
    //ARCHIVOS
    @Override
        public String toString(){
           String cad="";
           cad += "- " +this.title+"- "+this.author+ "-"+this.editorial+"- "+this.year;
        return cad;
    }
    public void EscribirCSV(String nombreFichero){
        File f;
          f = new File(nombreFichero);
          if(f.exists()){
              f.delete();
          }
          FileWriter flujoSalida=null;
          BufferedWriter salida=null;
          try{
              flujoSalida = new FileWriter(f);
              salida = new BufferedWriter(flujoSalida);
              salida.write("Title;Author;Editorial;Year");
              salida.newLine();
              salida.write(this.title+";");
              salida.write(this.author+";");
              salida.write(this.editorial+";");
              salida.write(this.year+";");              
              
              salida.newLine();
              salida.close();
              flujoSalida.close();
          }
          catch(IOException ex){
              System.out.println("Error");
              ex.printStackTrace();
          }
          finally{
             try{
                 salida.close();
                 flujoSalida.close();
             }
             catch(IOException ex){
              System.out.println("Error");
              ex.printStackTrace();
            }
             
          }
    }
}
    
    /*
    public boolean lookfor(String author){
        
        boolean found = false;
        int i=0;
        while(found == false && i<books.size()){
            
        }
        return true;
    }*/

   

