/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Interfaz.Main;
import java.util.ArrayList;
import java.util.Date;
import javafx.util.Pair;

/**
 *
 * @author Fabian
 */
public class Sistema {


    //Atributos
    private ArrayList<Envase> listaEnvases;
    private ArrayList<Articulo> listaArticulo;
    private ArrayList<Venta> listaVentas;
    private ArrayList<PreVenta> listaPreVenta;
    //Atributos Auxiliares
    private ArrayList<NodoArticulo> listaArticulosVendidos;
    private ArrayList<NodoArticulo> listaArticulosMasVendidos;
    private ArrayList<NodoEnvase> listaEnvasesReutilizables;
    private int articulo;
    private Venta ventaActual;
    private Venta preventaActual;
    private int cantVentas;
    private ArrayList<NodoArticulo> donacionActual;
    private String nombreUsuarioVenta;
    private String numeroTarjetaUsuarioVenta;

    //Constructores
    public Sistema(ArrayList<Envase> unaListaEnvases, ArrayList<Articulo> unaListaArticulo,
            ArrayList<Venta> unaListaVentas, ArrayList<PreVenta> unaListaPreVenta,
            ArrayList<NodoArticulo> unaListaArticulosVendidos, ArrayList<NodoArticulo> unaListaArticulosMasVendidos, 
            ArrayList<NodoEnvase> unaListaEnvasesReutilizables, int num, Venta unaVenta, Venta unaPreventa, ArrayList<NodoArticulo> unaDonacionActual,
            String unNombreUsuarioVenta, String unNumeroTarjetaUsuarioVenta) {
        this.setArticulo(num);
        this.setListaEnvases(unaListaEnvases);
        this.setListaArticulo(unaListaArticulo);
        this.setListaVentas(unaListaVentas);
        this.setListaPreVenta(unaListaPreVenta);
        this.setListaArticulosVendidos(unaListaArticulosVendidos);
        this.setListaArticulosMasVendidos(unaListaArticulosMasVendidos);
        this.setListaEnvasesReutilizables(unaListaEnvasesReutilizables);
        this.setVentaActual(unaVenta);
        this.setPreventaActual(unaPreventa);
        this.setCantVentas(0);
        this.setDonacionActual(unaDonacionActual);
        this.setNombreUsuarioVenta(unNombreUsuarioVenta);
        this.setNumeroTarjetaUsuarioVenta(unNumeroTarjetaUsuarioVenta);
    }

    public Sistema() {
        this.setListaArticulo(new ArrayList<Articulo>());
        this.setListaEnvases(new ArrayList<Envase>());
        this.setListaPreVenta(new ArrayList<PreVenta>());
        this.setListaVentas(new ArrayList<Venta>());
        this.setListaArticulosVendidos(new ArrayList<NodoArticulo>());
        this.setListaArticulosMasVendidos(new ArrayList<NodoArticulo>());
        this.setListaEnvasesReutilizables( new ArrayList<NodoEnvase>());
        this.setArticulo(0);
        this.setVentaActual(null);
        this.setPreventaActual(null);
        this.setCantVentas(0);
        this.setDonacionActual(new ArrayList<NodoArticulo>());
        this.setNombreUsuarioVenta("");
        this.setNumeroTarjetaUsuarioVenta("");
    }

    //Getters & Setters
    public ArrayList<Envase> getListaEnvases() {
        return listaEnvases;
    }

    public void setListaEnvases(ArrayList<Envase> listaEnvases) {
        this.listaEnvases = listaEnvases;
    }

    public ArrayList<Articulo> getListaArticulo() {
        return listaArticulo;
    }

    public void setListaArticulo(ArrayList<Articulo> listaArticulo) {
        this.listaArticulo = listaArticulo;
    }

