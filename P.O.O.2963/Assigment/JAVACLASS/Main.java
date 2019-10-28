public class Main{

    public static void main(String[] args){
        int num=55444454;

        if (num>10){
            if(num%10==5 || num%10==0){
                System.out.println("El numero es divisible para 5");
                Operacion1 op = new Operacion1(num);
            }
            else{
                System.out.println("El numero no es divisble para 5");
                Operacion2 ope= new Operacion2(num);
                
            }
        }
        else{            
            if (num%5==0){
                System.out.println("El numero es divisible para 5");
                Operacion1 op = new Operacion1(num);
            }
            else{
                System.out.println("El numero no es divisble para 5");
                Operacion2 ope= new Operacion2(num);
            }
        }


    }
}