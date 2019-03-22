/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

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
public class CalculadoraTest {
    
    Calculadora instance = new Calculadora();
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance.setNumero1(10);
        instance.setNumero2(5);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNumero1 method, of class Calculadora.
     */
    @Test
    public void testGetNumero1() {
        System.out.println("getNumero1");
        Calculadora instance = new Calculadora();
        double expResult = 10.0;
        double result = instance.getNumero1();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero2 method, of class Calculadora.
     */
    @Test
    public void testGetNumero2() {
        System.out.println("getNumero2");
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.getNumero2();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero1 method, of class Calculadora.
     */
    @Test
    public void testSetNumero1() {
        System.out.println("setNumero1");
        double numero1 = 0.0;
        Calculadora instance = new Calculadora();
        instance.setNumero1(numero1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero2 method, of class Calculadora.
     */
    @Test
    public void testSetNumero2() {
        System.out.println("setNumero2");
        double numero2 = 0.0;
        Calculadora instance = new Calculadora();
        instance.setNumero2(numero2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        Calculadora instance = new Calculadora(4,5);
        double expResult = 9.0;
        double result = instance.suma();
        assertEquals(expResult, result, 0.0);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        //Calculadora instance = new Calculadora(8,5);
        double expResult = 2.0;
        double result = instance.resta();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        if(expResult != result){
            fail("Esto está mal campeón");
        }
    }

    /**
     * Test of division method, of class Calculadora.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        //Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.division();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicacion method, of class Calculadora.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        //Calculadora instance = new Calculadora(5,5);
        double expResult = 20.0;
        double result = instance.multiplicacion();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
