/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antsystem.controller;

import ec.edu.espe.antsystem.model.Ant;
import ec.edu.espe.antsystem.model.Cell;

/**
 *
 * @author Jerico Ruiz
 */
public class PheromoneDrop {

    private int currentLevel;
    private Cell cells;
    Ant ant = new Ant();

    public void run(int j) {

        //ant.run();
        //for (int i = 0; i < 10; i++) {
        int i = j+1;
        System.out.println("Ant N° " + i + " is running and droping Pheromones");
        //}

    }
}
