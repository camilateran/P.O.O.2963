
package ec.edu.espe.movie.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Movie {
    private String title;
    private String synopsis;
    private int year;
    private String genre;
    private Director director;

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    
    public Movie(String title, String synopsis, int year, String genre){
        this.title= title;
        this.genre=genre;
        this.year= year;
        this.synopsis = synopsis;
    }
    public Movie(){
        
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    
    public void showmoviedata(String title, String synopsis, int year, String genre, String name, String lastname,String country){
        
        List movie = new ArrayList();
        Director director = new Director();
        movie.add(getTitle());
        movie.add(getSynopsis());
        movie.add(getYear());
        movie.add(getGenre());
        movie.add(getDirector().getName());
        movie.add(getDirector().getLastname());
        movie.add(getDirector().getCountry());
        System.out.println(">" +movie);
        
    }   
    
    
    
    
    
}
