/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class DateLiberyTest {
    
    public DateLiberyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of edad method, of class DateLibery.
     */
    @Test
    public void testEdad() {
        System.out.println("edad");
        String fecha_nac = "29/11/2019";
        DateLibery instance = new DateLibery();
        instance.edad(fecha_nac);
      
    }
    
}
