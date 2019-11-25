/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.File;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author camyt
 */

public class Information {
    private String name;
    private String lastName;
    private int day;
    private int month;
    private int year;

    public Information(String name, String lastName, int day, int month, int year) {
        this.name = name;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    
    public Information(){
        
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
        
        System.out.println("Enter name: ");
        books.add(this.name = in.nextLine());
        System.out.println("Enter lastname: ");
        books.add(this.lastName = in.nextLine());
        System.out.println("Enter day: ");
        books.add(this.day = in.nextInt());
        System.out.println("Enter month: ");
        books.add(this.month = in.nextInt());
        System.out.println("Enter year: ");
        books.add(this.year= in.nextInt()); 
        System.out.println(books);
    }
    
    
    //ARCHIVOS
    @Override
        public String toString(){
           String cad="";
           cad += "- " +this.name+"- "+this.lastName+ "-"+this.day+"- "+this.month+"- "+this.year;
        return cad;
    }
    public void EscribirCSV(String nombreFichero){
        java.io.File f;
          f = new java.io.File(nombreFichero);
          if(f.exists()){
              f.delete();
          }
          FileWriter flujoSalida=null;
          BufferedWriter salida=null;
          try{
              flujoSalida = new FileWriter(f);
              salida = new BufferedWriter(flujoSalida);
              salida.write("Name;LastName;Day;Month;Year");
              salida.newLine();
              salida.write(this.name+";");
              salida.write(this.lastName+";");
              salida.write(this.day+";");
              salida.write(this.month+";");
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

