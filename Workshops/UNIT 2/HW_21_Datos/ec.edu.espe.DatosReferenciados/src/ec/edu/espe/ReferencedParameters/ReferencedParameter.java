/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ReferencedParameters;

import com.google.gson.Gson;

/**
 *
 * @author camyt
 */
public class ReferencedParameter {

     static int p=5;
     static int q=5;
     
    public static void main(String[] args) {
        System.out.println("before method");
        System.out.println("p --> "+p);
        System.out.println("q--> "+q);
       
        int r=0;
        r= sum(p,q);
        System.out.println("after method");
        System.out.println("p --> "+p);
        System.out.println("q--> "+q);
        System.out.println("r--> "+r);
        
        Person person = new Person(1,"camila");
        System.out.println("antes del metodo: "+person);
        viewName(person);
        System.out.println("despues del metodo: "+person);
        
        Gson gson = new Gson();
        String jsonString = gson.toJson(person);
        System.out.println("json: "+jsonString);
        
        String json2 = "{\"id\":100,\"name\":\"Daniel\"} ";
        System.out.println("json2 : "+json2);
        Person pp = gson.fromJson(json2,Person.class);
        System.out.println("pp: "+pp);
                
        
        
        
        
    }
    public static int sum(int a, int b){
        int c;
        a=20;
        b=30;
        c= a+b;
        return c;
    }
    public static void viewName(Person p){
        System.out.println(">>person primera linea del metodo: "+p);
        p.setId(10);
        p.setName("Juana");
        System.out.println(">>person ultima linea del metodo:"+p);
    }
}
