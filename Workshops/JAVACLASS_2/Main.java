import java.util.ArrayList;
import java.util.Scanner;


public class Main{
    public static void main(String[] arg){

        Scanner scn = new Scanner(System.in);
        //LISTA
        //int [] vector = new int[5];
        //<>TIPOS DE DATOS
        ArrayList<Person> list = new ArrayList<Person>();
        //AÑADIR
        /*list.add(5);
        list.add(3);
        list.add(9);
        list.add(6);*/
        /*list.add("Camila");
        list.add("Juan");
        list.add("Cami");

        //ACCEDER
        list.get(1);*/
        while(true){
            System.out.println("Ingrese nombre y edad: ");
            //String name = scn.nextLine();
            String aux = scn.nextLine();
            // aux = "camila 19 sangolqui"
            String [] vector = aux.split(" ");
            //vector [0]= "Camila"
            //vector[1]= "19"
            if(aux.equals("")){
                break;
            }
            String name = vector[0];
            int age = Integer.parseInt(vector[1]);
            
            Person person = new Person(name, age);
            list.add(person);
        /*    System.out.println("Ingrese edad: ");
            int age = Integer.parseInt(scn.nextLine());

            Person person = new Person(name,age);*/

            //list.add(person);
        }  
        System.out.println("--FOR NORMAL ");
        for(int i=0; i < list.size(); i++){
            Person aux = list.get(i);
            System.out.println(aux.getName() + " - " + aux.getAge());
        }
        
        //NO IMPORTA EL TAMAÑO foreach
        System.out.println("--FOREACH ");
        for(Person aux : list){
            System.out.println(aux.getName() + " - " + aux.getAge());
        }

       /* Person person = new Person("Camila",19);
        list.add(person);
        Person person2 = list.get(0);
        System.out.println(person.getName());*/




    }
}