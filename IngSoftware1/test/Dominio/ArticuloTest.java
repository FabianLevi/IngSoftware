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
 * @author Fabian
 */
public class ArticuloTest {
    
    private Articulo instance;
    
    public ArticuloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Articulo();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setNombre method, of class Articulo.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Articulo instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrigenMatPrima method, of class Articulo.
     */
    @Test
    public void testSetOrigenMatPrima() {
        System.out.println("setOrigenMatPrima");
        String origenMatPrima = "";
        Articulo instance = null;
        instance.setOrigenMatPrima(origenMatPrima);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio method, of class Articulo.
     */
    @Test
    public void testSetPrecio() {
        
        int precio = 20;
        instance.setPrecio(precio);
        int expResult = instance.getPrecio();
        assertEquals(expResult, precio);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMaterial method, of class Articulo.
     */
    @Test
    public void testSetMaterial() {
        System.out.println("setMaterial");
        String material = "";
        Articulo instance = null;
        instance.setMaterial(material);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Articulo.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        String codigo = "";
        Articulo instance = null;
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnvasesPosibles method, of class Articulo.
     */
    @Test
    public void testSetEnvasesPosibles() {
        System.out.println("setEnvasesPosibles");
        ArrayList<Envase> envasesPosibles = null;
        Articulo instance = null;
        instance.setEnvasesPosibles(envasesPosibles);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnvaseElegido method, of class Articulo.
     */
    @Test
    public void testSetEnvaseElegido() {
        System.out.println("setEnvaseElegido");
        Envase envaseElegido = null;
        Articulo instance = null;
        instance.setEnvaseElegido(envaseElegido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRutaImagen method, of class Articulo.
     */
    @Test
    public void testSetRutaImagen() {
        System.out.println("setRutaImagen");
        String rutaImagen = "";
        Articulo instance = null;
        instance.setRutaImagen(rutaImagen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Articulo.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Articulo instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrigenMatPrima method, of class Articulo.
     */
    @Test
    public void testGetOrigenMatPrima() {
        System.out.println("getOrigenMatPrima");
        Articulo instance = null;
        String expResult = "";
        String result = instance.getOrigenMatPrima();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecio method, of class Articulo.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Articulo instance = null;
        int expResult = 0;
        int result = instance.getPrecio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaterial method, of class Articulo.
     */
    @Test
    public void testGetMaterial() {
        System.out.println("getMaterial");
        Articulo instance = null;
        String expResult = "";
        String result = instance.getMaterial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigo method, of class Articulo.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Articulo instance = null;
        String expResult = "";
        String result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnvasesPosibles method, of class Articulo.
     */
    @Test
    public void testGetEnvasesPosibles() {
        System.out.println("getEnvasesPosibles");
        Articulo instance = null;
        ArrayList<Envase> expResult = null;
        ArrayList<Envase> result = instance.getEnvasesPosibles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnvaseElegido method, of class Articulo.
     */
    @Test
    public void testGetEnvaseElegido() {
        System.out.println("getEnvaseElegido");
        Articulo instance = null;
        Envase expResult = null;
        Envase result = instance.getEnvaseElegido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRutaImagen method, of class Articulo.
     */
    @Test
    public void testGetRutaImagen() {
        System.out.println("getRutaImagen");
        Articulo instance = null;
        String expResult = "";
        String result = instance.getRutaImagen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
