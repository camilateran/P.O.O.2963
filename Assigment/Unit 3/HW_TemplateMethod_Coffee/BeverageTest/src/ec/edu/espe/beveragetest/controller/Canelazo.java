
package ec.edu.espe.beveragetest.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Canelazo extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Cutting the oranges");
    }

    @Override
    void addCondiments() {
        System.out.println("Preparing the puntas");
    }
    
    public boolean wantsCondiments(){
    String answer = getUserInput();
    if(answer.toLowerCase().startsWith("y")){return true;}
    else{return false;}
    }
    
    private String getUserInput(){
    String answer = null;
        System.out.println("Would you like some puntas whit your canelazo(y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        return answer;
    }
}
