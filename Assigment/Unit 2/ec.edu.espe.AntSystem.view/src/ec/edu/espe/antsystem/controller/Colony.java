/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antsystem.controller;

import ec.edu.espe.antsystem.model.Ant;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DTj
 */
public class Colony {
    
    private Ant ant;
    private List<Ant> listant = new ArrayList<Ant>();
   
    
    public void run(){
    
        for (int i = 0; i <=3;i++){
            ant = new Ant();
            listant.add(ant);

        }
        System.out.println("-->" +listant);
        System.out.println("I am a ant in class C " + Colony.class.getCanonicalName());
        System.out.println("my bs size is " + listant.size());
    }
}
