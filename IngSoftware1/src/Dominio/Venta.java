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
    private ArrayList<NodoArticulo> articulos;
    private PuntoDeVenta puntoDeVenta;
    private Usuario usuario;
    private Date fecha;

    

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    //Constructores
    public Venta(ArrayList<NodoArticulo> listaArticulos, PuntoDeVenta unPuntoDeVenta, Usuario unUsuario,Date unaFecha) {
        articulos = listaArticulos;
        puntoDeVenta = unPuntoDeVenta;
        usuario = unUsuario;
        fecha=unaFecha;
    }

    public Venta(){
        articulos = null;
        puntoDeVenta = null;
        usuario = null;
        fecha=null;
    }
    //Setters
    public void setArticulos(ArrayList<NodoArticulo> articulos) {
        this.articulos = articulos;
    }

    public void setPuntoDeVenta(PuntoDeVenta puntoDeVenta) {
        this.puntoDeVenta = puntoDeVenta;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    //Getters
    public ArrayList<NodoArticulo> getArticulos() {
        return articulos;
    }

    public PuntoDeVenta getPuntoDeVenta() {
        return puntoDeVenta;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    
}
