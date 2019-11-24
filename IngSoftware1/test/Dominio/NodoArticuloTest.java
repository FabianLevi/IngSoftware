/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.ArrayList;
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
public class NodoArticuloTest {
    
   private NodoArticulo instance;
    
    public NodoArticuloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new NodoArticulo();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getArticulo method, of class NodoArticulo.
     */
    @Test
    public void testGetArticulo() {
        Articulo resultadoEsperado = new Articulo("bananas", "campo", 50, "organico", "AABB2", null, null, "imagen");
        instance.setArticulo(new Articulo("bananas", "campo", 50, "organico", "AABB2", null, null, "imagen"));
        Articulo resultadoObtenido = instance.getArticulo();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of setArticulo method, of class NodoArticulo.
     */
    @Test
    public void testSetArticulo() {
        Articulo resultadoEsperado = new Articulo("bananas", "campo", 50, "organico", "AABB2", null, null, "imagen");
        instance.setArticulo(new Articulo("bananas", "campo", 50, "organico", "AABB2", null, null, "imagen"));
        Articulo resultadoObtenido = instance.getArticulo();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of getCantVendidas method, of class NodoArticulo.
     */
    @Test
    public void testGetCantVendidas() {
        int resultadoEsperado = 10;
        instance.setCantVendidas(10);
        int resultadoObtenido = instance.getCantVendidas();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of setCantVendidas method, of class NodoArticulo.
     */
    @Test
    public void testSetCantVendidas() {
        int resultadoEsperado = 10;
        instance.setCantVendidas(10);
        int resultadoObtenido = instance.getCantVendidas();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
    
    /**
     * Test of getCantDonados method, of class NodoArticulo.
     */
    @Test
    public void testGetCantDonados() {
        int resultadoEsperado = 5;
        instance.setCantDonados(5);
        int resultadoObtenido = instance.getCantDonados();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of setCantDonados method, of class NodoArticulo.
     */
   @Test
    public void testSetCantDonados() {
        int resultadoEsperado = 5;
        instance.setCantDonados(5);
        int resultadoObtenido = instance.getCantDonados();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
    
    /**
     * Test of equals method, of class NodoArticulo.
     */
    @Test
    public void testEquals() {
        Articulo a1 = new Articulo();
        a1.setNombre("Peras");
        NodoArticulo nodoArt = new NodoArticulo(a1, 3, 2);
        Articulo a2 = new Articulo();
        a2.setNombre("Peras");
        instance.setArticulo(a2);
        boolean resultadoEsperado = true;
        boolean resultadoObtenido = instance.equals(nodoArt);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
    
}
