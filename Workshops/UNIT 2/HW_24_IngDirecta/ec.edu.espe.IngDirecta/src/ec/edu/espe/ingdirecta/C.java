/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ingdirecta;

/**
 *
 * @author camyt
 */
public abstract class C {
    private D d;
    private E e;

    public C() {
        
    }

    public C(D d, E e) {
        this.d = d;
        this.e = e;
    }
    
  
    
    public abstract void  print();

    @Override
    public String toString() {
        return "C{" + "d=" + getD() + ", e=" + getE() + '}';
    }

    /**
     * @return the d
     */
    public D getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(D d) {
        this.d = d;
    }

    /**
     * @return the e
     */
    public E getE() {
        return e;
    }

    /**
     * @param e the e to set
     */
    public void setE(E e) {
        this.e = e;
    }
    
    
   
    
}
