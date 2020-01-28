package ec.edu.espe.beveragetest.controller;




import ec.edu.espe.beveragetest.controller.Canelazo;
import ec.edu.espe.beveragetest.controller.Chocolate;
import ec.edu.espe.beveragetest.controller.Coffee;
import ec.edu.espe.beveragetest.controller.Tea;


public class BeverageTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Tea tea = new Tea();
        Coffee coffe = new Coffee();
        Chocolate chocolate = new Chocolate();
        Canelazo canelazo = new Canelazo();
        System.out.println("\nMakin tea...");
        tea.prepareRecipe();
        System.out.println("\nMaking coffe...");
        coffe.prepareRecipe();
        System.out.println("\nMaking chocolate");
        chocolate.prepareRecipe();
        System.out.println("\nMaking canelazo");
        canelazo.prepareRecipe();
        
    }
    
}
