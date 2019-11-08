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

    public Sistema(ArrayList<Envase> listaEnvases, ArrayList<Articulo> listaArticulo, ArrayList<PuntoDeVenta> listaPuntoDeVenta, ArrayList<Venta> listaVentas, ArrayList<PreVenta> listaPreVenta, ArrayList<Usuario> listaUsuario) {
        this.listaEnvases = listaEnvases;
        this.listaArticulo = listaArticulo;
        this.listaPuntoDeVenta = listaPuntoDeVenta;
        this.listaVentas = listaVentas;
        this.listaPreVenta = listaPreVenta;
        this.listaUsuario = listaUsuario;
    }
    
    public Sistema(){
        this.listaArticulo = new ArrayList<Articulo>();
        this.listaEnvases = new ArrayList<Envase>();
        this.listaPreVenta = new ArrayList<PreVenta>();
        this.listaPuntoDeVenta = new ArrayList<PuntoDeVenta>();
        this.listaUsuario = new ArrayList<Usuario>();
        this.listaVentas = new ArrayList<Venta>();
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
    }
    public void agregarEnvase(Envase e){
        this.getListaEnvases().add(e);
    }
    public void agregarArticulo(Articulo a){
        this.getListaArticulo().add(a);
    }
    public void agregarPuntoVenta(PuntoDeVenta p){
        this.getListaPuntoDeVenta().add(p);
    }
    public void agregarPreVenta(PreVenta pv){
        this.getListaPreVenta().add(pv);
    }
    
        private ArrayList<Envase> listaEnvases;
        private ArrayList<Articulo> listaArticulo;
        private ArrayList<PuntoDeVenta> listaPuntoDeVenta;
        private ArrayList<Venta> listaVentas;
        private ArrayList<PreVenta> listaPreVenta;
        private ArrayList<Usuario> listaUsuario;
    
}
