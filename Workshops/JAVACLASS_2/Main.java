import java.util.ArrayList;
import java.util.Scanner;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;


public class Main{
    public static void main(String[] arg){

        Scanner scn = new Scanner(System.in);
        ArrayList<Person> list = new ArrayList<Person>();
        while(true){
            System.out.println("Ingrese nombre - edad - cedula : ");
            String datos = scn.nextLine();
            String [] vector = datos.split(" ");

            if (datos.equals(" ")){
                break;
            }
            String name = vector[0];
            int age = Integer.parseInt(vector[1]);
            String dni = vector[2];
            String aux = dni;
            int cd= Integer.parseInt(aux);
            //Validacion
            int cont=0;
            int[] digitos= new int[10];
            for (int i=0; i<10; i++){
                digitos[i]=0;
            }
            int i=9;
            int coc=0;
            do{
                coc= cd/10;
                cont++;
                digitos[i]=cd%10;
                i--;
                cd= coc;                
            }while(coc!=0);
            if (cont==10){
                if((digitos[0]<=24 && digitos[0]>=1)&&(digitos[1]<=24 && digitos[1]>=1)){
                    if(digitos[2]>=0 && digitos[2]<6){
                        int sumapar=0, sumaimpar=0;
                        for (int j=0; j<9; j+=2){
                            int mult= digitos[j]*2;
                            if(mult>9){
                                mult-=9;
                            }
                            sumapar+=mult;
                        }
                        for (int j=1; j<8; j+=2){
                            sumaimpar+=digitos[j];
                        }
                        int sumat= sumapar+ sumaimpar;
                        int digito= 10-(sumat%10);
                        if(digito!=digitos[9]){
                            System.out.println("Cedula Invalida");
                        }
                        else {
                            Person person = new Person(name, age, aux);
                            list.add(person); 
                        }
                    }    
                    else{
                        System.out.println("Tercer digito incorrecto");   
                        break; 
                    }
                }
                else{
                    System.out.println("Digito de provincia incorrecto"); 
                    break;
                }
            }
            else{
                System.out.println("Longitud de digitos incorrecto");
                break;
            }       
        }
        System.out.println(" LISTA ");
        for (int i=0; i< list.size(); i++){
            Person datos = list.get(i);
            System.out.println(datos.getName()+ "- " + datos.getAge()+ "- " + datos.getDni());
        } 
        
        
        
     /*   
        
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
        list.get(1);
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

            Person person = new Person(name,age);

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