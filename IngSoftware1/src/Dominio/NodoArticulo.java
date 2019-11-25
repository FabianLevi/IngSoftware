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

    //Atributos no privados porque accedo desde sistema
     Articulo articulo;
     int cantVendidas;
     int cantDonados;
    
    
    //Constructores
    public NodoArticulo() {
        this.setArticulo(null);
        this.setCantDonados(0);
        this.setCantVendidas(0);
    }
    
    public NodoArticulo(Articulo unArticulo, int unaCantVendidas, int unaCantDonados) {
        this.setArticulo(unArticulo);
        this.setCantDonados(unaCantDonados);
        this.setCantVendidas(unaCantVendidas);
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
