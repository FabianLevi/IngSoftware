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
public class NodoEnvaseTest {
    
    private NodoEnvase instance;
    
    public NodoEnvaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new NodoEnvase();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEnvase method, of class NodoEnvase.
     */
    @Test
    public void testGetEnvase() {
        NodoEnvase nodo = new NodoEnvase((new Envase("plastico", "imagen", 3)), 4);
        Envase resultadoEsperado = nodo.getEnvase();
        Envase e = new Envase("plastico", "imagen", 3);
        instance.setEnvase(e);
        Envase resultadoObtenido = instance.getEnvase();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of setEnvase method, of class NodoEnvase.
     */
    @Test
    public void testSetEnvase() {
        NodoEnvase nodo = new NodoEnvase((new Envase("plastico", "imagen", 3)), 4);
        Envase resultadoEsperado = nodo.getEnvase();
        Envase e = new Envase("plastico", "imagen", 3);
        instance.setEnvase(e);
        Envase resultadoObtenido = instance.getEnvase();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of getCantVendidas method, of class NodoEnvase.
     */
    @Test
    public void testGetCantVendidas() {
        int resultadoEsperado = 10;
        instance.setCantVendidas(10);
        int resultadoObtenido = instance.getCantVendidas();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of setCantVendidas method, of class NodoEnvase.
     */
    @Test
    public void testSetCantVendidas() {
         int resultadoEsperado = 10;
        instance.setCantVendidas(10);
        int resultadoObtenido = instance.getCantVendidas();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
    
}