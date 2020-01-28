
package ec.edu.espe.setupcomposite.view;

import ec.edu.espe.setupcomposite.controller.Clerk;
import ec.edu.espe.setupcomposite.controller.Client;
import ec.edu.espe.setupcomposite.controller.Manager;
import ec.edu.espe.setupcomposite.controller.President;
import ec.edu.espe.setupcomposite.controller.Teller;


public class SetupComposite {


    public static void main(String[] args) {
        
        Teller lonny = new Teller("Lonny");
        Clerk cal = new Clerk("Cal");
        Manager able = new Manager("Able");
        able.add(lonny);
        able.add(cal);
        
        
        Teller juanita = new Teller("Juanita"); 
        Teller tina = new Teller("Tina");
        Teller thelma = new Teller("Thelma");
        Manager becky = new Manager("Becky");
        becky.add(juanita);
        becky.add(tina);
        becky.add(thelma);
        
        
        President pete = new President.getPresident("Pete");
        pete.add(able);
        pete.add(becky);
        
        Client.employee = pete;
        Client.doClientTasks();
        
    }
    
}
