/**
 *  tax computation class
 *  @author Camila Teran
 *  @version 0.0.1
 *  @since 2019-11-21
 */
package ec.edu.espe.taxes;


public class Tax {

    /**
     *  iva is the number assignated for the state 
     */
    private static float iva = 12.00F;
  
    /**
     * 
     * @param base the amount of money in dollars with two decimals
     * @return the iva value with two decimals
     */
    public static float computeIva(float base) {
       float ivaP;
       ivaP = iva*(base/100);
       return ivaP;
    }
    
}
