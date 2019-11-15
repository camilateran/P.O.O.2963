
package ec.edu.espe.antsystem.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jerico Ruiz
 */
public class Cell {
    private int row = 0;
    private int col = 0;
    
    
    
    public void receivepheromone (){
        
        System.out.println("Pheromone recieved position" + getRow() + getCol());
        setRow(getRow() + 1);
        setCol(getCol() + 1);
        
    }

    
    
    public List GetsAnts(){
        List<Ant> listants = new ArrayList<>();

        return listants;
    }

    /**
     * @return the row
     */
    public int getRow() {
        return row;
    }

    /**
     * @param row the row to set
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * @return the col
     */
    public int getCol() {
        return col;
    }

    /**
     * @param col the col to set
     */
    public void setCol(int col) {
        this.col = col;
    }
   
}
