/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author camyt
 */
public class DateActual {
    
    private Date dateAct = new Date();
    
    public Date valDate(String date){
        Date val = null;
        Date dates;
        try {
            dates = new SimpleDateFormat("yyyy/MM/dd").parse(date);
            String dateString = new SimpleDateFormat("yyyy/MM/dd").format(dates);
          
                        
            
            if(dateString.equals(dates)){
                val=dates;
                    if(dates.after(dateAct)){
                        
                        dates =null;
                    }
                    
            }
            else {
                  dates = null;
            }
            
            
            
        } catch (ParseException ex) {
            Logger.getLogger(DateActual.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return val;
    }
    
}
