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
        Entry ent = new Entry();
        Read rd = new Read();
        menuOptions();

        System.out.println("Ingrese un numero: ");
        option = in.nextInt();

        do {
            switch (option) {
                case 1:

                    break;
                case 2:
                    
                    break;
                case 3:
                    break;
                case 4:
                    break;
                
                case 5:
                    System.out.println("---Fin---");
                default:
                    System.out.println("Digite numeros del 1 al 5");
                    break;

            }
        } while (option != 5);

    }

    public static void menuOptions() {
        System.out.println("Menu");
        System.out.println("1. Registrarse");
        System.out.println("2. Lista");
        System.out.println("3. Actualizar");
        System.out.println("4. Borrar");
        System.out.println("5. Salir");
        System.out.print("Seleccione su opcion -> ");
    }

}
