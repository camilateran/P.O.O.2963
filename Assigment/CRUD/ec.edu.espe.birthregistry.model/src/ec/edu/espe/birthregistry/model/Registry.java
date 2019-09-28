/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.birthregistry.model;

/*
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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
        List<Create> Registry= new ArrayList<Create>();
        Registry.add(new Create ("Daniela", "Lopez", "Sandoval","27", "Septiembre", "2019", "3.4 kg"));
        ExportarCSV(Registry);
    }
    public static void ExportarCSV(List<Create> create){
        String salidaArchivo = "Registros.csv";
        boolean existe = new File(salidaArchivo).exists();
        if (existe){
            File archivoRegistro = new File(salidaArchivo);
            archivoRegistro.delete();
        }
        try {
            CsvWriter salidaCSV = new CsvWriter(new FileWriter(salidaArchivo, true));
        salidaCSV.write("Nombre ");
        salidaCSV.write("Apellido paterno ");
        salidaCSV.write("Apellido materno ");
        salidaCSV.write("Día ");
        salidaCSV.write("Mes ");
        salidaCSV.write("Año ");
        salidaCSV.write("Peso ");
        
        salidaCSV.endRecord();
     
        for (Create user: create){
            salidaCSV.write(user.getName());
            salidaCSV.write(user.getLastnameoffahter());
            salidaCSV.write(user.getLastnameofmother());
            salidaCSV.write(user.getDate());
            salidaCSV.write(user.getMonth());
            salidaCSV.write(user.getYear());
            salidaCSV.write(user.getWeight());
            
            salidaCSV.endRecord();
        }
        
        salidaCSV.close(); 
            
        } catch (IOException e){
            e.printStackTrace();
            
        }
        
    }

    private String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
