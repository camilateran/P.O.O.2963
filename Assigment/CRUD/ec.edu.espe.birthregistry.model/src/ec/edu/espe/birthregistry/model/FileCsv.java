
package ec.edu.espe.birthregistry.model;


import com.csvreader.CsvReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author DTj
 */
public class FileCsv {
  Entry ent=new Entry();
  Scanner sc=new Scanner(System.in);
  String name;
  public void readInformation(){
    /*try{
      CsvReader reader = new CsvReader (new FileReader("RegistryBaby.csv"));  
      String[] nextline;
      while((nextline= reader.readNext())!= null)
      {
          if (nextline!= null)
          {
              System.out.println(Arrays.toString(nextline));
          }
      }
    }catch(Exception e)
    {
        System.out.println(e);
    }
            */
  }
               
}
