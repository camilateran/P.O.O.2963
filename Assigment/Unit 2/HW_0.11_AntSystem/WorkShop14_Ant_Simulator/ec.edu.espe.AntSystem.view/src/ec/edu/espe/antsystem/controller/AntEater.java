package ec.edu.espe.antsystem.controller;

import ec.edu.espe.antsystem.model.Cell;

/**
 *
 * @author Jerico Ruiz
 */
public class AntEater {

    private Cell position;
    private int antEatenCounter;
    private int runCounter;

    private enum state {HUNTING, EATING}
    
    PheromoneDrop pdrop = new PheromoneDrop();

    public void run() {

        for (int i = 0; i < 4; i++) {

            antEatenCounter = antEatenCounter + 1;
            System.out.println("Ant eater is " + state.HUNTING + " ant N° " + antEatenCounter);
            pdrop.run(i);
            System.out.println("Ant eater is " + state.EATING + " ant N° " + antEatenCounter);

        }

    }

}
