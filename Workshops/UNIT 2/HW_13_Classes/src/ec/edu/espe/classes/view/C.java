
package ec.edu.espe.classes.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class C {
    //private B bs[];
    private List<B> bs = new ArrayList();
    
    public void m(E e){
        System.out.println("Metod of class C");
        //AÑADIR DATOS
        B b;
        for (int i = 0; i <=3;i++){
            b = new B();
            bs.add(b);
        }
        System.out.println("Size: "+bs.size());
        System.out.println("FOR EACH");
        
        //IMPRIMIR DATOS
        
        bs.forEach((n)-> System.out.println(n));
        System.out.println("WHILE");
        int i=0;
        while( i < bs.size()){
            System.out.println(">> "+ bs.get(i));
            i++;
        }
        System.out.println("ITERATOR");
        Iterator bsIterator  = bs.iterator();
        while(bsIterator.hasNext()) {
            System.out.println(">> " + bsIterator.next());
        }
        
    
    }
}
