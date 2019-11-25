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
        this.setNombre("");
        this.setCantVendidas(0);
        this.setPrecio(0);
    }
    
    public ArticuloTabla(String unNombre, int unPrecio, int unaCantVendidas) {
        this.setCantVendidas(unaCantVendidas);
        this.setNombre(unNombre);
        this.setPrecio(unPrecio);
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
    
    @Override
    public boolean equals(Object obj) {
        return this.getNombre().equals(((ArticuloTabla) obj).getNombre());    
    }
}
