package ec.edu.espe.movie.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int op;
        do{
        Movie movies = new Movie("","",12,"");
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
        movies.listmovie(title,synopsis,year,genre);
        System.out.println("Enter (1)");
        op = in.nextInt();
        }while(op ==1);
    
    
    
    }
       
    
    
}
