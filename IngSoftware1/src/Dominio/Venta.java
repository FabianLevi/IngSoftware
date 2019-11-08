/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author Fabian
 */
import java.util.ArrayList;

public class Venta {
    
    //Atributos
    public ArrayList<Articulo> articulos;
    public PuntoDeVenta puntoDeVenta;
    public Usuario usuario;
    
    //Constructores
    public Venta(ArrayList<Articulo> listaArticulos, PuntoDeVenta unPuntoDeVenta, Usuario unUsuario) {
        articulos = listaArticulos;
        puntoDeVenta = unPuntoDeVenta;
        usuario = unUsuario;
    }

    //Setters
    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    public void setPuntoDeVenta(PuntoDeVenta puntoDeVenta) {
        this.puntoDeVenta = puntoDeVenta;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    //Getters
    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public PuntoDeVenta getPuntoDeVenta() {
        return puntoDeVenta;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    
}
