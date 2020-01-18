/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.controller;

/**
 *
 * @author camyt
 */
public class ConcreteFactory1 extends AbstractFactory{
    @Override
    public void createProductA(){
        ProductA1 pdA = new ProductA1();
        System.out.println("productA in Factory 1");
    }
    
    @Override
    public void  createProductB(){
        ProductB1 pdB = new ProductB1();
        System.out.println("productB in Factory 1");
        
    }
    
  
   
    
}
