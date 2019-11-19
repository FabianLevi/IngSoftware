/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author Darío
 */
public class ArticuloTabla {
    
    private String nombre;
    private int precio;
    private int cantVendidas;

    //Constructores
    public ArticuloTabla() {
        this.nombre = "";
        this.precio = 0;
        this.cantVendidas = 0;
    }
    
    public ArticuloTabla(String unNombre, int unPrecio, int unaCantVendidas) {
        this.nombre = unNombre;
        this.precio = unPrecio;
        this.cantVendidas = unaCantVendidas;
    }
    
    //Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantVendidas() {
        return cantVendidas;
    }

    public void setCantVendidas(int cantVendidas) {
        this.cantVendidas = cantVendidas;
    }
}
