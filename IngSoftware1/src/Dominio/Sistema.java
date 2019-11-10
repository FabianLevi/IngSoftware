/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.ArrayList;

/**
 *
 * @author Fabian
 */
public class Sistema {
    
    class NodoArticulo {
        String nombre;
        String codigo;
        int cantVendidas;
    }
    
    //Atributos
    private ArrayList<Envase> listaEnvases;
    private ArrayList<Articulo> listaArticulo;
    private ArrayList<PuntoDeVenta> listaPuntoDeVenta;
    private ArrayList<Venta> listaVentas;
    private ArrayList<PreVenta> listaPreVenta;
    private ArrayList<Usuario> listaUsuario;
    //Atributos Auxiliares
    private ArrayList<NodoArticulo> listaArticulosVendidos;
    private ArrayList<NodoArticulo> listaArticulosMasVendidos;
    private ArrayList<Envase>listaEnvasesReutilizables;

    public ArrayList<Envase> getListaEnvasesReutilizables() {
        return listaEnvasesReutilizables;
    }

    public void setListaEnvasesReutilizables(ArrayList<Envase> listaEnvasesReutilizables) {
        this.listaEnvasesReutilizables = listaEnvasesReutilizables;
    }

    
    
    //Constructores
    public Sistema(ArrayList<Envase> unaListaEnvases, ArrayList<Articulo> unaListaArticulo, ArrayList<PuntoDeVenta> unaListaPuntoDeVenta, 
            ArrayList<Venta> unaListaVentas, ArrayList<PreVenta> unaListaPreVenta, ArrayList<Usuario> unaListaUsuario, 
            ArrayList<NodoArticulo> unaListaArticulosVendidos, ArrayList<NodoArticulo> unaListaArticulosMasVendidos,ArrayList<Envase>unaListaEnvasesReutilizables) {
        this.listaEnvases = unaListaEnvases;
        this.listaArticulo = unaListaArticulo;
        this.listaPuntoDeVenta = unaListaPuntoDeVenta;
        this.listaVentas = unaListaVentas;
        this.listaPreVenta = unaListaPreVenta;
        this.listaUsuario = unaListaUsuario;
        this.listaArticulosVendidos = unaListaArticulosVendidos;
        this.listaArticulosMasVendidos = unaListaArticulosMasVendidos;
        this.listaEnvasesReutilizables=unaListaEnvasesReutilizables;
    }
    
    public Sistema(){
        this.listaArticulo = new ArrayList<Articulo>();
        this.listaEnvases = new ArrayList<Envase>();
        this.listaPreVenta = new ArrayList<PreVenta>();
        this.listaPuntoDeVenta = new ArrayList<PuntoDeVenta>();
        this.listaUsuario = new ArrayList<Usuario>();
        this.listaVentas = new ArrayList<Venta>();
        this.listaArticulosVendidos = new ArrayList<NodoArticulo>();
        this.listaArticulosMasVendidos = new ArrayList<NodoArticulo>();
        this.listaEnvasesReutilizables = new ArrayList<Envase>();
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

    public ArrayList<PuntoDeVenta> getListaPuntoDeVenta() {
        return listaPuntoDeVenta;
    }

    public void setListaPuntoDeVenta(ArrayList<PuntoDeVenta> listaPuntoDeVenta) {
        this.listaPuntoDeVenta = listaPuntoDeVenta;
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

    public ArrayList<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(ArrayList<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
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
    
    public boolean existeAlias(String alias) {
        //Método que recibe un alias (String) y devuelve true si el alias ya existe en otro jugador y false en el caso contrario
        boolean esta = false;
        if (!this.getListaUsuario().isEmpty()) {
            for (int i = 0; i < this.getListaUsuario().size() && !esta; i++) {
                Usuario u = this.getListaUsuario().get(i);
                if (u.getAlias().equals(alias)) {
                    esta = true;
                }
            }
        }
        return esta;
    }
    
    public boolean agregarUsuario(String nombre, int edad, String mail, String alias) {
        //Método que recibe un nombre (String), un alias (String) y una edad (int) y devuelve true si pudo crear al jugador y agregaro a la lista 
        //o false si no pudo hacerlo. Esto depende de si existe o no el alias recibido en otro jugador
        boolean ok = false;
        if (!existeAlias(alias)) {
            Usuario u = new Usuario(nombre,edad, mail, alias);
            this.getListaUsuario().add(u);
            ok = true;
        }
        return ok;
    }
    
    public void agregarVenta(Venta v){
        this.getListaVentas().add(v);
        ArrayList<Articulo> articulos = v.getArticulos();
        for (int i = 0; i < articulos.size(); i++) {
            int pos = this.getListaArticulosVendidos().indexOf(articulos.get(i));
            NodoArticulo nodo = this.getListaArticulosVendidos().get(pos);
            nodo.cantVendidas++;
            this.getListaEnvases().add(articulos.get(i).getEnvaseElegido());
            if (this.getListaArticulosMasVendidos().isEmpty() || this.getListaArticulosMasVendidos().get(0).cantVendidas == nodo.cantVendidas ) {
                this.getListaArticulosMasVendidos().add(nodo);
            }
            else {
                if (this.getListaArticulosMasVendidos().get(0).cantVendidas < nodo.cantVendidas) {
                    this.getListaArticulosMasVendidos().clear();
                    this.getListaArticulosMasVendidos().add(nodo);
                }
            }
        }
    }
    
    public ArrayList<Envase>envasesReutilizables(){
        return this.getListaEnvasesReutilizables();
    }
    
    public ArrayList<Articulo> articulosMasVendidos(){
        ArrayList<Articulo> aux = new ArrayList<Articulo>();
        int cantVendidas=0;
        for (int i = 0; i < this.getListaArticulosMasVendidos().size(); i++) {
            NodoArticulo nodo =this.getListaArticulosMasVendidos().get(i);
            for (int j = 0; j < this.getListaArticulo().size(); j++) {
                Articulo a = this.getListaArticulo().get(j);
                if(nodo.codigo==a.getCodigo()){
                    aux.add(a);
                }
            }
        }
        return aux;
    }
    
    public int cantidadDeVentasEnMes(int mes){
        int cantVentas=0;
        for (int i = 0; i < this.getListaVentas().size(); i++) {
            Venta v = this.getListaVentas().get(i);
            if(v.getFecha().getMonth()==mes){
                cantVentas++;
            }
        }
        // duda de si es necesario
        for (int i = 0; i < this.getListaPreVenta().size(); i++) {
            PreVenta p = this.getListaPreVenta().get(i);
            if(p.getFecha().getMonth()==mes){
                cantVentas++;
            }
        }
        
        return cantVentas;
    }
    
    public void agregarEnvase(Envase e){
        this.getListaEnvases().add(e);
    }
    public void agregarArticulo(Articulo a){
        this.getListaArticulo().add(a);
        NodoArticulo nodo = new NodoArticulo();
        nodo.nombre = a.getNombre();
        nodo.codigo = a.getCodigo();
        nodo.cantVendidas = 0;
        this.getListaArticulosVendidos().add(nodo);
    }
    public void agregarPuntoVenta(PuntoDeVenta p){
        this.getListaPuntoDeVenta().add(p);
    }
    public void agregarPreVenta(PreVenta pv){
        this.getListaPreVenta().add(pv);
    }
    
    
    
}
