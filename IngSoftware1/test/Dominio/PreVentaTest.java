/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.ArrayList;
import java.util.Date;
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
public class PreVentaTest {
    
    private PreVenta instance;
    
    public PreVentaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new PreVenta();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFecha method, of class PreVenta.
     */
    @Test
    public void testGetFecha() {
        Date resultadoEsperado = new Date(116, 5, 3);
        instance.setFecha(new Date(116, 5, 3));
        Date resultadoObtenido = instance.getFecha();
        assertEquals(resultadoEsperado,resultadoObtenido);
    }

    /**
     * Test of setFecha method, of class PreVenta.
     */
    @Test
    public void testSetFecha() {
        Date resultadoEsperado = new Date(116, 5, 3);
        instance.setFecha(new Date(116, 5, 3));
        Date resultadoObtenido = instance.getFecha();
        assertEquals(resultadoEsperado,resultadoObtenido);
    }

    /**
     * Test of getVentaRealizar method, of class PreVenta.
     */
    @Test
    public void testGetVentaRealizar() {
        ArrayList<NodoArticulo> listaArticulos = new ArrayList<NodoArticulo>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        envases.add(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        NodoArticulo na1 = new NodoArticulo(a1, 3, 2);
        listaArticulos.add(na1);
        Date fecha = new Date(116, 5, 3);
        Venta resultadoEsperado = new Venta(listaArticulos, fecha);
        instance.setVentaRealizar(new Venta(listaArticulos, fecha));
        Venta resultadoObtenido = instance.getVentaRealizar();
        assertEquals(resultadoEsperado,resultadoObtenido);
    }

    /**
     * Test of setVentaRealizar method, of class PreVenta.
     */
    @Test
    public void testSetVentaRealizar() {
        ArrayList<NodoArticulo> listaArticulos = new ArrayList<NodoArticulo>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        envases.add(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        NodoArticulo na1 = new NodoArticulo(a1, 3, 2);
        listaArticulos.add(na1);
        Date fecha = new Date(116, 5, 3);
        Venta resultadoEsperado = new Venta(listaArticulos, fecha);
        instance.setVentaRealizar(new Venta(listaArticulos, fecha));
        Venta resultadoObtenido = instance.getVentaRealizar();
        assertEquals(resultadoEsperado,resultadoObtenido);
    }

    /**
     * Test of getCodigo method, of class PreVenta.
     */
    @Test
    public void testGetCodigo() {
        String resultadoEsperado= "1234AB";
        instance.setCodigo("1234AB");
        String resultadoObtenido= instance.getCodigo();
        assertEquals(resultadoEsperado,resultadoObtenido);
    }

    /**
     * Test of setCodigo method, of class PreVenta.
     */
    @Test
    public void testSetCodigo() {
        String resultadoEsperado= "1234AB";
        instance.setCodigo("1234AB");
        String resultadoObtenido= instance.getCodigo();
        assertEquals(resultadoEsperado,resultadoObtenido);
    }
    
}
