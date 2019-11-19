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
public class NodoArticulo {

    Articulo articulo;
    int cantVendidas;
    
    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getCantVendidas() {
        return cantVendidas;
    }

    public void setCantVendidas(int cantVendidas) {
        this.cantVendidas = cantVendidas;
    }

    public NodoArticulo() {
        this.articulo = null;
        this.cantVendidas = 0;
    }
    
    public NodoArticulo(Articulo articulo, int cantVendidas) {
        this.articulo = articulo;
        this.cantVendidas = cantVendidas;
    }
    
    @Override
    public boolean equals(Object obj){
        return this.getArticulo().getNombre().equals(((NodoArticulo) obj).getArticulo().getNombre());
    }

}
