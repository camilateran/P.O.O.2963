
package ec.edu.espe.beveragetest.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
    
    public boolean wantsCondiments(){
    String answer = getUserInput();
    if(answer.toLowerCase().startsWith("y")){return true;}
    else{return false;}
    }
    
    private String getUserInput(){
    String answer = null;
        System.out.println("Would you like milk and sugar whit your coffee(y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        return answer;
    }
}
