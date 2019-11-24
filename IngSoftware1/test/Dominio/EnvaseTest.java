/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sabrina
 */
public class EnvaseTest {
    
    private Envase instance;
    
    public EnvaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Envase();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDanoAmbiental method, of class Envase.
     */
    @Test
    public void testGetDanoAmbiental() {
        int expResult = 1;
        instance.setDanoAmbiental(1);
        int result = instance.getDanoAmbiental();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDanoAmbiental method, of class Envase.
     */
    @Test
    public void testSetDanoAmbiental() {
        int resultadoEsperado = 1;
        instance.setDanoAmbiental(1);
        int resultadoObtenido= instance.getDanoAmbiental();
        assertEquals(resultadoEsperado,resultadoObtenido);
    }

    /**
     * Test of setTipo method, of class Envase.
     */
    @Test
    public void testSetTipo() {
        String resultadoEsperado = "vidrio";        
        instance.setTipo("vidrio");
        String resultadoObtenido = instance.getTipo();
        assertEquals(resultadoEsperado,resultadoObtenido);
    }

    /**
     * Test of setRutaImagen method, of class Envase.
     */
    @Test
    public void testSetRutaImagen() {
        String resultadoEsperado = "imagen";
        instance.setRutaImagen("imagen");
        String resultadoObtenido = instance.getRutaImagen();
        assertEquals(resultadoEsperado,resultadoObtenido);
    }

    /**
     * Test of getTipo method, of class Envase.
     */
    @Test
    public void testGetTipo() { 
        String resultadoEsperado = "vidrio";        
        instance.setTipo("vidrio");
        String resultadoObtenido = instance.getTipo();
        assertEquals(resultadoEsperado,resultadoObtenido);
    }

    /**
     * Test of getRutaImagen method, of class Envase.
     */
    @Test
    public void testGetRutaImagen() {
        String resultadoEsperado = "imagen";
        instance.setRutaImagen("imagen");
        String resultadoObtenido = instance.getRutaImagen();
        assertEquals(resultadoEsperado,resultadoObtenido);
    }

    /**
     * Test of toString method, of class Envase.
     */
    @Test
    public void testToString() {
        String resultadoEsperado = "Vidrio";
        instance.setTipo("Vidrio");
        String resultadoObtenido = instance.toString();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
    
}
