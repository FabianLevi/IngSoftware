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
public class ArticuloTablaTest {
    
     private ArticuloTabla instance;
    
    public ArticuloTablaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new ArticuloTabla(); 
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
        public void testConstructorArticuloTabla() {
        ArticuloTabla artTabla = new ArticuloTabla("bananas", 100, 3);
    }

    
    /**
     * Test of getNombre method, of class ArticuloTabla.
     */
    @Test
    public void testGetNombre() {
        String resultadoEsperado = "Naranjas";
        instance.setNombre("Naranjas");
        String resultadoObtenido = instance.getNombre();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of setNombre method, of class ArticuloTabla.
     */
    @Test
    public void testSetNombre() {
        String resultadoEsperado = "Naranjas";
        instance.setNombre("Naranjas");
        String resultadoObtenido = instance.getNombre();
        assertEquals(resultadoEsperado, resultadoObtenido);
        
    }

    /**
     * Test of getPrecio method, of class ArticuloTabla.
     */
    @Test
    public void testGetPrecio() {
        int resultadoEsperado = 100;
        instance.setPrecio(100);
        int resultadoObtenido = instance.getPrecio();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of setPrecio method, of class ArticuloTabla.
     */
    @Test
    public void testSetPrecio() {
        int resultadoEsperado = 100;
        instance.setPrecio(100);
        int resultadoObtenido = instance.getPrecio();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of getCantVendidas method, of class ArticuloTabla.
     */
    @Test
    public void testGetCantVendidas() {
        int resultadoEsperado = 10;
        instance.setCantVendidas(10);
        int resultadoObtenido = instance.getCantVendidas();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of setCantVendidas method, of class ArticuloTabla.
     */
    @Test
    public void testSetCantVendidas() {
        int resultadoEsperado = 10;
        instance.setCantVendidas(10);
        int resultadoObtenido = instance.getCantVendidas();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of equals method, of class ArticuloTabla.
     */
    @Test
    public void testEquals() {
        ArticuloTabla art = new ArticuloTabla();
        art.setNombre("Peras");
        instance.setNombre("Peras");
        boolean resultadoEsperado = true;
        boolean resultadoObtenido = instance.equals(art);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
    
}