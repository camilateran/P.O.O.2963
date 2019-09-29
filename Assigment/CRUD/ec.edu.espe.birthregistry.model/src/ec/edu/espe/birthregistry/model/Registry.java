package ec.edu.espe.birthregistry.model;

import java.io.File;
import java.io.FileWriter;
import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Camila Teran
 */
public class Registry {

    public static void main(String[] args) {
       
        menuOptions();
        
    }

    public static void menuOptions() {
        Scanner in = new Scanner(System.in);
        int option;
        System.out.println("Menu");
        System.out.println("1. Registrarse");
        System.out.println("2. Lista");
        System.out.println("3. Actualizar");
        System.out.println("4. Borrar");
        System.out.println("5. Salir");
        System.out.print("Seleccione su opcion: ");
        option = in.nextInt();
        do {
            switch (option) {
                case 1:
                  Entry ent = new Entry();
                    ent.nameInformation();
                    ent.lastnameoffather();
                    ent.lastnameofmother();
                    ent.date();
                    ent.month();
                    ent.year();
                    menuOptions();
                    break;
                case 2:
                    FileCsv rd = new FileCsv();
                    rd.readInformation();
                    
                    
                    break;
                case 3:
                    break;
                case 4:
                    break;
                
                case 5:
                    System.out.println("---Fin---");
                default:
                    break;

            }
        } while (option != 5);
        
    }

}
