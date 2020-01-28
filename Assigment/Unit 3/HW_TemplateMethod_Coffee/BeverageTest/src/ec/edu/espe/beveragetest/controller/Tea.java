
package ec.edu.espe.beveragetest.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Steep the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
    
    public boolean wantsCondiments(){
    String answer = getUserInput();
    if(answer.toLowerCase().startsWith("y")){return true;}
    else{return false;}
    }
    
    private String getUserInput(){
    String answer = null;
        System.out.println("Would you like lemon whit your tea(y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        return answer;
    }
    
    
}
