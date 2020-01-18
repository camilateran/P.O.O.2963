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
public class ConcreteFactory2 extends AbstractFactory{
    @Override
    public void createProductA(){
        ProductA2 pdA = new ProductA2();
        System.out.println("productA in Factory 2");
    }
    
    @Override
    public void createProductB(){
        ProductB2 pdB = new ProductB2();
        System.out.println("productB in Factory 2");
        
    }
}
