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
        String resultadoEsperado = "Manzanas";
        instance.setNombre("Manzanas");
        String resultadoObtenido = instance.getNombre();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of setOrigenMatPrima method, of class Articulo.
     */
    @Test
    public void testSetOrigenMatPrima() {
        String resultadoEsperado = "Campo";
        instance.setOrigenMatPrima("Campo");
        String resultadoObtenido = instance.getOrigenMatPrima();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of setPrecio method, of class Articulo.
     */
    @Test
    public void testSetPrecio() {
        int precio = 20;
        instance.setPrecio(20);
        int expResult = instance.getPrecio();
        assertEquals(expResult, precio);
    }

    /**
     * Test of setMaterial method, of class Articulo.
     */
    @Test
    public void testSetMaterial() {
        String resultadoEsperado = "Organico";
        instance.setMaterial("Organico");
        String resultadoObtenido = instance.getMaterial();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of setCodigo method, of class Articulo.
     */
    @Test
    public void testSetCodigo() {
        String resultadoEsperado= "1234AB";
        instance.setCodigo("1234AB");
        String resultadoObtenido= instance.getCodigo();
        assertEquals(resultadoEsperado,resultadoObtenido);
    }

    /**
     * Test of setEnvasesPosibles method, of class Articulo.
     */
    @Test
    public void testSetEnvasesPosibles() {
        ArrayList<Envase> resultadoEsperado = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        resultadoEsperado.add(e1);
        ArrayList<Envase> resultadoEsperado2 = new ArrayList<Envase>();
        Envase e2 = new Envase("plastico", "imagenEnvase", 3);
        resultadoEsperado2.add(e2);
        instance.setEnvasesPosibles(resultadoEsperado2);
        ArrayList<Envase> resultadoObtenido = instance.getEnvasesPosibles();
        assertEquals(resultadoEsperado.get(0).getTipo(), resultadoObtenido.get(0).getTipo());
    }

    /**
     * Test of setEnvaseElegido method, of class Articulo.
     */
    @Test
    public void testSetEnvaseElegido() {
        Envase resultadoEsperado = new Envase("plastico", "imagen", 3);
        instance.setEnvaseElegido(new Envase("plastico", "imagen", 3));
        Envase resultadoObtenido = instance.getEnvaseElegido();
        assertEquals(resultadoEsperado.getTipo(), resultadoObtenido.getTipo());
    }

    /**
     * Test of setRutaImagen method, of class Articulo.
     */
    @Test
    public void testSetRutaImagen() {
        String resultadoEsperado = "imagen";
        instance.setRutaImagen("imagen");
        String resultadoObtenido = instance.getRutaImagen();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of getNombre method, of class Articulo.
     */
    @Test
    public void testGetNombre() {
        String resultadoEsperado = "Pedro";
        instance.setNombre("Pedro");
        String resultadoObtenido = instance.getNombre();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of getOrigenMatPrima method, of class Articulo.
     */
    @Test
    public void testGetOrigenMatPrima() {
        String resultadoEsperado = "Campo";
        instance.setOrigenMatPrima("Campo");
        String resultadoObtenido = instance.getOrigenMatPrima();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of getPrecio method, of class Articulo.
     */
    @Test
    public void testGetPrecio() {
        int precio = 20;
        instance.setPrecio(20);
        int expResult = instance.getPrecio();
        assertEquals(expResult, precio);
    }

    /**
     * Test of getMaterial method, of class Articulo.
     */
    @Test
    public void testGetMaterial() {
        String resultadoEsperado = "Organico";
        instance.setMaterial("Organico");
        String resultadoObtenido = instance.getMaterial();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of getCodigo method, of class Articulo.
     */
    @Test
    public void testGetCodigo() {
        String resultadoEsperado= "1234AB";
        instance.setCodigo("1234AB");
        String resultadoObtenido= instance.getCodigo();
        assertEquals(resultadoEsperado,resultadoObtenido);
    }
    
    
    @Test
    public void testConstructorArticulo() {
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        envases.add(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
    }
        
    @Test
    public void testConstructorCopiaArticulo() {
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        envases.add(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        Articulo a2 = new Articulo(a1);
    }

    /**
     * Test of getEnvasesPosibles method, of class Articulo.
     */
    @Test
    public void testGetEnvasesPosibles() {
        ArrayList<Envase> resultadoEsperado = new ArrayList<>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        resultadoEsperado.add(e1);
        ArrayList<Envase> listaEnvases = new ArrayList<>();
        Envase e2 = new Envase("plastico", "imagenEnvase", 3);
        listaEnvases.add(e2);
        instance.setEnvasesPosibles(listaEnvases);
        ArrayList<Envase> resultadoObtenido = instance.getEnvasesPosibles();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of getEnvaseElegido method, of class Articulo.
     */
    @Test
    public void testGetEnvaseElegido() {
        Envase resultadoEsperado = new Envase("plastico", "imagen", 3);
        instance.setEnvaseElegido(new Envase("plastico", "imagen", 3));
        Envase resultadoObtenido = instance.getEnvaseElegido();
        assertEquals(resultadoEsperado.getTipo(), resultadoObtenido.getTipo());
    }

    /**
     * Test of getRutaImagen method, of class Articulo.
     */
    @Test
    public void testGetRutaImagen() {
        String resultadoEsperado = "imagen";
        instance.setRutaImagen("imagen");
        String resultadoObtenido = instance.getRutaImagen();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of equals method, of class Articulo.
     */
    @Test
    public void testEquals() {
        Articulo a = new Articulo();
        a.setNombre("Peras");
        instance.setNombre("Peras");
        boolean resultadoEsperado = true;
        boolean resultadoObtenido = instance.equals(a);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
    
}