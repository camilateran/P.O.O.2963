
package ec.edu.espe.movie.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Movie {
    private String title;
    private String synopsis;
    private int year;
    private String genre;

    
    public Movie(String title, String synopsis, int year, String genre){
        this.title= title;
        this.genre=genre;
        this.year= year;
        this.synopsis = synopsis;
    }

    
    public void listmovie(String title, String synopsis, int year, String genre){
        Scanner in = new Scanner(System.in);
        Director director = new Director();
        List movie = new ArrayList();
        movie.add(title);
        movie.add(synopsis);
        movie.add(year);
        movie.add(genre);
        System.out.println("Enter name director: ");
        String name = in.nextLine();
        movie.add(name= director.getName());
        System.out.println("Enter lastname: ");
        String lastname = in.nextLine();
        movie.add(lastname = director.getLastname());
        System.out.println("Enter country: ");
        String country = in.nextLine();
        movie.add(country = director.getCountry());
        System.out.println(movie);
        
     
        
    }
    
    
}
