
package ec.edu.espe.beveragetest.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Chocolate extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Mixing the powder");
    }

    @Override
    void addCondiments() {
        System.out.println("Making whipped cream");
    }
    
    public boolean wantsCondiments(){
    String answer = getUserInput();
    if(answer.toLowerCase().startsWith("y")){return true;}
    else{return false;}
    }
    
    private String getUserInput(){
    String answer = null;
        System.out.println("Would you like some whipped cream whit your chocolate(y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        return answer;
    }
}
