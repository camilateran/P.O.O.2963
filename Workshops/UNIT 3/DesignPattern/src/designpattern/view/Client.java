
package designpattern.view;

import designpattern.controller.ConcreteFactory1;
import designpattern.controller.ConcreteFactory2;


public class Client {
    public static void main(String[] args) {
             
       ConcreteFactory1 cF1 = new ConcreteFactory1();
       cF1.createProductA();
       cF1.createProductB();
  
       ConcreteFactory2 cF2 = new ConcreteFactory2();
       cF2.createProductA();
       cF2.createProductB();
      
       

    }
}
