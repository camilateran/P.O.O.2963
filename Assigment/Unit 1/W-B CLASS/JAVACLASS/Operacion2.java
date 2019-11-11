public class Operacion2{
    public Operacion2(int num){
        int n= ++num;
        int fact=1;
        for (int i=1; i<=n; i++){
            fact=fact*i;
        }
        System.out.println("El factorial del numero mas uno es: "+fact);
    }
}