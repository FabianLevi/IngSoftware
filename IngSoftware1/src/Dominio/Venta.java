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
import java.util.Date;

public class Venta {
    
    //Atributos
    public ArrayList<Articulo> articulos;
    public PuntoDeVenta puntoDeVenta;
    public Usuario usuario;
    public Date fecha;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    //Constructores
    public Venta(ArrayList<Articulo> listaArticulos, PuntoDeVenta unPuntoDeVenta, Usuario unUsuario, int unMes,Date unaFecha) {
        articulos = listaArticulos;
        puntoDeVenta = unPuntoDeVenta;
        usuario = unUsuario;
        fecha=unaFecha;
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
