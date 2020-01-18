/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.view;

import singleton.controller.Singleton;

/**
 *
 * @author camyt
 */
public class SingletonClient {
     public static void main(String[] args){
         Singleton camila = Singleton.getSingletonData("camila");
         Singleton emilio = Singleton.getSingletonData("emilio");
         System.out.println(camila.getName());
         System.out.println(emilio.getName());
     }
}
