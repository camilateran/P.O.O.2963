/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author camyt
 */
public class DateActualTest {
    
    public DateActualTest() {
    }
    
   

    /**
     * Test of valDate method, of class DateActual.
     */
    @Test
    public void testValDate() throws ParseException {
        System.out.println("valDate");
        String date = "2020/12/17";
        DateActual instance = new DateActual();
        Date expResult = new SimpleDateFormat("yyyy/MM/dd").parse(date);
        Date result = instance.valDate(date);
        assertEquals(expResult, result);
       
    }
    
}
