/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

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
public class PersonaTest {
    
        Persona instance = new Persona("Tomas", "Nuñez", 20, 79.00, 1.72);
    
    public PersonaTest() {
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
     * Test of toString method, of class Persona.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        //Persona instance = new Persona();
        //String expResult = "";
        System.out.println(instance.toString());
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcularIMC method, of class Persona.
     */
    @Test
    public void testCalcularIMC() {
        System.out.println("calcularIMC");
        //Persona instance = new Persona();
        int expResult = -1;
        int result = instance.calcularIMC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of esMayorDeEdad method, of class Persona.
     */
    @Test
    public void testEsMayorDeEdad() {
        System.out.println("esMayorDeEdad");
        //Persona instance = new Persona();
        boolean expResult = true;
        boolean result = instance.esMayorDeEdad();
        assertEquals(expResult, result);
        //assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of comprobarSexo method, of class Persona.
     */
    @Test
    public void testComprobarSexo() {
        System.out.println("comprobarSexo");
        //Persona instance = new Persona();
        instance.comprobarSexo();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