    public ArrayList<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(ArrayList<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    public ArrayList<PreVenta> getListaPreVenta() {
        return listaPreVenta;
    }

    public void setListaPreVenta(ArrayList<PreVenta> listaPreVenta) {
        this.listaPreVenta = listaPreVenta;
    }
   
    public ArrayList<NodoArticulo> getListaArticulosVendidos() {
        return listaArticulosVendidos;
    }

    public void setListaArticulosVendidos(ArrayList<NodoArticulo> listaArticulosVendidos) {
        this.listaArticulosVendidos = listaArticulosVendidos;
    }

    public ArrayList<NodoArticulo> getListaArticulosMasVendidos() {
        return listaArticulosMasVendidos;
    }

    public void setListaArticulosMasVendidos(ArrayList<NodoArticulo> listaArticulosMasVendidos) {
        this.listaArticulosMasVendidos = listaArticulosMasVendidos;
    }

    public int getCantVentas() {
        return cantVentas;
    }

    public void setCantVentas(int cantVentas) {
        this.cantVentas = cantVentas;
    }

    public int getArticulo() {
        return articulo;
    }

    public void setArticulo(int articulo) {
        this.articulo = articulo;
    }

    public Venta getVentaActual() {
        return ventaActual;
    }

    public void setVentaActual(Venta ventaActual) {
        this.ventaActual = ventaActual;
    }

    public ArrayList<NodoEnvase> getListaEnvasesReutilizables() {
        return listaEnvasesReutilizables;
    }

    public void setListaEnvasesReutilizables(ArrayList<NodoEnvase> listaEnvasesReutilizables) {
        this.listaEnvasesReutilizables = listaEnvasesReutilizables;
    }
    
    public ArrayList<NodoArticulo> getDonacionActual() {
        return donacionActual;
    }

    public void setDonacionActual(ArrayList<NodoArticulo> donacionActual) {
        this.donacionActual = donacionActual;
    }
    
    public Venta getPreventaActual() {
        return preventaActual;
    }

    public void setPreventaActual(Venta preventaActual) {
        this.preventaActual = preventaActual;
    }
    
    public String getNombreUsuarioVenta() {
        return nombreUsuarioVenta;
    }

    public void setNombreUsuarioVenta(String nombreUsuarioVenta) {
        this.nombreUsuarioVenta = nombreUsuarioVenta;
    }

    public String getNumeroTarjetaUsuarioVenta() {
        return numeroTarjetaUsuarioVenta;
    }

    public void setNumeroTarjetaUsuarioVenta(String numeroTarjetaUsuarioVenta) {
        this.numeroTarjetaUsuarioVenta = numeroTarjetaUsuarioVenta;
    }

    
    //Funciones
    //Agrega una venta a la lista y guarda los articulos vendidos y los envases reutilizados
    public void agregarVenta(Venta v) {
        this.getListaVentas().add(v);
        this.setCantVentas(this.getCantVentas() + 1);
        ArrayList<NodoArticulo> articulos = v.getArticulos();
        for (int i = 0; i < articulos.size(); i++) {
            int pos = 0;
            while (!(this.getListaArticulosVendidos().get(pos).articulo.getNombre().equals(articulos.get(i).getArticulo().getNombre()))) {
                pos++;
            }
            NodoArticulo nodo = this.getListaArticulosVendidos().get(pos);
            nodo.setCantVendidas(nodo.getCantVendidas() + v.getArticulos().get(i).getCantVendidas());
            nodo.setCantDonados(nodo.getCantDonados() - v.getArticulos().get(i).getCantVendidas());
            if (nodo.getCantDonados() < 0) {
                nodo.setCantDonados(0);
            }
            int posEnvase = 0;
            while (!(this.getListaEnvasesReutilizables().get(posEnvase).envase.getTipo().equals(articulos.get(i).getArticulo().getEnvaseElegido().getTipo()))) {
                posEnvase++;
            }
            NodoEnvase nodoEnvase = this.getListaEnvasesReutilizables().get(posEnvase);
            nodoEnvase.setCantVendidas(nodoEnvase.getCantVendidas() + v.getArticulos().get(i).getCantVendidas());
            if (this.getListaArticulosMasVendidos().isEmpty()) {
                this.getListaArticulosMasVendidos().add(nodo);
            }
            else {
                if (!this.getListaArticulosMasVendidos().contains(nodo) && this.getListaArticulosMasVendidos().get(0).cantVendidas == nodo.cantVendidas) {
                    this.getListaArticulosMasVendidos().add(nodo);
                } else {
                    if (this.getListaArticulosMasVendidos().contains(nodo)) {
                        this.getListaArticulosMasVendidos().clear();
                        this.getListaArticulosMasVendidos().add(nodo);
                    } else {
                        if (this.getListaArticulosMasVendidos().get(0).cantVendidas < nodo.cantVendidas) {
                            this.getListaArticulosMasVendidos().clear();
                            this.getListaArticulosMasVendidos().add(nodo);
                        }

                    }
                }

            }
        }
    }

    //Devuele una lista con los envases reutilizados
    public ArrayList<NodoEnvase> envasesReutilizables() {
        ArrayList<NodoEnvase> aux = new ArrayList<NodoEnvase>();
        for (int i = 0; i < this.getListaEnvasesReutilizables().size(); i++) {
            NodoEnvase nodo = this.getListaEnvasesReutilizables().get(i);
            aux.add(nodo);
          
        }
        return aux;
    }
     //Devuele una lista con los articulos mas vendidos
    public ArrayList<NodoArticulo> articulosMasVendidos() {
        ArrayList<NodoArticulo> aux = new ArrayList<NodoArticulo>();
        for (int i = 0; i < this.getListaArticulosMasVendidos().size(); i++) {
            NodoArticulo nodo = this.getListaArticulosMasVendidos().get(i);
            //Articulo a = nodo.articulo;
            aux.add(nodo);
        }
        return aux;
    }
     //Devuele la cantidad de ventas en mes
    public int cantidadDeVentasEnMes(int mes) {
        int cantVentas = 0;
        for (int i = 0; i < this.getListaVentas().size(); i++) {
            Venta v = this.getListaVentas().get(i);
            int mesVenta = v.getFecha().getMonth();
            if (mesVenta == mes) {
                cantVentas++;

            }
        }

        return cantVentas;
    }

    public void agregarEnvase(Envase e) {
        this.getListaEnvases().add(e);
        NodoEnvase nodo = new NodoEnvase(e, 0);
        this.getListaEnvasesReutilizables().add(nodo);
    }

     //Devuele una lista con las preventas antes de la fecha actual
    public ArrayList<PreVenta> preVentasAntesDeFecha() {
        ArrayList<PreVenta> aux = new ArrayList<PreVenta>();
        Date fechaActual = new Date();
        for (int i = 0; i < this.getListaPreVenta().size(); i++) {
            PreVenta p = this.getListaPreVenta().get(i);
            if ((p.getFecha().getMonth() == fechaActual.getMonth())) {
                if(p.getFecha().getDate() <= fechaActual.getDate()){
                    aux.add(p);
                }
            }else{
                if(p.getFecha().getMonth() < fechaActual.getMonth()){
                    aux.add(p);
                }
            }
        }
        return aux;
    }
     //Devuele una lista con las preventas despues de la fecha actual
    public ArrayList<PreVenta> preVentasDespuesDeFecha() {
        ArrayList<PreVenta> aux = new ArrayList<PreVenta>();
        Date fechaActual = new Date();
        for (int i = 0; i < this.getListaPreVenta().size(); i++) {
            PreVenta p = this.getListaPreVenta().get(i);
            if ((p.getFecha().getMonth()==fechaActual.getMonth())) {
                if(p.getFecha().getDate()>fechaActual.getDate()){
                    aux.add(p);
                }
            }else{
                if(p.getFecha().getMonth()>fechaActual.getMonth()){
                    aux.add(p);
                }
            }
        }
        return aux;
    }
    
    

    public void realizarVenta(PreVenta p) {
        this.agregarVenta(p.getVentaRealizar());
        this.getListaPreVenta().remove(p);
    }

    public void agregarArticulo(Articulo a) {
        this.getListaArticulo().add(a);
        NodoArticulo nodo = new NodoArticulo(a, 0, 0);
        nodo.articulo = a;
        nodo.cantVendidas = 0;
        this.getListaArticulosVendidos().add(nodo);
    }

    
    public void agregarPreVenta(PreVenta pv) {
        this.getListaPreVenta().add(pv);
    }

}
