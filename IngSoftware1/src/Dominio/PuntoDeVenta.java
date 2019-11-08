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
public class PuntoDeVenta {
    
    //Atributos
    private String direccion;
    
    //Constructor
    public PuntoDeVenta(String unaDireccion) {
        direccion = unaDireccion;
    }
    
    //Getter
    public String getDireccion() {
        return direccion;
    }
    
    //Setter
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
