/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.templatemethod.controller;

/**
 *
 * @author camyt
 */
public abstract class Drive {
    public final String driveCar(){
        return startCar() + brakeCar()+ gearsCar();
    }
    private String startCar(){
        return "Carro encendido\n";
    }
    private String brakeCar(){
        return "Frenando carro\n";
    }
    public abstract String gearsCar();
}
