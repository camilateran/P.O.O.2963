
package ec.edu.espe.beveragetest.controller;


public abstract class CaffeineBeverage {
    void prepareRecipe(){
    boilWater();
    brew();
    pourlnCup();
    if(wantsCondiments()){addCondiments();}
    }
    
    void boilWater(){
        System.out.println("Boiling water");}
    
        abstract void brew();
    void pourlnCup(){
        System.out.println("Pouring into cup");
    }
    
    
        abstract void addCondiments();
        boolean wantsCondiments(){
        return true;
        }
    }
    

