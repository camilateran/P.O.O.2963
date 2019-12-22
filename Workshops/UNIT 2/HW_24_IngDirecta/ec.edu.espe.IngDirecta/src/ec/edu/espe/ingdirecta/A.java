/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//dependencia parametro o return
//asociacion atributos
package ec.edu.espe.ingdirecta;

import java.util.ArrayList;

/**
 *
 * @author camyt
 */
public class A {

   private B[] bs = new B[3];
   // como c es abtracta solo toma las otras clases que estan aliadas con C 
   private ArrayList<F> fs = new ArrayList<F>();
   private ArrayList<G> gs = new ArrayList<G>();
   private ArrayList<H> hs = new ArrayList<H>();
   
   
   

    public A() {
    }

    /**
     * @return the bs
     */
    public B[] getBs() {
        return bs;
    }

    /**
     * @param bs the bs to set
     */
    public void setBs(B[] bs) {
        this.bs = bs;
    }

    /**
     * @return the fs
     */
    public ArrayList<F> getFs() {
        return fs;
    }

    /**
     * @param fs the fs to set
     */
    public void setFs(ArrayList<F> fs) {
        this.fs = fs;
    }

    /**
     * @return the gs
     */
    public ArrayList<G> getGs() {
        return gs;
    }

    /**
     * @param gs the gs to set
     */
    public void setGs(ArrayList<G> gs) {
        this.gs = gs;
    }

    /**
     * @return the hs
     */
    public ArrayList<H> getHs() {
        return hs;
    }

    /**
     * @param hs the hs to set
     */
    public void setHs(ArrayList<H> hs) {
        this.hs = hs;
    }

    @Override
    public String toString() {
        return "A{" + "bs=" + bs + ", fs=" + fs + ", gs=" + gs + ", hs=" + hs + '}';
    }
    
    
   
    
}

