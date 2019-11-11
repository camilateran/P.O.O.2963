package ec.edu.espe.movie.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int op;
        do{
        Movie movies = new Movie();
        Director director = new Director();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter title: ");
        String title = in.nextLine();
        System.out.println("Enter synopsis: ");
        String synopsis = in.nextLine();
        System.out.println("Enter year: ");
        int year = in.nextInt();
        in.nextLine();
        System.out.println("Enter genre: ");
        String genre = in.nextLine();
              
       
        System.out.println("Enter name director");
        String name = in.nextLine();
        director.setName(name);
        System.out.println("Enter lastname director: ");
        String lastname = in.nextLine();
        System.out.println("Enter country: ");
        String country = in.nextLine();
        
        movies.setTitle(title);
        movies.setSynopsis(synopsis);
        movies.setYear(year);
        movies.setGenre(genre);
        movies.setDirector(director);
      /*  director.setName(name);
        director.setLastname(lastname);
        director.setCountry(country);*/
        
        movies.showmoviedata(title, synopsis, year, genre,name,lastname,country);
        System.out.println("Enter (1)");
        op = in.nextInt();
        }while(op == 1);
    
    
    
    }
       
    
    
}
