/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Enums.enumCE;
import Enums.enumGenero;
import java.util.ArrayList;
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
public class PeliculaTest {
    
    public PeliculaTest() {
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
     * Test of getTitulo method, of class Pelicula.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Pelicula instance = new Pelicula();
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDirector method, of class Pelicula.
     */
    @Test
    public void testGetDirector() {
        System.out.println("getDirector");
        Pelicula instance = new Pelicula();
        String expResult = "";
        String result = instance.getDirector();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuracion method, of class Pelicula.
     */
    @Test
    public void testGetDuracion() {
        System.out.println("getDuracion");
        Pelicula instance = new Pelicula();
        int expResult = 0;
        int result = instance.getDuracion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGenero method, of class Pelicula.
     */
    @Test
    public void testGetGenero() {
        System.out.println("getGenero");
        Pelicula instance = new Pelicula();
        enumGenero expResult = null;
        enumGenero result = instance.getGenero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClasificacionEdad method, of class Pelicula.
     */
    @Test
    public void testGetClasificacionEdad() {
        System.out.println("getClasificacionEdad");
        Pelicula instance = new Pelicula();
        enumCE expResult = null;
        enumCE result = instance.getClasificacionEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVecesVista method, of class Pelicula.
     */
    @Test
    public void testGetVecesVista() {
        System.out.println("getVecesVista");
        Pelicula instance = new Pelicula();
        int expResult = 0;
        int result = instance.getVecesVista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isVista method, of class Pelicula.
     */
    @Test
    public void testIsVista() {
        System.out.println("isVista");
        Pelicula instance = new Pelicula();
        boolean expResult = false;
        boolean result = instance.isVista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNota method, of class Pelicula.
     */
    @Test
    public void testGetNota() {
        System.out.println("getNota");
        Pelicula instance = new Pelicula();
        int expResult = 0;
        int result = instance.getNota();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHorasTotales method, of class Pelicula.
     */
    @Test
    public void testGetHorasTotales() {
        System.out.println("getHorasTotales");
        double expResult = 0.0;
        double result = Pelicula.getHorasTotales();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGenero method, of class Pelicula.
     */
    @Test
    public void testSetGenero() {
        System.out.println("setGenero");
        enumGenero genero = null;
        Pelicula instance = new Pelicula();
        instance.setGenero(genero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClasificacionEdad method, of class Pelicula.
     */
    @Test
    public void testSetClasificacionEdad() {
        System.out.println("setClasificacionEdad");
        enumCE clasificacionEdad = null;
        Pelicula instance = new Pelicula();
        instance.setClasificacionEdad(clasificacionEdad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResenia method, of class Pelicula.
     */
    @Test
    public void testGetResenia() {
        System.out.println("getResenia");
        Pelicula instance = new Pelicula();
        String expResult = "";
        String result = instance.getResenia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class Pelicula.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Pelicula instance = new Pelicula();
        instance.setTitulo(titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDirector method, of class Pelicula.
     */
    @Test
    public void testSetDirector() {
        System.out.println("setDirector");
        String director = "";
        Pelicula instance = new Pelicula();
        instance.setDirector(director);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDuracion method, of class Pelicula.
     */
    @Test
    public void testSetDuracion() {
        System.out.println("setDuracion");
        int duracion = 0;
        Pelicula instance = new Pelicula();
        instance.setDuracion(duracion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVecesVista method, of class Pelicula.
     */
    @Test
    public void testSetVecesVista() {
        System.out.println("setVecesVista");
        int vecesVista = 0;
        Pelicula instance = new Pelicula();
        instance.setVecesVista(vecesVista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVista method, of class Pelicula.
     */
    @Test
    public void testSetVista() {
        System.out.println("setVista");
        boolean vista = false;
        Pelicula instance = new Pelicula();
        instance.setVista(vista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNota method, of class Pelicula.
     */
    @Test
    public void testSetNota() {
        System.out.println("setNota");
        int nota = 0;
        Pelicula instance = new Pelicula();
        instance.setNota(nota);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHorasTotales method, of class Pelicula.
     */
    @Test
    public void testSetHorasTotales() {
        System.out.println("setHorasTotales");
        double horasTotales = 0.0;
        Pelicula.setHorasTotales(horasTotales);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResenia method, of class Pelicula.
     */
    @Test
    public void testSetResenia() {
        System.out.println("setResenia");
        String resenia = "";
        Pelicula instance = new Pelicula();
        instance.setResenia(resenia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Pelicula.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Pelicula instance = new Pelicula();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarHorasTotales method, of class Pelicula.
     */
    @Test
    public void testActualizarHorasTotales() {
        System.out.println("actualizarHorasTotales");
        ArrayList<Pelicula> arrayPeliculas = null;
        Pelicula.actualizarHorasTotales(arrayPeliculas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarInfo method, of class Pelicula.
     */
    @Test
    public void testEditarInfo() {
        System.out.println("editarInfo");
        Pelicula instance = new Pelicula();
        instance.editarInfo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
