
package ec.edu.espe.chickenfarmers.view;

//import ec.edu.espe.chickenfarmers.model.Chicken;
import ec.edu.espe.chikenfarmers.mode.Chicken;
import ec.edu.espe.chikenfarmers.mode.Coop;
import java.util.ArrayList;

public class ChickenFarmers {
   
    public static void main(String[] args) {
        Coop cp= new Coop();
        Chicken ch[]= new Chicken[5];
        ch[0] = new Chicken("Pam");
        ch[1] = new Chicken("Lore");  
        ch[2] = new Chicken("Panchi");
        ch[3] = new Chicken("Pio");
        ch[4] = new Chicken("Paty");
        ch[0].doStuff(0);
      
    }

    
}
