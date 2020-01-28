/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.controller;

/**
 *
 * @author camyt
 */
public abstract class GUIFactory {
    public static GUIFactory getFactory() {
       
    int sys = readFromConfigFile("OS_TYPE"); 
    if (sys == 0){
        return (new WinFactory());
    }
    else 
        return (new LinuxFactory());
} 

public abstract Button createButton();
public abstract Menu createMenu();

}
