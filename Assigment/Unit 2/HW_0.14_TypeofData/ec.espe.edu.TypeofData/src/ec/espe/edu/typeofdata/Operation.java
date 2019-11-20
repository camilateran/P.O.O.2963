/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.typeofdata;

/**
 *
 * @author camyt
 */
public class Operation {
    public void verificateName(String name){
        boolean verificate = true;
        if(name.equals(name));
        {
           
        }
    }
    
    public void Year(int year){
        System.out.println("\"Your age is: "+(2020-year));
    }
    public void comment(float note1, float note2){
        double note12 = note1+note2;
        if(note12 <22){
            System.out.println("You lost the semester");
            System.exit(0);
        }
        else{
            System.out.println("You need to get " + (42-note12));
        }
    }
    public float average(float note1, float note2, float note3){
        float result = (note1+note2+note3)/3;
        return result;
    }
    public boolean approved(float result){
        if(result >14)
            return true;
        else
            return false;
    }
    
}
