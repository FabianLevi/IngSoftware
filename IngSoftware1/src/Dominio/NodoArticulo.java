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

    //Atributos
    Articulo articulo;
    int cantVendidas;
    int cantDonados;
    
    
    //Constructores
    public NodoArticulo() {
        this.articulo = null;
        this.cantVendidas = 0;
        this.cantDonados = 0;
    }
    
    public NodoArticulo(Articulo unArticulo, int unaCantVendidas, int unaCantDonados) {
        this.articulo = unArticulo;
        this.cantVendidas = unaCantVendidas;
        this.cantDonados = unaCantDonados;
    }
    
    
    //Getters & Setters
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
    
    public int getCantDonados() {
        return cantDonados;
    }

    public void setCantDonados(int cantDonados) {
        this.cantDonados = cantDonados;
    }
    
    
    //Métodos sobreescritos
    @Override
    public boolean equals(Object obj){
        return this.getArticulo().getNombre().equals(((NodoArticulo) obj).getArticulo().getNombre());
    }

}
