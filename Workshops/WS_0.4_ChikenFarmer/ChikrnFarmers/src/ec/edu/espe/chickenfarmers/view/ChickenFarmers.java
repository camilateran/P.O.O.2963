package ec.edu.espe.chickenfarmers.view;

//import ec.edu.espe.chickenfarmers.model.Chicken;
public class ChickenFarmers {

    public static void main(String[] args) {

        Chicken chicken1 = new Chicken();
        System.out.println("--Farmer 1--");
        chicken1.setName("Lucy");
        chicken1.doStuff(0);
        chicken1.setName("Lore");
        chicken1.doStuff(1);
        chicken1.setName("Lupita");
        chicken1.doStuff(2);
        chicken1.setName("Mily");
        chicken1.doStuff(3);
        chicken1.setName("Moly");
        chicken1.doStuff(4);
       
        Chicken chicken2 = new Chicken();
        System.out.println("--Farmer 2--");
        chicken2.setName("Pilly");
        chicken2.doStuff(0);
        chicken2.setName("Gaby");
        chicken2.doStuff(1);
        chicken2.setName("Puly");
        chicken2.doStuff(2);
        chicken2.setName("Rita");
        chicken2.doStuff(3);
        chicken2.setName("Lucy");
        chicken2.doStuff(4);   

    }

}
