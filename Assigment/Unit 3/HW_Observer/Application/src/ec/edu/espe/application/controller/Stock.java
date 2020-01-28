
package ec.edu.espe.application.controller;

import java.util.ArrayList;
import java.util.Iterator;


public class Stock {
    protected String symbol;
    protected double price;
    private ArrayList investors = new ArrayList();
    
    public Stock(){}
    public void addObserver(IInvestor iinvestor){
        investors.add(iinvestor);
    }
    
    public void deleteObserver(IInvestor iinvestor){
    investors.remove(iinvestor);
    }
    
    public void notifyObservers(Object args){
    Iterator i = investors.iterator();
    while(i.hasNext()){
    IInvestor iinvestor = (IInvestor)i.next();
    iinvestor.update(this,args);}
    }
    }



