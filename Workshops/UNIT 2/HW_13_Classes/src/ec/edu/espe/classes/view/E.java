
package ec.edu.espe.classes.view;

public class E {
    private B[] bs= new B[5];
    
    public void m(D d){
        System.out.println("Method of class E");
      
        //IMPRIMIR DIFERENTES DATOS
        System.out.println("FOR SIMPLE");
        for(int i=0; i<bs.length; i++){
            System.out.println(">> ("+i+" )"+bs[i].toString());
        }
        System.out.println("FOR");
        for(B b:bs){
            System.out.println(">> "+b.toString());
        }
        
        
    }
}

