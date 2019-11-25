/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.ArrayList;
import java.util.Date;
import javafx.util.Pair;
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
public class SistemaTest {
    
    private Sistema instance;
    
    public SistemaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Sistema();
    }
    
    @After
    public void tearDown() {
    }
    
     @Test
    public void testConstructorSistema() {
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        envases.add(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        ArrayList<Articulo> articulos = new ArrayList<Articulo>();
        articulos.add(a1);
        ArrayList<NodoArticulo> listaArticulos = new ArrayList<NodoArticulo>();
        NodoArticulo na1 = new NodoArticulo(a1, 3, 2);
        listaArticulos.add(na1);
        Date fecha = new Date();
        Venta v = new Venta(listaArticulos, fecha);
        Sistema sis = new Sistema(envases, articulos, null, null, null, null, null, 4, v, null, null);
    }

    /**
     * Test of getListaEnvases method, of class Sistema.
     */
    @Test
    public void testGetListaEnvases() {
        ArrayList<Envase> resultadoEsperado = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        resultadoEsperado.add(e1);
        ArrayList<Envase> listaEnvases = new ArrayList<Envase>();
        listaEnvases.add(new Envase("plastico", "imagenEnvase", 3));
        instance.setListaEnvases(listaEnvases);        
        ArrayList<Envase> resultadoObtenido = instance.getListaEnvases();
        assertEquals(resultadoEsperado.get(0).getTipo(), resultadoObtenido.get(0).getTipo());
    }

    /**
     * Test of setListaEnvases method, of class Sistema.
     */
    @Test
    public void testSetListaEnvases() {
        ArrayList<Envase> resultadoEsperado = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        resultadoEsperado.add(e1);
        ArrayList<Envase> listaEnvases = new ArrayList<Envase>();
        listaEnvases.add(new Envase("plastico", "imagenEnvase", 3));
        instance.setListaEnvases(listaEnvases);        
        ArrayList<Envase> resultadoObtenido = instance.getListaEnvases();
        assertEquals(resultadoEsperado.get(0).getTipo(), resultadoObtenido.get(0).getTipo());
    }

    /**
     * Test of getListaArticulo method, of class Sistema.
     */
    @Test
    public void testGetListaArticulo() {
        ArrayList<Articulo> resultadoEsperado = new ArrayList<Articulo>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        envases.add(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        resultadoEsperado.add(a1);
        ArrayList<Articulo> listaArticulos = new ArrayList<Articulo>();
        listaArticulos.add(new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana"));
        instance.setListaArticulo(listaArticulos);
        ArrayList<Articulo> resultadoObtenido = instance.getListaArticulo();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of setListaArticulo method, of class Sistema.
     */
    @Test
    public void testSetListaArticulo() {
        ArrayList<Articulo> resultadoEsperado = new ArrayList<Articulo>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        envases.add(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        resultadoEsperado.add(a1);
        ArrayList<Articulo> listaArticulos = new ArrayList<Articulo>();
        listaArticulos.add(new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana"));
        instance.setListaArticulo(listaArticulos);
        ArrayList<Articulo> resultadoObtenido = instance.getListaArticulo();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
    

    /**
     * Test of getListaVentas method, of class Sistema.
     */
    @Test
    public void testGetListaVentas() {
        ArrayList<Venta> resultadoEsperado = new ArrayList<Venta>();
        ArrayList<NodoArticulo> listaArticulos = new ArrayList<NodoArticulo>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        envases.add(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        NodoArticulo na1 = new NodoArticulo(a1, 3, 2);
        listaArticulos.add(na1);
        Date fecha = new Date(116, 5, 3);
        Venta v = new Venta(listaArticulos, fecha);
        resultadoEsperado.add(v);
        ArrayList<Venta> ventas = new ArrayList<Venta>();
        ventas.add(new Venta(listaArticulos, fecha));
        instance.setListaVentas(ventas);
        ArrayList<Venta> resultadoObtenido = instance.getListaVentas();
        assertEquals(resultadoEsperado, resultadoObtenido);   
    }

    /**
     * Test of setListaVentas method, of class Sistema.
     */
    @Test
    public void testSetListaVentas() {
        ArrayList<Venta> resultadoEsperado = new ArrayList<Venta>();
        ArrayList<NodoArticulo> listaArticulos = new ArrayList<NodoArticulo>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        envases.add(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        NodoArticulo na1 = new NodoArticulo(a1, 3, 2);
        listaArticulos.add(na1);
        Date fecha = new Date(116, 5, 3);
        Venta v = new Venta(listaArticulos, fecha);
        resultadoEsperado.add(v);
        ArrayList<Venta> ventas = new ArrayList<Venta>();
        ventas.add(new Venta(listaArticulos, fecha));
        instance.setListaVentas(ventas);
        ArrayList<Venta> resultadoObtenido = instance.getListaVentas();
        assertEquals(resultadoEsperado, resultadoObtenido);  
    }

    /**
     * Test of getListaPreVenta method, of class Sistema.
     */
    @Test
    public void testGetListaPreVenta() {
        ArrayList<PreVenta> resultadoEsperado = new ArrayList<PreVenta>();
        ArrayList<NodoArticulo> listaArticulos = new ArrayList<NodoArticulo>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        envases.add(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        NodoArticulo na1 = new NodoArticulo(a1, 3, 2);
        listaArticulos.add(na1);
        Date fecha = new Date(116, 5, 3);
        Date fecha2 = new Date(120, 4, 6);
        Venta v = new Venta(listaArticulos, fecha);
        PreVenta preVenta = new PreVenta(fecha2, v, "VG53ED" );
        resultadoEsperado.add(preVenta);
        ArrayList<PreVenta> preV = new ArrayList<PreVenta>();
        preV.add(new PreVenta(fecha2, v, "VG53ED" ));
        instance.setListaPreVenta(preV);
        ArrayList<PreVenta> resultadoObtenido = instance.getListaPreVenta();
        assertEquals(resultadoEsperado, resultadoObtenido); 
    }

    /**
     * Test of setListaPreVenta method, of class Sistema.
     */
    @Test
    public void testSetListaPreVenta() {
        ArrayList<PreVenta> resultadoEsperado = new ArrayList<PreVenta>();
        ArrayList<NodoArticulo> listaArticulos = new ArrayList<NodoArticulo>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        envases.add(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        NodoArticulo na1 = new NodoArticulo(a1, 3, 2);
        listaArticulos.add(na1);
        Date fecha = new Date();
        Date fechaPV = new Date();
        Venta v = new Venta(listaArticulos, fecha);
        PreVenta p = new PreVenta(fechaPV, v, "3FR5");
        resultadoEsperado.add(p);
        ArrayList<PreVenta> PreVentas = new ArrayList<PreVenta>();
        PreVentas.add(new PreVenta(fechaPV, v, "3FR5"));
        instance.setListaPreVenta(PreVentas);
        ArrayList<PreVenta> resultadoObtenido = instance.getListaPreVenta();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of getListaArticulosVendidos method, of class Sistema.
     */
    @Test
    public void testGetListaArticulosVendidos() {
        ArrayList<NodoArticulo> resultadoEsperado = new ArrayList<NodoArticulo>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        envases.add(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        NodoArticulo na1 = new NodoArticulo(a1, 3, 2);
        resultadoEsperado.add(na1);
        ArrayList<NodoArticulo> articulosVendidos = new ArrayList<NodoArticulo>();
        articulosVendidos.add(new NodoArticulo(a1, 3, 2));
        instance.setListaArticulosVendidos(articulosVendidos);
        ArrayList<NodoArticulo> resultadoObtenido = instance.getListaArticulosVendidos();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of setListaArticulosVendidos method, of class Sistema.
     */
    @Test
    public void testSetListaArticulosVendidos() {
        ArrayList<NodoArticulo> resultadoEsperado = new ArrayList<NodoArticulo>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        envases.add(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        NodoArticulo na1 = new NodoArticulo(a1, 3, 2);
        resultadoEsperado.add(na1);
        instance.getListaArticulosVendidos().add(na1);
        ArrayList<NodoArticulo> resultadoObtenido = instance.getListaArticulosVendidos();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of getListaArticulosMasVendidos method, of class Sistema.
     */
    @Test
    public void testGetListaArticulosMasVendidos() {
        ArrayList<NodoArticulo> resultadoEsperado = new ArrayList<NodoArticulo>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        envases.add(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        NodoArticulo na1 = new NodoArticulo(a1, 3, 2);
        resultadoEsperado.add(na1);
        instance.getListaArticulosMasVendidos().add(new NodoArticulo(a1, 3, 2));
        ArrayList<NodoArticulo> resultadoObtenido = instance.getListaArticulosMasVendidos();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of setListaArticulosMasVendidos method, of class Sistema.
     */
    @Test
    public void testSetListaArticulosMasVendidos() {
        ArrayList<NodoArticulo> resultadoEsperado = new ArrayList<NodoArticulo>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        envases.add(e1);
        instance.agregarEnvase(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        instance.agregarArticulo(a1);
        NodoArticulo na1 = new NodoArticulo(a1, 3, 2);
        resultadoEsperado.add(na1);
        instance.setListaArticulosMasVendidos(resultadoEsperado);
        ArrayList<NodoArticulo> resultadoObtenido = instance.getListaArticulosMasVendidos();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of getCantVentas method, of class Sistema.
     */
    @Test
    public void testGetCantVentas() {
       int resultadoEsperado = 20;
       instance.setCantVentas(20);
       int resultadoObtenido = instance.getCantVentas();
       assertEquals(resultadoObtenido, resultadoEsperado);
    }

    /**
     * Test of setCantVentas method, of class Sistema.
     */
    @Test
    public void testSetCantVentas() {
       int resultadoEsperado= 20;
       instance.setCantVentas(20);
       int resultadoObtenido = instance.getCantVentas();
       assertEquals(resultadoObtenido, resultadoEsperado);
    }

    /**
     * Test of getArticulo method, of class Sistema.
     */
    @Test
    public void testGetArticulo() {
        int resultadoEsperado = 2;
        instance.setArticulo(2);
        int resultadoObtenido = instance.getArticulo();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of setArticulo method, of class Sistema.
     */
    @Test
    public void testSetArticulo() {
        int resultadoEsperado = 2;
        instance.setArticulo(2);
        int resultadoObtenido = instance.getArticulo();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of getVentaActual method, of class Sistema.
     */
    @Test
    public void testGetVentaActual() {
        ArrayList<NodoArticulo> listaArticulos = new ArrayList<NodoArticulo>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        envases.add(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        NodoArticulo na1 = new NodoArticulo(a1, 3, 2);
        listaArticulos.add(na1);
        Date fecha = new Date();
        Venta resultadoEsperado = new Venta(listaArticulos, fecha);
        instance.setVentaActual(new Venta(listaArticulos, fecha));
        Venta resultadoObtenido = instance.getVentaActual();
        assertEquals(resultadoEsperado,resultadoObtenido);
    }

    /**
     * Test of setVentaActual method, of class Sistema.
     */
    @Test
    public void testSetVentaActual() {
        ArrayList<NodoArticulo> listaArticulos = new ArrayList<NodoArticulo>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        envases.add(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        NodoArticulo na1 = new NodoArticulo(a1, 3, 2);
        listaArticulos.add(na1);
        Date fecha = new Date();
        Venta resultadoEsperado = new Venta(listaArticulos, fecha);
        instance.setVentaActual(new Venta(listaArticulos, fecha));
        Venta resultadoObtenido = instance.getVentaActual();
        assertEquals(resultadoEsperado,resultadoObtenido);
    }

    /**
     * Test of getListaEnvasesReutilizables method, of class Sistema.
     */
    @Test
    public void testGetListaEnvasesReutilizables() {
        ArrayList<NodoEnvase> resultadoEsperado = new ArrayList<NodoEnvase>();
        Envase e1 = new Envase("espuma plast", "imagen1",3);
        NodoEnvase ne1 = new NodoEnvase(e1, 3);
        resultadoEsperado.add(ne1);
        instance.getListaEnvasesReutilizables().add(new NodoEnvase(e1, 3));
        ArrayList<NodoEnvase> resultadoObtenido = instance.getListaEnvasesReutilizables();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of setListaEnvasesReutilizables method, of class Sistema.
     */
    @Test
    public void testSetListaEnvasesReutilizables() {
        ArrayList<NodoEnvase> resultadoEsperado = new ArrayList<NodoEnvase>();
        Envase e1 = new Envase("espuma plast", "imagen1",3);
        NodoEnvase ne1 = new NodoEnvase(e1, 3);
        resultadoEsperado.add(ne1);
        instance.getListaEnvasesReutilizables().add(new NodoEnvase(e1, 3));
        ArrayList<NodoEnvase> resultadoObtenido = instance.getListaEnvasesReutilizables();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of agregarVenta method, of class Sistema.
     */
    @Test
    public void testAgregarVenta() {
        ArrayList<NodoArticulo> listaArticulos = new ArrayList<NodoArticulo>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        envases.add(e1);
        instance.agregarEnvase(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        instance.agregarArticulo(a1);
        NodoArticulo na1 = new NodoArticulo(a1, 3, 2);
        listaArticulos.add(na1);
        Date fecha = new Date(116, 5, 3);
        Venta resultadoEsperado = new Venta(listaArticulos, fecha);
        instance.agregarVenta(resultadoEsperado);
        //instance.getListaVentas().add(new Venta(listaArticulos, fecha));
        Venta resultadoObtenido = instance.getListaVentas().get(0);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
    @Test
    public void testAgregarVenta2() {
        ArrayList<NodoArticulo> listaArticulos = new ArrayList<NodoArticulo>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        envases.add(e1);
        instance.agregarEnvase(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        instance.agregarArticulo(a1);
        NodoArticulo na1 = new NodoArticulo(a1, 3, 2);
        listaArticulos.add(na1);
        Date fecha = new Date(116, 5, 3);
        Venta resultadoEsperado = new Venta(listaArticulos, fecha);
        instance.agregarVenta(resultadoEsperado);
        ArrayList<NodoArticulo> listaArticulos2 = new ArrayList<NodoArticulo>();
        ArrayList<Envase> envases2 = new ArrayList<Envase>();
        Envase e2 = new Envase("plastico", "imagenEnvase", 3);
        envases.add(e2);
        instance.agregarEnvase(e2);
        Articulo a2 = new Articulo("manzana", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        instance.agregarArticulo(a2);
        NodoArticulo na2 = new NodoArticulo(a2, 3, 2);
        listaArticulos2.add(na2);
        Date fecha2 = new Date(116, 5, 3);
        Venta resultadoEsperado2 = new Venta(listaArticulos2, fecha2);
        instance.agregarVenta(resultadoEsperado2);
        //instance.getListaVentas().add(new Venta(listaArticulos, fecha));
        Venta resultadoObtenido = instance.getListaVentas().get(0);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of envasesReutilizables method, of class Sistema.
     */
    @Test
    public void testEnvasesReutilizables() {
        ArrayList<NodoArticulo> listaArticulos = new ArrayList<NodoArticulo>();
        ArrayList<NodoArticulo> listaArticulos2 = new ArrayList<NodoArticulo>();
        ArrayList<NodoEnvase> resultadoEsperado = new ArrayList<NodoEnvase>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        envases.add(e1);
        NodoEnvase ne1 = new NodoEnvase(e1, 3);
        Envase e2 = new Envase("espuma plast", "imagen1",3);
        instance.agregarEnvase(e1);
        instance.agregarEnvase(e2);
        NodoEnvase ne2 = new NodoEnvase(e2, 3);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        Articulo a2 = new Articulo("manzanas", "campo", 90, "organico", "G57YB", envases, e1, "imagenManzana");
        instance.agregarArticulo(a1);
        instance.agregarArticulo(a2);
        NodoArticulo na1 = new NodoArticulo(a1, 3, 2);
        NodoArticulo na2 = new NodoArticulo(a2, 5, 2);
        listaArticulos.add(na1);
        listaArticulos2.add(na2);
        Date fecha = new Date(116, 5, 3);
        Date fecha2 = new Date(120, 4, 6);
        Venta v1 = new Venta(listaArticulos,fecha);
        Venta v2 = new Venta(listaArticulos2,fecha);
        instance.agregarVenta(v1);
        instance.agregarVenta(v2);
        resultadoEsperado.add(ne1);
        resultadoEsperado.add(ne2);
        ArrayList<NodoEnvase> resultadoObtenido = instance.envasesReutilizables();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of articulosMasVendidos method, of class Sistema.
     */
    @Test
    public void testArticulosMasVendidos() {
        ArrayList<NodoArticulo> listaArticulos = new ArrayList<NodoArticulo>();
        ArrayList<NodoArticulo> listaArticulos2 = new ArrayList<NodoArticulo>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        envases.add(e1);
        instance.agregarEnvase(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        Articulo a2 = new Articulo("manzanas", "campo", 90, "organico", "G57YB", envases, e1, "imagenManzana");
        instance.agregarArticulo(a1);
        instance.agregarArticulo(a2);
        NodoArticulo na1 = new NodoArticulo(a1, 3, 2);
        NodoArticulo na2 = new NodoArticulo(a2, 5, 2);
        listaArticulos.add(na1);
        listaArticulos2.add(na2);
        Date fecha = new Date(116, 5, 3);
        Date fecha2 = new Date(120, 4, 6);
        Venta v1 = new Venta(listaArticulos,fecha);
        Venta v2 = new Venta(listaArticulos2,fecha);
        instance.agregarVenta(v1);
        instance.agregarVenta(v2);
        ArrayList<NodoArticulo> resultadoObtenido = instance.articulosMasVendidos();
        assertEquals(listaArticulos2, resultadoObtenido);
    }

    /**
     * Test of cantidadDeVentasEnMes method, of class Sistema.
     */
    @Test
    public void testCantidadDeVentasEnMes() {
        System.out.println("cantidadDeVentasEnMes");
        //int mes = 0;
        ArrayList<NodoArticulo> listaArticulos = new ArrayList<NodoArticulo>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
       // envases.add(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        NodoArticulo na1 = new NodoArticulo(a1, 3, 2);
        //listaArticulos.add(na1);
        Date fecha = new Date(116, 5, 3);
        Venta v = new Venta(listaArticulos, fecha);
        instance.agregarArticulo(a1);
        instance.agregarEnvase(e1);
        instance.agregarVenta(v);
        int cant = instance.cantidadDeVentasEnMes(5);
        assertEquals(1, cant);
    }

    /**
     * Test of agregarEnvase method, of class Sistema.
     */
    @Test
    public void testAgregarEnvase() {
        Envase e = new Envase("plastico", "imagenEnvase", 3);
        instance.agregarEnvase(e);
        ArrayList<Envase> aux = instance.getListaEnvases();
        assertEquals(e, aux.get(0));
    }

    /**
     * Test of preVentasAntesDeFecha method, of class Sistema.
     */
    @Test
    public void testPreVentasAntesDeFecha() {
        ArrayList<NodoArticulo> listaArticulos = new ArrayList<NodoArticulo>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
       // envases.add(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        NodoArticulo na1 = new NodoArticulo(a1, 3, 2);
        //listaArticulos.add(na1);
        Date fecha = new Date(116, 5, 3);
        Venta v = new Venta(listaArticulos, fecha);
        instance.agregarArticulo(a1);
        instance.agregarEnvase(e1);
        //instance.agregarVenta(v);
        PreVenta pv = new PreVenta();
        pv.setFecha(fecha);
        pv.setVentaRealizar(v);
        pv.setCodigo("123");
        instance.agregarPreVenta(pv);
        assertEquals(1, instance.preVentasAntesDeFecha().size());
    }
    @Test
    public void testPreVentasAntesDeFecha2() {
        ArrayList<NodoArticulo> listaArticulos = new ArrayList<NodoArticulo>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
       // envases.add(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        NodoArticulo na1 = new NodoArticulo(a1, 3, 2);
        //listaArticulos.add(na1);
        Date fecha = new Date(116, 10, 3);
        Venta v = new Venta(listaArticulos, fecha);
        instance.agregarArticulo(a1);
        instance.agregarEnvase(e1);
        //instance.agregarVenta(v);
        PreVenta pv = new PreVenta();
        pv.setFecha(fecha);
        pv.setVentaRealizar(v);
        pv.setCodigo("123");
        instance.agregarPreVenta(pv);
        assertEquals(1, instance.preVentasAntesDeFecha().size());
    }

    /**
     * Test of preVentasDespuesDeFecha method, of class Sistema.
     */
    @Test
    public void testPreVentasDespuesDeFecha() {
        ArrayList<NodoArticulo> listaArticulos = new ArrayList<NodoArticulo>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
       // envases.add(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        NodoArticulo na1 = new NodoArticulo(a1, 3, 2);
        //listaArticulos.add(na1);
        Date fecha = new Date(116, 11, 3);
        Venta v = new Venta(listaArticulos, fecha);
        instance.agregarArticulo(a1);
        instance.agregarEnvase(e1);
        PreVenta pv = new PreVenta();
        pv.setFecha(fecha);
        pv.setVentaRealizar(v);
        pv.setCodigo("123");
        instance.agregarPreVenta(pv);
        assertEquals(1, instance.preVentasDespuesDeFecha().size());
    }
    @Test
    public void testPreVentasDespuesDeFecha2() {
        ArrayList<NodoArticulo> listaArticulos = new ArrayList<NodoArticulo>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
       // envases.add(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        NodoArticulo na1 = new NodoArticulo(a1, 3, 2);
        //listaArticulos.add(na1);
        Date fecha = new Date(116, 10, 29);
        Venta v = new Venta(listaArticulos, fecha);
        instance.agregarArticulo(a1);
        instance.agregarEnvase(e1);
        PreVenta pv = new PreVenta();
        pv.setFecha(fecha);
        pv.setVentaRealizar(v);
        pv.setCodigo("123");
        instance.agregarPreVenta(pv);
        assertEquals(1, instance.preVentasDespuesDeFecha().size());
    }

    /**
     * Test of realizarVenta method, of class Sistema.
     */
    @Test
    public void testRealizarVenta() {
        ArrayList<NodoArticulo> listaArticulos = new ArrayList<NodoArticulo>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        instance.agregarEnvase(e1);
        //envases.add(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        NodoArticulo na1 = new NodoArticulo(a1, 3, 2);
        instance.agregarArticulo(a1);
       // listaArticulos.add(na1);
        Date fecha = new Date(116, 5, 3);
        Date fecha2 = new Date(120, 4, 6);
        Venta v = new Venta(listaArticulos, fecha);
        PreVenta preVenta = new PreVenta(fecha2, v, "VG53ED" );
        //instance.getListaPreVenta().add(preVenta);
        //instance.getListaVentas().add(preVenta.getVentaRealizar());
        //instance.getListaPreVenta().remove(preVenta);
        instance.realizarVenta(preVenta);
        assertEquals(0, instance.getListaPreVenta().size());
        
    }

    /**
     * Test of agregarArticulo method, of class Sistema.
     */
    @Test
    public void testAgregarArticulo() {
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        envases.add(e1);
        Articulo a = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        instance.agregarArticulo(a);
        ArrayList<Articulo> aux = instance.getListaArticulo();
        assertEquals(a, aux.get(0));
    }

    /**
     * Test of agregarPreVenta method, of class Sistema.
     */
    @Test
    public void testAgregarPreVenta() {
        ArrayList<NodoArticulo> listaArticulos = new ArrayList<NodoArticulo>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        envases.add(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        NodoArticulo na1 = new NodoArticulo(a1, 3, 2);
        listaArticulos.add(na1);
        Date fecha = new Date(116, 5, 3);
        Date fecha2 = new Date(120, 4, 6);
        Venta v = new Venta(listaArticulos, fecha);
        PreVenta preVenta = new PreVenta(fecha2, v, "VG53ED" );
        instance.agregarPreVenta(preVenta);
        ArrayList<PreVenta> aux = instance.getListaPreVenta();
        assertEquals(preVenta, aux.get(0));
    }
    /**
     * Test of preVentasAntesDeFecha method, of class Sistema.
     */
    @Test
    public void testGetPreVentaActual() {
        ArrayList<NodoArticulo> listaArticulos = new ArrayList<NodoArticulo>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        instance.agregarEnvase(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        NodoArticulo na1 = new NodoArticulo(a1, 3, 2);
        instance.agregarArticulo(a1);
        //listaArticulos.add(na1);
        Date fecha = new Date(116, 5, 3);
        Venta v = new Venta(listaArticulos, fecha);
        //instance.agregarArticulo(a1);
       // instance.agregarEnvase(e1);
        //instance.agregarVenta(v);
        PreVenta pv = new PreVenta();
        pv.setFecha(fecha);
        pv.setVentaRealizar(v);
        pv.setCodigo("123");
        instance.setPreventaActual(v);
        assertEquals(v, instance.getPreventaActual());
    }
    @Test
    public void testGetDonacionActual() {
        ArrayList<NodoArticulo> listaArticulos = new ArrayList<NodoArticulo>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        instance.agregarEnvase(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        NodoArticulo na1 = new NodoArticulo(a1, 3, 2);
        instance.agregarArticulo(a1);
        instance.getDonacionActual().add(na1);
        assertEquals(a1, instance.getDonacionActual().get(0).getArticulo());
    }
    @Test
    public void testSetDonacionActual() {
        ArrayList<NodoArticulo> listaArticulos = new ArrayList<NodoArticulo>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        instance.agregarEnvase(e1);
        Articulo a1 = new Articulo("bananas", "campo", 100, "organico", "AB543", envases, e1, "imagenBanana");
        NodoArticulo na1 = new NodoArticulo(a1, 3, 2);
        instance.agregarArticulo(a1);
        listaArticulos.add(na1);
        instance.setDonacionActual(listaArticulos);
        assertEquals(a1, instance.getDonacionActual().get(0).getArticulo());
    }
    @Test
    public void testSetListaEnvasesReutilizados() {
        ArrayList<NodoEnvase> listaEnvase = new ArrayList<NodoEnvase>();
        ArrayList<Envase> envases = new ArrayList<Envase>();
        Envase e1 = new Envase("plastico", "imagenEnvase", 3);
        instance.agregarEnvase(e1);
        NodoEnvase ne1 = new NodoEnvase(e1, 3);
        listaEnvase.add(ne1);
        instance.setListaEnvasesReutilizables(listaEnvase);
        assertEquals(e1, instance.getListaEnvasesReutilizables().get(0).getEnvase());
    }
    
    
}