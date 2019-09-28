
package ec.edu.espe.birthregistry.model;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Camila Teran
 */
public class Registry {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option;
        System.out.println("Menu");
        System.out.println("1. Registrarse");
        System.out.println("2. Lista");
        System.out.println("3. Actualizar");
        System.out.println("4. Borrar");
        
        System.out.println("Ingrese un numero: ");
        option = in.nextInt();
        
        switch(option){
            case 1:
                Entry ent = new Entry();
                break;
            case 2:
                Read rd= new Read();
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
                
                
        }
        
      
    }

 
}

 
