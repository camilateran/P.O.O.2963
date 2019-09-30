
package csv;


import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author DTj
 */
public class CSV {

    public static void main(String[] args) throws IOException {
       ArrayList<RegistryBaby> registry =new ArrayList();
       registry.add(new RegistryBaby("Camila","Teran","Robayo",23,01,2000));
       registry.add(new RegistryBaby("Daniela","Sandoval","Lopez",2,05,1986));
       registry.add(new RegistryBaby("Diego","Paredes","Leon",15,12,2010));
         
      CsvWriter csvWriter= new CsvWriter("RegistrosNaciemiento.csv"); 
      
      for(RegistryBaby registrybaby : registry){
          String[] datos = registrybaby.getArray();
         
          csvWriter.writeRecord(datos);
      }
       csvWriter.close();
    }
    
}
