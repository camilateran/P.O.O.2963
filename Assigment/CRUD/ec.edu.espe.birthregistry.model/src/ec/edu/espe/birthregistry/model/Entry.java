
package ec.edu.espe.birthregistry.model;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author DTj
 */
public class Entry {
  
    Scanner registro = new Scanner(System.in);
    private String name;
    private String lastnameoffahter;
    private String lastnameofmother;
    private int date;
    private int month;
    private int year;

    public void Information() {
    System.out.println("Ingrese nombre: ");
      name = registro.nextLine();
     System.out.println("Ingrese apellido paterno: ");
     lastnameoffahter = registro.nextLine();
     System.out.println("Ingrese apellido materno: ");
     lastnameofmother = registro.nextLine(); 
     System.out.println("Ingrese dia: ");
     date = registro.nextInt();
     System.out.println("Ingrese mes: ");
     month = registro.nextInt();
     System.out.println("Ingrese año: ");
     year = registro.nextInt();
    }
    
    

    
   
  
   
   
   
   
   
     
     
     
   
    
   
   
    
   

   
    
}
