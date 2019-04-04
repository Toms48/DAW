/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicatestparametrizado;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Antonio Jesus
 */
public class metodos2unitarioTest {
    
    public metodos2unitarioTest() {
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
     * Test of repiteCaracter method, of class metodos2.
     */
    @Test
    public void testRepiteCaracter() {
        System.out.println("repiteCaracter");
        String cadena = "antonio";
        String caracter = "o";
        int expResult = 2;
        int result = metodos2.repiteCaracter(cadena, caracter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
