/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.birthregistry.model;

import java.io.File;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Camila Teran
 */
public class Registry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("---Birth Registry---");
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("1. Registrarse");
        System.out.println("1. Registrarse");
        System.out.println("1. Registrarse");
        System.out.println("1. Registrarse");
        
        opcion = entrada.nextInt();
        switch (opcion){
            case 1:
              Create();
                break;
            case 2:
                Read();
                break;
            case 3:
                Update();
                break;
            case 4:
                Delete();
                break;
            default:
                break;
        }
                
        
    }
    public static void ExportarCSV(List<Create> create){
        String salidaArchivo = "Registros.csv";
        boolean existe = new File(salidaArchivo).exists();
    }
    
}
