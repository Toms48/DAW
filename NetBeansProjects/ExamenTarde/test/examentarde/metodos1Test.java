/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examentarde;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author t-m-1
 */
public class metodos1Test {
    
    public metodos1Test() {
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
     * Test of juntarCadenas method, of class metodos1.
     */
    @Test
    public void testJuntarCadenas() {
        System.out.println("juntarCadenas");
        String cadena1 = "Ole ole";
        String cadena2 = " los caracole";
        String expResult = "Ole ole los caracole";
        String result = metodos1.juntarCadenas(cadena1, cadena2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
