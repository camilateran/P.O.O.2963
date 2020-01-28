
package designpattern.view;

import designpattern.controller.Button;
import designpattern.controller.GUIFactory;



public class ClientApp {
    public static void main(String[] args) {
       
        GUIFactory aFactory = GUIFactory.getFactory();
        Button aButton = aFactory.createButton(); 
        aButton.caption = "Play"; 
        aButton.paint();
        
        
        
      
       

    }
}
