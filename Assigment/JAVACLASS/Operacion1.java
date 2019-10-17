
public class Operacion1{
    public Operacion1(int num){
        if (num%2==0){
            System.out.println("El numero es par");
            System.out.println("Lista de numeros par: ");
            for (int i=0; i<=num; i+=2){
                System.out.println(i);
            }
        }
        else{
            System.out.println("El numero es impar");
            System.out.println("Lista de numeros impares: ");
            for (int i=1; i<=num; i+=2){
                System.out.println(i);
            }
        }
        
        
        
    }

}